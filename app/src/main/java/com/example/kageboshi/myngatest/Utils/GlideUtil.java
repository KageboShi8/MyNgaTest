package com.example.kageboshi.myngatest.Utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

public class GlideUtil {
    public static void GlideStrategy(Context context, String url, ImageView imageView) {
        RequestOptions mRequestOptions = RequestOptions.bitmapTransform(new RoundedCorners(10)).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .skipMemoryCache(false);
        Glide.with(context).load(url).apply(mRequestOptions).into(imageView);
    }
}
