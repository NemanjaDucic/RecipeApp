package com.example.recipeapp.View.LoginRegisterSegment.Adapter

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.recipeapp.View.LoginRegisterSegment.LoginFragment.LoginFragment
import com.example.recipeapp.View.LoginRegisterSegment.MainActivity
import com.example.recipeapp.View.LoginRegisterSegment.RegisterFragment.RegisterFragment

class LoginRegisterSegmentAdapter(mainActivity: MainActivity) : FragmentStateAdapter(mainActivity) {

    override fun getItemCount()=2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                LoginFragment()
            }
            1 -> {
                RegisterFragment()
            }
            else -> {
                throw Resources.NotFoundException()
            }
        }
    }
}