package com.example.minicakeapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import com.example.minicakeapp.R
import com.example.minicakeapp.databinding.FragmentFlavorBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FlavorFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FlavorFragment : Fragment() {

    private var binding: FragmentFlavorBinding? = null
    private var flavorsAdapter: ArrayAdapter<CharSequence>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        flavorsAdapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.flavor_options,
            android.R.layout.simple_spinner_item
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val fragmentBinding = FragmentFlavorBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        flavorsAdapter?.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding?.slcFlavors?.adapter = flavorsAdapter

        binding?.btnNextFlavor?.setOnClickListener {
            findNavController().navigate(R.id.action_flavorFragment_to_pickupFragment)
        }

    }


}