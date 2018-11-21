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

public class GradeFragmentRecyclerAdapter extends RecyclerView.Adapter<GradeFragmentRecyclerAdapter.MyViewHolder> {

    private Context context;
    private List<GradeTotalModel.ResultBean.GamesBean> data = new ArrayList<GradeTotalModel.ResultBean.GamesBean>();

    public GradeFragmentRecyclerAdapter(Context context, List<GradeTotalModel.ResultBean.GamesBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_grade_list, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        String date = data.get(i).getRelease_info().get(0).getDate();
        String imgURL = data.get(i).getAvatar();
        String name = data.get(i).getName();

        //viewHolder.dateTextItem.setTextColor(context.getResources().getColor(R.color.transparent_white));

        viewHolder.dateTextItem.setText(date);
        viewHolder.nameTextItem.setText(name);
       // Glide.with(context).load(imgURL).into(viewHolder.imageItem);

        GlideUtil.GlideStrategy(context,imgURL,viewHolder.imageItem);
      //  viewHolder.imagePlatform1Item.setImageDrawable(context.getDrawable(R.drawable.platform_android));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageItem;
        private final TextView dateTextItem;
        private final TextView nameTextItem;
        private final ImageView imagePlatform1Item;
        private final ImageView imagePlatform2Item;
        private final ImageView imagePlatform3Item;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageItem = ((ImageView) itemView.findViewById(R.id.image_grade_list));
            dateTextItem = ((TextView) itemView.findViewById(R.id.text_date_item));
            nameTextItem = ((TextView) itemView.findViewById(R.id.text_name_item));
            imagePlatform1Item = ((ImageView) itemView.findViewById(R.id.image_platform1_item));
            imagePlatform2Item = ((ImageView) itemView.findViewById(R.id.image_platform2_item));
            imagePlatform3Item = ((ImageView) itemView.findViewById(R.id.image_platform3_item));
        }
    }
}
