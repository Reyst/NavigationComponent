package reyst.gsihome.research.nc.ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import reyst.gsihome.research.nc.R

class MainActivity : AppCompatActivity() {

    private val backCallback = onBackPressedDispatcher.addCallback(this) { switchMenu(0) }

    private val navBar by lazy { findViewById<BottomNavigationView>(R.id.bottom_nav) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        val navController = navHostFragment.navController

        navBar.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { controller, destination, _ ->
            Log.wtf("INSPECT", "backQueue: ${controller.backQueue}")
            Log.wtf("INSPECT", "flow2: ${navBar.menu[0].itemId != navBar.selectedItemId}")

            backCallback.isEnabled = destination.id == R.id.fragment31
        }

        findViewById<Button>(R.id.nav_1).setOnClickListener { switchMenu(0) }
        findViewById<Button>(R.id.nav_2).setOnClickListener { switchMenu(1) }
    }

    private fun switchMenu(index: Int) {
        val item = navBar.menu.getItem(index)
        navBar.selectedItemId = item.itemId
    }


    override fun onSupportNavigateUp() = findNavController(R.id.nav_host).navigateUp()
}
