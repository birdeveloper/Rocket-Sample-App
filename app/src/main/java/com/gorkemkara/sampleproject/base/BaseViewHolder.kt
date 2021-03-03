package com.gorkemkara.sampleproject.base

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder(private val view: View): RecyclerView.ViewHolder(view){

    @Throws(Exception::class)
    abstract fun bindData(item: Any)

    fun view(): View {
        return view
    }

    fun context(): Context {
        return view.context
    }
}