package com.example.nskyp.visappandroid

import android.os.Parcel
import android.os.Parcelable
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by nskyp on 12-Dec-17.
 */
class SectionsPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val mFragmentList:MutableList<Fragment> = mutableListOf<Fragment>()
     private val mFragmentTitleList:MutableList<String> = mutableListOf<String>()

    fun addFragment(fragment: Fragment,title: String){
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)

    }

    override fun getPageTitle(position: Int): CharSequence {
        return mFragmentTitleList.get(position)
    }
    override fun getItem(position: Int): Fragment? {
        return mFragmentList.get(position)
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

}