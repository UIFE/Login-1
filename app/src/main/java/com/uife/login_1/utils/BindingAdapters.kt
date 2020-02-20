package com.uife.login_1.utils

import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter


@BindingAdapter("app:imageName")
fun setImageFromName(view: ImageView, name: String) {
    val context = view.context
    val resourceId: Int = context.resources.getIdentifier(
        name, "drawable", view.context.packageName
    )

    view.setImageDrawable(
        ContextCompat.getDrawable(context, resourceId)
    )
}