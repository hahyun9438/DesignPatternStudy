package com.hhyun.designpatternstudy.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hhyun.designpatternstudy.R
import com.hhyun.designpatternstudy.databinding.ActivityLifecycleBinding

class LifecycleActivity: AppCompatActivity() {

    private lateinit var binding: ActivityLifecycleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLifecycleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("hahTest", "Activity onCreate")

        val ft = supportFragmentManager.beginTransaction()
        with(LifecycleFragment.newInstance()) {
            ft.replace(R.id.fl_container, this)
        }
        ft.commit()

    }

    override fun onStart() {
        super.onStart()
        Log.d("hahTest", "Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("hahTest", "Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("hahTest", "Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("hahTest", "Activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("hahTest", "Activity onDestroy")
    }


}