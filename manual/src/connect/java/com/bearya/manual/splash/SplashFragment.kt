package com.bearya.manual.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import com.bearya.manual.R
import com.bearya.manual.databinding.FragmentSplashBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class SplashFragment : Fragment() {

    private lateinit var bindView: FragmentSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleScope.launchWhenResumed {
            delay(3000)
            withContext(Dispatchers.Main){
                Navigation.findNavController(requireActivity(), R.id.container_fragment).navigate(R.id.action_splashFragment_to_chapterFragment)
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bindView = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

}