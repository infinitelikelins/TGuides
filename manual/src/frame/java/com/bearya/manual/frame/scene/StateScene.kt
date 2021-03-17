package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bearya.manual.databinding.SceneStateBinding
import com.bearya.manual.frame.StateFrame
import library.Music

class StateScene : Fragment() {

    companion object {
        fun build(data: StateFrame) = StateScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneStateBinding
    private var data: StateFrame? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().get("data") as? StateFrame?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneStateBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        data?.image?.apply { bindView.stateImage.setImageResource(this) }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Music.stopMusic()
        Music.stopBgMusic()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindView.unbind()
    }

}