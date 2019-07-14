package reyst.gsihome.research.nc.ui.branch3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import reyst.gsihome.research.nc.R

class Activity2 : AppCompatActivity() {

    private val email: String by lazy { Activity2Args.fromBundle(intent.extras!!).email }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, email, Toast.LENGTH_LONG).show()
    }

}
