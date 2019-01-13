package com.example.kageboshi.myngatest.fragments;

import android.graphics.drawable.Drawable;
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
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.kageboshi.myngatest.R;
import com.example.kageboshi.myngatest.Utils.ScreenUtils;
import com.example.kageboshi.myngatest.adapters.HomeFragmentGalleryAdapter;
import com.example.kageboshi.myngatest.adapters.HomeFragmentHotTopicAdapter;
import com.example.kageboshi.myngatest.http.RetrofitFactory;
import com.example.kageboshi.myngatest.http.models.HomeHotTopicModel;


import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.example.kageboshi.myngatest.Utils.Constants.DEBUG_TAG;


public class    HomeFragment extends Fragment implements View.OnClickListener {

    private ImageView image_header;
    private RecyclerView recycler_topic;
    private RecyclerView recycler_more_function;
    private HomeHotTopicModel httpData = new HomeHotTopicModel();

    private List<Drawable> galleryDrawableList = new ArrayList<Drawable>();
    private List<String> galleryNameList = new ArrayList<String>();
    private ImageButton imageButton_refresh;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        initView(view);
        initHttpData();
        initFunctionGallery();
    }

    private void initView(View view) {
        image_header = ((ImageView) view.findViewById(R.id.home_fragment_image));
        recycler_topic = ((RecyclerView) view.findViewById(R.id.home_fragment_topic_recycler));
        recycler_more_function = ((RecyclerView) view.findViewById(R.id.recycler_more_function));
        imageButton_refresh = ((ImageButton) view.findViewById(R.id.home_fragement_topic_refreshButton));
        imageButton_refresh.setOnClickListener(this);
    }

    private void initHttpData() {
        RetrofitFactory.getInstance(getContext()).getHotTopicData("load_topic", "load_topic_reply_ladder", "12")
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeHotTopicModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomeHotTopicModel homeHotTopicModel) {
                        Log.e("response", "getData ok");
                        int code = homeHotTopicModel.getCode();
                        Log.e("response", "code=" + code);
                        if (code == 0) {
                            httpData = homeHotTopicModel;
                            Log.e(DEBUG_TAG,homeHotTopicModel.getResult().size()+"");
                            Log.e(DEBUG_TAG, homeHotTopicModel.getResult().get(0).getSubject());
                            initRecycler();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void initFunctionGallery() {
        initGalleryData();
        HomeFragmentGalleryAdapter adapter = new HomeFragmentGalleryAdapter(getContext(), galleryNameList, galleryDrawableList, ScreenUtils.getWidth(getContext()) / 6);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recycler_more_function.setLayoutManager(layoutManager);
        layoutManager.setOrientation(OrientationHelper.HORIZONTAL);
        recycler_more_function.setAdapter(adapter);
    }

    private void initRecycler() {
        HomeFragmentHotTopicAdapter adapter = new HomeFragmentHotTopicAdapter(getContext(), httpData.getResult());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recycler_topic.setLayoutManager(layoutManager);
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        recycler_topic.setAdapter(adapter);
    }

    private void initGalleryData() {
        galleryDrawableList.add(getResources().getDrawable(R.drawable.hot_game_home));
        galleryDrawableList.add(getResources().getDrawable(R.drawable.hot_program_home));
        galleryDrawableList.add(getResources().getDrawable(R.drawable.hot_supermarket_home));
        galleryDrawableList.add(getResources().getDrawable(R.drawable.hot_team_home));
        galleryDrawableList.add(getResources().getDrawable(R.drawable.hot_scan_home));
        galleryDrawableList.add(getResources().getDrawable(R.drawable.hot_setting_home));


        galleryNameList.add(getString(R.string.home_game_strg));
        galleryNameList.add(getString(R.string.home_program_strg));
        galleryNameList.add(getString(R.string.home_supermarket_strg));
        galleryNameList.add(getString(R.string.home_team_strg));
        galleryNameList.add(getString(R.string.home_scan_strg));
        galleryNameList.add(getString(R.string.home_setting_strg));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_fragement_topic_refreshButton:
                initHttpData();
                break;
        }
    }
}
