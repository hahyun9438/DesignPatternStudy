package com.hhyun.designpatternstudy.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hhyun.designpatternstudy.databinding.FragmentLifecycleBinding

class LifecycleFragment: Fragment() {

    companion object {

        fun newInstance(): LifecycleFragment {
            return LifecycleFragment()
        }

    }

    private var _binding: FragmentLifecycleBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("hahTest", "Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("hahTest", "Fragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.e("hahTest", "Fragment onCreateView")
        _binding = FragmentLifecycleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("hahTest", "Fragment onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.e("hahTest", "Fragment onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.e("hahTest", "Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("hahTest", "Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("hahTest", "Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("hahTest", "Fragment onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("hahTest", "Fragment onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("hahTest", "Fragment onDestroyView")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("hahTest", "Fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("hahTest", "Fragment onDetach")
    }
}