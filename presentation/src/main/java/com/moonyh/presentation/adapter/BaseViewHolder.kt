package com.moonyh.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<T>(open val binding: ViewBinding) :
    RecyclerView.ViewHolder(binding.root) {
    abstract fun bind(item: T)
}