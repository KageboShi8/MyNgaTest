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
import com.example.kageboshi.myngatest.http.models.GradeTotalModel;


import java.util.ArrayList;
import java.util.List;

public class GradeFragmentGalleryAdapter extends RecyclerView.Adapter<GradeFragmentGalleryAdapter.MyViewHolder> {
    private Context context;
    private List<GradeTotalModel.ResultBean.TopGamesBean> data = new ArrayList<GradeTotalModel.ResultBean.TopGamesBean>();

    public GradeFragmentGalleryAdapter(Context context, List<GradeTotalModel.ResultBean.TopGamesBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_gallery, viewGroup, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        int rate = i + 1;
        myViewHolder.text_top_gallery.setText("No." + rate + "     " + data.get(i).getScore());
        myViewHolder.text_bottom_gallery.setText(data.get(i).getName());
        GlideUtil.GlideStrategy(context, data.get(i).getAvatar(), myViewHolder.image_gallery);
        //  Glide.with(context).load(data.get(i).getAvatar()).into(myViewHolder.image_gallery);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView text_top_gallery;
        private final TextView text_bottom_gallery;
        private final ImageView image_gallery;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text_top_gallery = ((TextView) itemView.findViewById(R.id.text_title_gallery_item));
            text_bottom_gallery = ((TextView) itemView.findViewById(R.id.text_bottom_gallery_item));
            image_gallery = ((ImageView) itemView.findViewById(R.id.image_gallery_item));
        }
    }
}
