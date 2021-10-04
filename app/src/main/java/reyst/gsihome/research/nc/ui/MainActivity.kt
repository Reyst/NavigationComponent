package reyst.gsihome.research.nc.ui

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import reyst.gsihome.research.nc.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        val navController = navHostFragment.navController
        val navBar = findViewById<BottomNavigationView>(R.id.bottom_nav)
            .apply { setupWithNavController(navController) }

        fun switchMenu(index: Int) {
            val item = navBar.menu.getItem(index)
            navBar.selectedItemId = item.itemId
        }


        findViewById<Button>(R.id.nav_1).setOnClickListener { switchMenu(0) }
        findViewById<Button>(R.id.nav_2).setOnClickListener { switchMenu(1) }
    }



    override fun onSupportNavigateUp() = findNavController(R.id.nav_host).navigateUp()
}
