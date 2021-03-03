package com.gorkemkara.sampleproject.ui.main

import android.view.View
import com.gorkemkara.sampleproject.R
import com.gorkemkara.sampleproject.base.BaseAdapter
import com.gorkemkara.sampleproject.base.BaseViewHolder
import com.gorkemkara.sampleproject.databinding.ListCellRocketBinding
import com.gorkemkara.sampleproject.model.Rocket
import com.gorkemkara.sampleproject.util.bindings

class RocketsAdapter : BaseAdapter() {


    override fun layout(type: String) = R.layout.list_cell_rocket

    override fun viewHolder(layout: Int, view: View): BaseViewHolder {
        return RocketsViewHolder(view)
    }


    inner class RocketsViewHolder(view: View) : BaseViewHolder(view){

        private val binding: ListCellRocketBinding by bindings(view)

        override fun bindData(item: Any) {
            if(item is Rocket){

                binding.apply {
                    rocket = item
                }
            }
        }
    }
}