package com.example.kageboshi.myngatest.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kageboshi.myngatest.R;
import com.example.kageboshi.myngatest.Utils.Constants;
import com.example.kageboshi.myngatest.adapters.RecommendFragmentRecyclerAdapter;
import com.example.kageboshi.myngatest.http.RetrofitFactory;
import com.example.kageboshi.myngatest.http.models.GradeTotalModel;
import com.example.kageboshi.myngatest.http.models.RecommendTotalModel;


import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class RecommendChildFragment extends Fragment {

    private RecyclerView childRecommendRecycler;
    private RecommendTotalModel httpData = new RecommendTotalModel();


    public static RecommendChildFragment newInstance(GradeTotalModel model) {
        RecommendChildFragment fragment = new RecommendChildFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_child_recommend, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        childRecommendRecycler = ((RecyclerView) view.findViewById(R.id.recommend_child_fragment_recycler));
        initHttpData();

    }

    private void initHttpData() {
        RetrofitFactory.getInstance(getContext()).getRecommendData("home", "recmthreads")
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RecommendTotalModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RecommendTotalModel recommendTotalModel) {
                        Log.e("response", "getData ok");
                        int code = recommendTotalModel.getCode();
                        Log.e("response", "code=" + code);
                        String msg = recommendTotalModel.getMsg();
                        Log.e("response", "msg=" + msg);
                        if (code == 0 && msg.equals(Constants.HTTP_SUCCESS_MSG)) {
                            httpData = recommendTotalModel;
                            initRecycler();
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("response", "getData error");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void initRecycler() {
        RecommendFragmentRecyclerAdapter adapter = new RecommendFragmentRecyclerAdapter(getContext(),httpData);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        childRecommendRecycler.setLayoutManager(layoutManager);
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        childRecommendRecycler.setAdapter(adapter);
    }
}
