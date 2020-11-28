package com.example.todo.utils

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment

fun Fragment.navigate(
    resId: Int, bundle: Bundle? = null,
    clearCurrentFragmentFromBackStack: Boolean? = null
) {
    NavHostFragment.findNavController(this).apply {
        clearCurrentFragmentFromBackStack?.let { needToClear ->
            if (needToClear) popBackStack()
        }
        navigate(resId, bundle)
    }
}