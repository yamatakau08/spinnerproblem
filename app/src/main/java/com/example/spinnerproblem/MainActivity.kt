package com.example.spinnerproblem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        // spinner 1
        // items are specified by "entries" in xml
        val sp1 = findViewById<Spinner>(R.id.sp1)

        sp1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            val func = "sp1 onItemSelectedListener"
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, pos: Int, id: Long) {
                Log.d(TAG,"$func onItemSelected is called!")
                val selected = sp1.selectedItem
                Log.d(TAG, "$func onItemSelected: $selected pos: $pos id: $id")
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.d(TAG,"$func onNothingSelected called!")
            }
        }
    }

    companion object {
        const val TAG = "MainActivity"
    }
}