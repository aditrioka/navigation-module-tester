package id.aditrioka.navigationmodule.navigation.features

import androidx.fragment.app.Fragment
import id.aditrioka.navigationmodule.navigation.loadFragmentOrNull

object InfoNavigation : DynamicFeature<Fragment> {

    private const val INFO_FRAGMENT = "id.aditrioka.navigationmodule.screenone.InfoFragment"

    override val dynamicStart: Fragment?
        get() = INFO_FRAGMENT.loadFragmentOrNull()
}