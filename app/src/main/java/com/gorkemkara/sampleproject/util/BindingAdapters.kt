package com.gorkemkara.sampleproject.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide.with
import com.gorkemkara.sampleproject.R


@BindingAdapter("imageFromUrl")
fun bindImageFromUrl(view: ImageView, imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty()) {
        with(view.context)
                .load(imageUrl)
                .error(R.drawable.ic_baseline_fireplace_24)
                .into(view)
    }else{
        with(view.context)
            .load(R.drawable.ic_baseline_fireplace_24)
            .into(view)
    }
}

@BindingAdapter("imageFromUrlList")
fun bindImageFromUrlList(view: ImageView, list: ArrayList<String?>?) {
    if(!list.isNullOrEmpty()){
        if (!list[0].isNullOrEmpty()) {
            with(view.context)
                .load(list[0])
                .error(R.drawable.ic_baseline_fireplace_24)
                .into(view)
        }else{
            with(view.context)
                .load(R.drawable.ic_baseline_fireplace_24)
                .into(view)
        }
    }else{
        with(view.context)
            .load(R.drawable.ic_baseline_fireplace_24)
            .into(view)
    }
}

