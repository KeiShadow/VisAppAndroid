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
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by nskyp on 12-Dec-17.
 */
class tab1Flights : Fragment() {
    public  val TAG:String = "Tab1Flights"
     lateinit var dateDep:EditText
    lateinit var dateRet:EditText
    lateinit  var myCalendar: Calendar


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var rootView:View = inflater.inflate(R.layout.tabflightsview, container, false)

        dateDep = rootView.findViewById(R.id.dateDep)
         dateRet = rootView.findViewById(R.id.dateRet)

         myCalendar = Calendar.getInstance()

        val date =DatePickerDialog.OnDateSetListener{ view, year, monthOfYear, dayOfMonth ->
            myCalendar.set(Calendar.YEAR,year)
            myCalendar.set(Calendar.MONTH,monthOfYear)
            myCalendar.set(Calendar.DAY_OF_MONTH,dayOfMonth)

            updateLabel()
        }

        dateDep.setOnClickListener {
            DatePickerDialog(context,date,myCalendar.get(Calendar.YEAR),myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show()
        }

        return rootView
    }
    private fun updateLabel() {
        var myFormat ="MM/dd/yy"
        var sdf: SimpleDateFormat = SimpleDateFormat(myFormat,Locale.US)
        dateDep.setText(sdf.format(myCalendar.time))
    }


}

