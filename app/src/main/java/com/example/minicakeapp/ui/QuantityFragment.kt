package com.example.minicakeapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.minicakeapp.R
import com.example.minicakeapp.databinding.FragmentQuantityBinding


/**
 * A simple [Fragment] subclass.
 * Use the [QuantityFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuantityFragment : Fragment() {

    private var binding: FragmentQuantityBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentQuantityBinding.inflate(
            inflater,
            container,
            false
        )

        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btnNextFlavor?.setOnClickListener {
            findNavController().navigate(R.id.action_quantityFragment_to_flavorFragment)
        }
    }


}