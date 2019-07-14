package reyst.gsihome.research.nc.ui.branch3


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController

import reyst.gsihome.research.nc.R

class Fragment32 : Fragment() {

    private val email: String by lazy { Fragment32Args.fromBundle(arguments!!).email }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment32, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val result: TextView = view.findViewById(R.id.result)
        result.text = email

        val btnConfirm: Button = view.findViewById(R.id.confirm)
        btnConfirm.setOnClickListener {
            it.findNavController().navigate(Fragment32Directions.actionConfirmed(email))
        }

        val btnCancel: Button = view.findViewById(R.id.cancel)
        btnCancel.setOnClickListener { it.findNavController().popBackStack(R.id.homeFragment, false) }
    }
}
