package com.example.kageboshi.myngatest.http;

import android.content.Context;

import com.example.kageboshi.myngatest.Utils.Constants;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    private static RetrofitService retrofitService;
    private static Retrofit retrofit;

    public static RetrofitService getInstance(Context context) {
        if (null == retrofitService) {
            synchronized (RetrofitFactory.class) {
                if (null == retrofitService) {
                    retrofitService = getInstanceRetrofit(context).create(RetrofitService.class);
                }
            }
        }
        return retrofitService;
    }
    private static Retrofit getInstanceRetrofit(Context context) {

        if (null == retrofit) {
            synchronized (RetrofitFactory.class) {
                if (null == retrofit) {
                    retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .build();
                }
            }
        }
        return retrofit;
    }
}
