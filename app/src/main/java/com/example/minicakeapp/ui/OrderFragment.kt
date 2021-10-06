package com.example.minicakeapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.minicakeapp.R
import com.example.minicakeapp.adapters.OrderAdapter
import com.example.minicakeapp.databinding.FragmentOrderBinding
import com.example.minicakeapp.models.Order


/**
 * A simple [Fragment] subclass.
 * Use the [HistoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HistoryFragment : Fragment() {

    private var binding: FragmentOrderBinding? = null
    private val dummyData: MutableList<Order> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dummyData.addAll(
            listOf(
                Order(
                    "angel_bulnes16@yahoo.com",
                    receiver = "dbulnes@yahoo.com",
                    pickupDate = "12/12/2000",
                    numberOfCupcakes = 10,
                    flavor = "Chocolate"
                ),
                Order(
                    "angel_bulnes16@yahoo.com",
                    receiver = "dbulnes@yahoo.com",
                    pickupDate = "12/12/2000",
                    numberOfCupcakes = 20,
                    flavor = "Chocolate"
                ),
                Order(
                    "angel_bulnes16@yahoo.com",
                    receiver = "dbulnes@yahoo.com",
                    pickupDate = "12/12/2000",
                    numberOfCupcakes = 5,
                    flavor = "Vainilla"
                ),
            )
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding =
            FragmentOrderBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.orderRecyclerView?.adapter = OrderAdapter(requireContext(), dummyData)

    }


}