package com.example.otroproyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class vista_fragmento : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vista_fragmento, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.takeIf { it.containsKey(ARO_OBJECT)}?.apply {
            val tv_mensaje:TextView = view.findViewById(R.id.tv_mensaje)
            tv_mensaje.text = "vista fragment" + getInt(ARO_OBJECT).toString()
        } }
    companion object {
        private const val ARO_OBJECT ="object"

    }
}
