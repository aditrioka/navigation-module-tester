package id.aditrioka.navigationmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import id.aditrioka.navigationmodule.navigation.features.AgendaNavigation
import id.aditrioka.navigationmodule.navigation.features.InfoNavigation
import id.aditrioka.navigationmodule.navigation.features.ScheduleNavigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val FRAGMENT_ID = R.id.fragment_container
    }

    lateinit var currentFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_info -> {
                    InfoNavigation.dynamicStart?.let {
                        replaceFragment(it)
                    }
                    true
                }

                R.id.navigation_schedule -> {
                    ScheduleNavigation.dynamicStart?.let {
                        replaceFragment(it)
                    }
                    true
                }

                R.id.navigation_agenda -> {
                    AgendaNavigation.dynamicStart?.let {
                        replaceFragment(it)
                    }
                    true
                }

                else -> false
            }
        }
        // Add a listener to prevent reselects from being treated as selects.
        navigation.setOnNavigationItemReselectedListener {}

        if (savedInstanceState == null) {
            // Show Schedule on first creation
            if (navigation.selectedItemId == R.id.navigation_schedule) {
                // We need to add the fragment ourselves.
//                replaceFragment(ScheduleFragment()) // TODO: fix here
            } else {
                // This will replace the current fragemnt.
                navigation.selectedItemId = R.id.navigation_schedule
            }
        } else {
            // Find the current fragment
            currentFragment =
                    supportFragmentManager.findFragmentById(FRAGMENT_ID)
                    ?: throw IllegalStateException("Activity recreated, but no fragment found!")
        }
    }

    private fun <F> replaceFragment(fragment: F) where F : Fragment {
        supportFragmentManager.inTransaction {
            currentFragment = fragment
            replace(FRAGMENT_ID, fragment)
        }
    }
}
