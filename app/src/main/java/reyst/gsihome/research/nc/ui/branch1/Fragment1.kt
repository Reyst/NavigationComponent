package reyst.gsihome.research.nc.ui.branch1


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import reyst.gsihome.research.nc.R
import reyst.gsihome.research.nc.ui.AbstractData

class Fragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = requireArguments().getParcelable<AbstractData>("data")
        view.findViewById<TextView>(R.id.text_view).text = data?.map() ?: "1"

    }
}
