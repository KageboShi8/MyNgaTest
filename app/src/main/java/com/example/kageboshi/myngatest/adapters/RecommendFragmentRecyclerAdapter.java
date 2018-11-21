package com.example.kageboshi.myngatest.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kageboshi.myngatest.R;
import com.example.kageboshi.myngatest.Utils.GlideUtil;
import com.example.kageboshi.myngatest.http.models.RecommendTotalModel;


public class RecommendFragmentRecyclerAdapter extends RecyclerView.Adapter<RecommendFragmentRecyclerAdapter.MyViewHolder> {

    private Context context;
    private RecommendTotalModel data;


    public RecommendFragmentRecyclerAdapter(Context context, RecommendTotalModel data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_recommend, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        String subject = data.getResult().get(i).getSubject();
        String url = data.getResult().get(i).getThread_icon();

        myViewHolder.textRecommendList.setTextColor(context.getResources().getColor(R.color.transparent_white));
        myViewHolder.textRecommendList.setText(subject);
        GlideUtil.GlideStrategy(context, url, myViewHolder.imageRecommendList);


    }


    @Override
    public int getItemCount() {
        return data.getResult().size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageRecommendList;
        private final TextView textRecommendList;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageRecommendList = ((ImageView) itemView.findViewById(R.id.image_recommend_list));
            textRecommendList = ((TextView) itemView.findViewById(R.id.text_recommend_list));
        }
    }
}
