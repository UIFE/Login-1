package com.uife.login_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.android.material.tabs.TabLayoutMediator
import com.uife.login_1.adapter.ViewPagerAdapter
import com.uife.login_1.databinding.ActivityMainBinding
import com.uife.login_1.utils.AdapterData
import com.uife.login_1.utils.changeBarColor

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        changeBarColor(activity = this, navBarColor = R.color.colorPrimaryDark, statusBarColor = R.color.white)
        initializeComponents()
    }

    private fun initializeComponents() {
        viewPagerAdapter =
            ViewPagerAdapter(items = AdapterData.getLoginAdapterData())
        binding.loginViewPagerLayout.viewPager2.adapter = viewPagerAdapter
        TabLayoutMediator(binding.loginViewPagerLayout.tabLayout, binding.loginViewPagerLayout.viewPager2) { _,_ -> }.attach()
    }

}
