package id.aditrioka.navigationmodule.navigation.features

import androidx.fragment.app.Fragment
import id.aditrioka.navigationmodule.navigation.loadFragmentOrNull

object AgendaNavigation : DynamicFeature<Fragment> {

    private const val AGENDA_FRAGMENT = "id.aditrioka.navigationmodule.screenthree.AgendaFragment"

    override val dynamicStart: Fragment?
        get() = AGENDA_FRAGMENT.loadFragmentOrNull()
}