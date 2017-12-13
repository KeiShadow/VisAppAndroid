package com.example.nskyp.visappandroid

import android.app.DatePickerDialog
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import kotlinx.android.synthetic.main.tabmap.*
import java.text.SimpleDateFormat
import java.util.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.LatLng



/**
 * Created by nskyp on 12-Dec-17.
 */
class tabMap : Fragment(),  OnMapReadyCallback {




    val TAG:String = "TabMap"
    private var mapFragment: SupportMapFragment? = null
    private lateinit var mMap: GoogleMap



    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var rootView: View = inflater.inflate(R.layout.tabmap, container, false)


        mapFragment = fragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(this)

        return rootView
    }
    override fun onMapReady(map: GoogleMap?) {
        mMap = map as GoogleMap
        val sydney: LatLng = LatLng(-33.852, 151.211)
        mMap.addMarker(MarkerOptions().position(sydney).title("Seed nay"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))


    }


}