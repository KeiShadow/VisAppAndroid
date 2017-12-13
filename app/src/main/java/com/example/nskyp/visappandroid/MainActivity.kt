package com.example.nskyp.visappandroid

import android.app.Fragment
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var TAG:String = "MainActivity"
    lateinit var mSectionPageAdapter:SectionsPageAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSectionPageAdapter =  SectionsPageAdapter(supportFragmentManager)


       var mViewPager:ViewPager =findViewById(R.id.container)
        setUpViewPager(mViewPager)

        var tabLayout:TabLayout = findViewById(R.id.tabs)
        tabLayout.setupWithViewPager(mViewPager)

    }

    private fun setUpViewPager(viewPager: ViewPager){
        var adapter:SectionsPageAdapter = SectionsPageAdapter(supportFragmentManager)
        adapter.addFragment(tab1Flights(),"Flights")
        adapter.addFragment(tabMap(),"Maps")
        viewPager.adapter = adapter

    }
}

