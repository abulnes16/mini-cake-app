package com.example.minicakeapp.ui

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.minicakeapp.R
import com.example.minicakeapp.databinding.FragmentPickupBinding
import com.example.minicakeapp.ui.dialog.DatePickerFragment

/**
 * A simple [Fragment] subclass.
 * Use the [PickupFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PickupFragment : Fragment() {

    private var binding: FragmentPickupBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentPickupBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.txtDate?.setOnClickListener {
            showDatePickerDialog()
        }

        binding?.btnNextPickup?.setOnClickListener {
            findNavController().navigate(R.id.action_pickupFragment_to_summaryFragment)
        }
    }

    private fun showDatePickerDialog() {
        val newFragment =
            DatePickerFragment.newInstance { _, year, month, day ->
                val selectedDate = "$day/${month + 1}/$year"
                binding?.txtDate?.setText(selectedDate)
            }
        newFragment.show(requireActivity().supportFragmentManager, "datePicker")
    }


}