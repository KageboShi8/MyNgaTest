package com.example.kageboshi.myngatest.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.kageboshi.myngatest.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.kageboshi.myngatest.Utils.Constants.DEBUG_TAG;


public class HomeFragmentGalleryAdapter extends RecyclerView.Adapter<HomeFragmentGalleryAdapter.MyViewHolder> {

    private int itemWidth;
    private Context context;
    private List<Drawable> galleryDrawableList = new ArrayList<Drawable>();
    private List<String> galleryNameList = new ArrayList<String>();

    public HomeFragmentGalleryAdapter(Context context, List<String> galleryNameList, List<Drawable> galleryDrawableList, int itemWidth) {
        this.context = context;
        this.galleryDrawableList = galleryDrawableList;
        this.galleryNameList = galleryNameList;
        this.itemWidth = itemWidth;
        Log.d(DEBUG_TAG, itemWidth + "");
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_each_function_button, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        ViewGroup.LayoutParams layoutParams = myViewHolder.itemView.getLayoutParams();
        layoutParams.width = itemWidth;
        myViewHolder.itemView.setLayoutParams(layoutParams);
        myViewHolder.imageFunction.setImageDrawable(galleryDrawableList.get(i));
        myViewHolder.textFunction.setText(galleryNameList.get(i));
    }

    @Override
    public int getItemCount() {
        return galleryDrawableList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageFunction;
        private final TextView textFunction;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageFunction = ((ImageView) itemView.findViewById(R.id.image_function));
            textFunction = ((TextView) itemView.findViewById(R.id.text_function));
        }
    }
}
