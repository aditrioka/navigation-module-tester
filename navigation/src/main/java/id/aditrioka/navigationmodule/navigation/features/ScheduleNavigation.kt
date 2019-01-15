package id.aditrioka.navigationmodule.navigation.features

import androidx.fragment.app.Fragment
import id.aditrioka.navigationmodule.navigation.loadFragmentOrNull

object ScheduleNavigation : DynamicFeature<Fragment> {

    private const val SCHEDULE_FRAGMENT = "id.aditrioka.navigationmodule.screentwo.ScheduleFragment"

    override val dynamicStart: Fragment?
        get() = SCHEDULE_FRAGMENT.loadFragmentOrNull()
}