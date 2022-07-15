package org.gricsan.dungaran.navigation

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

private const val NAVIGATION_DEBUG_LOGS_TAG = "NavDebugLogs"


fun Fragment.navigateTo(directions: NavDirections) = saveNavigateTo(directions)

fun Fragment.navigateUp() = saveNavigateUp()


private fun Fragment.saveNavigateTo(directions: NavDirections) = try {
    findNavController().navigate(directions)
} catch (e: Exception) {
    Log.d(NAVIGATION_DEBUG_LOGS_TAG, "Navigation action failed: ${e.message}")
}

private fun Fragment.saveNavigateUp() = try {
    findNavController().navigateUp()
} catch (e: Exception) {
    Log.d(NAVIGATION_DEBUG_LOGS_TAG, "Navigation action failed: ${e.message}")
}