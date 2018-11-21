package com.example.kageboshi.myngatest.http;


import com.example.kageboshi.myngatest.http.models.GradeTitleModel;
import com.example.kageboshi.myngatest.http.models.GradeTotalModel;
import com.example.kageboshi.myngatest.http.models.HomeHotTopicModel;
import com.example.kageboshi.myngatest.http.models.RecommendTotalModel;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitService {

    //评分页面三个碎片的DATA 根据platform区分三个页面
    @POST("app_api.php")
    Observable<GradeTotalModel> getGradeFragmentData(@Query("__lib") String lib, @Query("__act") String act, @Query("platform") String platform);

    //评分页面三个碎片的title和spinner的内容
    @POST("app_api.php")
    Observable<GradeTitleModel> getGradeTitle(@Query("__lib") String lib, @Query("__act") String act);

    //推荐页面的DATA
    @POST("app_api.php")
    Observable<RecommendTotalModel> getRecommendData(@Query("__lib") String lib, @Query("__act") String act);

    @POST("nuke.php")
    Observable<HomeHotTopicModel> getHotTopicData(@Query("__lib") String lib, @Query("__act") String act, @Query("__output") String value);

}
