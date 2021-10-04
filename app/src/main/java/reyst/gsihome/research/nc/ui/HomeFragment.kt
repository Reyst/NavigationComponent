package reyst.gsihome.research.nc.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController

import reyst.gsihome.research.nc.R

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val btn1: Button = view.findViewById(R.id.btn1)
        val btn2: Button = view.findViewById(R.id.btn2)
//        val btn3: Button = view.findViewById(R.id.btn3)

        btn1.setOnClickListener { navigateToBranch1(it) }
        btn2.setOnClickListener { it.findNavController().navigate(R.id.action_branch2) }
//        btn3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_branch3_step1))

    }

    private fun navigateToBranch1(view: View) {
        view.findNavController().navigate(R.id.action_branch1, bundleOf("data" to Data1("1", 1)))
    }


    companion object {
        fun newInstance() = HomeFragment()
    }
}
