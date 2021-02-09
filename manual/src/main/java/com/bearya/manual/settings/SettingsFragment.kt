package com.bearya.manual.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.bearya.manual.databinding.FragmentSettingsBinding
import com.bearya.manual.main.MainViewModel

class SettingsFragment : Fragment() {

    private lateinit var bindView: FragmentSettingsBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bindView = FragmentSettingsBinding.inflate(inflater, container, false)
        bindView.lifecycleOwner = viewLifecycleOwner
        return bindView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bindView.mainViewModel = mainViewModel
        bindView.download.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            val scaleSize = if (hasFocus) 1.1f else 1.0f
            v?.animate()?.scaleX(scaleSize)?.scaleY(scaleSize)?.start()
        }
        bindView.download.setOnClickListener {
            Navigation.findNavController(it).navigate(SettingsFragmentDirections.actionSettingsFragmentToUpdateFragment())
        }
    }

}