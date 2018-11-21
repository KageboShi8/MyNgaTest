package com.example.kageboshi.myngatest.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.kageboshi.myngatest.R;
import com.example.kageboshi.myngatest.Utils.Constants;
import com.example.kageboshi.myngatest.adapters.GradeFragmentGalleryAdapter;
import com.example.kageboshi.myngatest.adapters.GradeFragmentRecyclerAdapter;
import com.example.kageboshi.myngatest.http.RetrofitFactory;
import com.example.kageboshi.myngatest.http.models.GradeTotalModel;


import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.example.kageboshi.myngatest.Utils.Constants.DEBUG_TAG;

public class GameFragment extends Fragment {

    private LinearLayout grade_vp_gallery;
    private AppCompatSpinner fragment_spinner1;
    private AppCompatSpinner fragment_spinner2;
    private AppCompatSpinner fragment_spinner3;
    private RecyclerView fragment_vp_recycler;
    private RecyclerView fragment_vp_gallery;
    private String platform = "";
    private GradeTotalModel httpData = new GradeTotalModel();


    public static GameFragment newInstance(String platform) {
        GameFragment fragment = new GameFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.GRADE_SERIALIZED_KEY, platform);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(DEBUG_TAG, "onCreateView");
        platform = (getArguments().getString(Constants.GRADE_SERIALIZED_KEY));
        return inflater.inflate(R.layout.fragment_subgrade_pcgame, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        initView(view);
        Log.e(DEBUG_TAG, "onViewCreate");
        if (platform != "" && null != platform) {
            Log.e(DEBUG_TAG, platform);
            initHttpData();
        } else {
            Log.e(DEBUG_TAG, "network error");
        }
    }

    private void initView(View view) {
        fragment_vp_gallery = ((RecyclerView) view.findViewById(R.id.grade_vp_fragment_gallery));
        fragment_vp_recycler = ((RecyclerView) view.findViewById(R.id.grade_vp_fragment_recyclerView));
    }

    private void initHttpData() {
        RetrofitFactory.getInstance(getContext()).getGradeFragmentData("game", "query", platform)
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GradeTotalModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GradeTotalModel gradeTotalModel) {
//                        Log.e("response", "getDataGrade ok");
                        int code = gradeTotalModel.getCode();
//                        Log.e("response", "code=" + code);
                        String msg = gradeTotalModel.getMsg();
//                        Log.e("response", "msg=" + msg);
                        if (code == 0 && msg.equals(Constants.HTTP_SUCCESS_MSG)) {
                            httpData = gradeTotalModel;
//                            int size = httpData.getResult().getTop_games().size();
//                            Log.d(DEBUG_TAG, "size=" + size);
                            initGallery();
                            initRecyclerList();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(DEBUG_TAG, "network error");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


    private void initGallery() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        fragment_vp_gallery.setLayoutManager(layoutManager);
        layoutManager.setOrientation(OrientationHelper.HORIZONTAL);
        GradeFragmentGalleryAdapter galleryAdapter = new GradeFragmentGalleryAdapter(getContext(), httpData.getResult().getTop_games());
        fragment_vp_gallery.setAdapter(galleryAdapter);
    }

    private void initRecyclerList() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext()) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        fragment_vp_recycler.setLayoutManager(layoutManager);
        layoutManager.setOrientation(OrientationHelper.VERTICAL);

        GradeFragmentRecyclerAdapter recyclerAdapter = new GradeFragmentRecyclerAdapter(getContext(), httpData.getResult().getGames());

        fragment_vp_recycler.setAdapter(recyclerAdapter);
        fragment_vp_recycler.setNestedScrollingEnabled(false);
        fragment_vp_recycler.setHasFixedSize(true);
        fragment_vp_recycler.setFocusable(false);


    }

    private void initHorizontalScrollView(View view) {
        // TODO: 18-10-23 整个填充有问题　东西虽然进去了　大小却完全不收我控制
        grade_vp_gallery = ((LinearLayout) view.findViewById(R.id.grade_vp_fragment_gallery));
        List<GradeTotalModel.ResultBean.TopGamesBean> topGamesBeanList = httpData.getResult().getTop_games();
        for (int i = 0; i < topGamesBeanList.size(); i++) {
            View item_view = LayoutInflater.from(getContext()).inflate(R.layout.item_gallery, grade_vp_gallery, false);
            TextView text_title_item_view = (TextView) item_view.findViewById(R.id.text_title_gallery_item);
            TextView text_bottom_item_view = (TextView) item_view.findViewById(R.id.text_bottom_gallery_item);
            ImageView image_item_view = (ImageView) item_view.findViewById(R.id.image_gallery_item);

            String name = topGamesBeanList.get(i).getName();
            String imgUrl = topGamesBeanList.get(i).getAvatar();
            String score = topGamesBeanList.get(i).getScore();


            text_bottom_item_view.setText(name);
            text_title_item_view.setText("No." + i + "   " + score);
            Glide.with(this).load(imgUrl).into(image_item_view);

            grade_vp_gallery.addView(item_view);
        }
    }

    private void initSpinner(View view) {
        fragment_spinner1 = ((AppCompatSpinner) view.findViewById(R.id.grade_vp_fragment_spinner1));
        fragment_spinner2 = ((AppCompatSpinner) view.findViewById(R.id.grade_vp_fragment_spinner2));
        fragment_spinner3 = ((AppCompatSpinner) view.findViewById(R.id.grade_vp_fragment_spinner3));

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, getData());
        fragment_spinner1.setAdapter(spinnerAdapter);
        fragment_spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "选中了" + parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    //todo 假的spinner数据
    private List<String> getData() {
        List<String> spinnerDataList = new ArrayList<String>();
        spinnerDataList.add("北京");
        spinnerDataList.add("上海");
        spinnerDataList.add("南京");
        spinnerDataList.add("宜昌");
        return spinnerDataList;

    }
}
