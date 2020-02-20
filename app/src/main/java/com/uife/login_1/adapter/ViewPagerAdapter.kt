package com.uife.login_1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.uife.login_1.R
import com.uife.login_1.databinding.ViewPagerItemLayoutBinding
import com.uife.login_1.model.ViewPagerModel

class ViewPagerAdapter(private val items: List<ViewPagerModel>): RecyclerView.Adapter<ViewPagerHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.view_pager_item_layout,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.binding.item = items[position]
    }
}

class ViewPagerHolder(val binding: ViewPagerItemLayoutBinding): RecyclerView.ViewHolder(binding.root)