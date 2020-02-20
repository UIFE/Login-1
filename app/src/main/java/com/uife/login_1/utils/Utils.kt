package com.uife.login_1.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

fun changeBarColor(activity: AppCompatActivity, navBarColor:Int, statusBarColor:Int) {
    activity.window.navigationBarColor = ContextCompat.getColor(activity, navBarColor)
    activity.window.statusBarColor = ContextCompat.getColor(activity, statusBarColor)

}