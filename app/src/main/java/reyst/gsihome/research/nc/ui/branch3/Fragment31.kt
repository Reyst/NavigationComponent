package reyst.gsihome.research.nc.ui.branch3


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.navigation.findNavController

import reyst.gsihome.research.nc.R

class Fragment31 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment31, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val input: EditText = view.findViewById(R.id.input)

        val btnSubmit: Button = view.findViewById(R.id.submit)
        val btnCancel: Button = view.findViewById(R.id.cancel)

        btnSubmit.setOnClickListener {
//            val action = Fragment31Directions.actionBranch3Step2(input.text.toString())
            it.findNavController().navigate(R.id.action_branch3_step2, bundleOf("email" to input.text.toString()))
        }

        btnCancel.setOnClickListener { it.findNavController().popBackStack(R.id.homeFragment, false) }
    }
}
