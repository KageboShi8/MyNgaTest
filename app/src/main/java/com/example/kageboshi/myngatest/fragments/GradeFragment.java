package com.example.kageboshi.myngatest.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kageboshi.myngatest.R;
import com.example.kageboshi.myngatest.Utils.Constants;
import com.example.kageboshi.myngatest.adapters.MyPagerAdapter;
import com.example.kageboshi.myngatest.http.RetrofitFactory;
import com.example.kageboshi.myngatest.http.models.GradeTitleModel;


import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.example.kageboshi.myngatest.Utils.Constants.DEBUG_TAG;


public class GradeFragment extends Fragment {

    private TabLayout tabLayout_grade;
    private View shadow_line_grade;
    private ViewPager viewPager_grade;
    private TextView tv_home_header;
    private ImageButton ib_home_search;

    private List<Fragment> fragmentList = new ArrayList<Fragment>();
    private List<String> list_Title = new ArrayList<String>();


    private GradeTitleModel httpData = new GradeTitleModel();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_grade_list, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tabLayout_grade = ((TabLayout) view.findViewById(R.id.home_grade_tablayout));
        shadow_line_grade = view.findViewById(R.id.shadow_line);
        viewPager_grade = ((ViewPager) view.findViewById(R.id.home_grade_vp));
        tv_home_header = ((TextView) view.findViewById(R.id.home_layout_header));
        ib_home_search = ((ImageButton) view.findViewById(R.id.home_search_ib));

        initHttpData();

    }

    private void initHttpData() {

        RetrofitFactory.getInstance(getContext()).getGradeTitle("game", "items")
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GradeTitleModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GradeTitleModel gradeTitleModel) {
                        Log.e("response", "getDataGrade ok");
                        int code = gradeTitleModel.getCode();
                        Log.e("response", "code=" + code);
                        String msg = gradeTitleModel.getMsg();
                        Log.e("response", "msg=" + msg);
                        if (code == 0 && msg.equals(Constants.HTTP_SUCCESS_MSG)) {
                            httpData = gradeTitleModel;
                            initDataWrapper();
                            initFragment();
                        } else {
                            Toast.makeText(getContext(), "网络请求失败", Toast.LENGTH_SHORT).show();
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

    private void initDataWrapper() {
        initPagerTitle();

        // initGalleryData();
        // initRecyclerData();
    }

    private void initFragment() {
        for (int i = 0; i < httpData.getResult().getItems().getCategories().size(); i++) {
            List<Integer> platform_ids = httpData.getResult().getItems().getCategories().get(i).getPlatform_ids();
            String platformTrans = dataFormat(platform_ids);
            fragmentList.add(GameFragment.newInstance(platformTrans));
        }

//        fragmentList.add(GameFragment.newInstance());
//        fragmentList.add(GameFragment.newInstance());
//        fragmentList.add(GameFragment.newInstance());

        // GameFragment gameFragment = GameFragment.newInstance(httpData);

        if (list_Title.size() > 0) {
            viewPager_grade.setAdapter(new MyPagerAdapter(getChildFragmentManager(), getContext(), fragmentList, list_Title));
            tabLayout_grade.setupWithViewPager(viewPager_grade);
        }

    }

    private void initPagerTitle() {
        if (httpData.getResult().getItems().getCategories().size() > 0) {
            for (int i = 0; i < httpData.getResult().getItems().getCategories().size(); i++) {
                String name = httpData.getResult().getItems().getCategories()
                        .get(i).getName();
                list_Title.add(name);
            }
        } else {
            Log.e("response", "httpData 无　title数据");
        }

    }

    private String dataFormat(List<Integer> platforms) {
        String platformTrans = "";
        for (int i = 0; i < platforms.size(); i++) {
            if (i != platforms.size()-1) {
                platformTrans = platformTrans + platforms.get(i) + ",";
            } else if (i == platforms.size()-1) {
                platformTrans = platformTrans + platforms.get(i);
            }
        }
        Log.e(DEBUG_TAG, platformTrans);
        return platformTrans;
    }

//    private void initGalleryData() {
//        if (httpData.getResult().getTop_games().size() > 0) {
//            top_gamesList = httpData.getResult().getTop_games();
//        }
//    }

//    private void initRecyclerData() {
//        if (httpData.getResult().getGames().size() > 0) {
//            gamesList = httpData.getResult().getGames();
//        }
//    }


}
