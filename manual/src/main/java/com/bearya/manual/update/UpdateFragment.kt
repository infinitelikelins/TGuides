package com.bearya.manual.update

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.bearya.manual.databinding.FragmentUpdateBinding
import com.bearya.manual.main.MainViewModel

class UpdateFragment : Fragment() {

    private lateinit var bindView: FragmentUpdateBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = FragmentUpdateBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindView.appName.text = requireContext().packageManager.getApplicationLabel(requireContext().applicationInfo)
        bindView.update.setOnClickListener { v ->
            val directions = UpdateFragmentDirections.actionUpdateFragmentToInstallFragment()
            Navigation.findNavController(v).navigate(directions)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bindView.mainViewModel = mainViewModel
    }

}