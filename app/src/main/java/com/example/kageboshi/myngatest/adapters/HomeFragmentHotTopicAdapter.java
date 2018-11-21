package com.example.kageboshi.myngatest.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.kageboshi.myngatest.R;
import com.example.kageboshi.myngatest.http.models.HomeHotTopicModel;

import java.util.ArrayList;
import java.util.List;

import static com.example.kageboshi.myngatest.Utils.Constants.DEBUG_TAG;


public class HomeFragmentHotTopicAdapter extends RecyclerView.Adapter<HomeFragmentHotTopicAdapter.MyViewHolder> {
    private List<HomeHotTopicModel.ResultBean> data = new ArrayList<HomeHotTopicModel.ResultBean>();
    private Context context;

    public HomeFragmentHotTopicAdapter(Context context, List<HomeHotTopicModel.ResultBean> data) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_fragment_home_hot_topic, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.textSubject.setText(data.get(i).getSubject());
        Log.e(DEBUG_TAG,data.get(i).getSubject());
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView textSubject;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textSubject = ((TextView) itemView.findViewById(R.id.text_subject));
        }
    }
}
