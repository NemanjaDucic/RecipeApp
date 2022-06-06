package com.example.recipeapp.View.LoginRegisterSegment
import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.recipeapp.View.LoginRegisterSegment.Adapter.LoginRegisterSegmentAdapter
import com.example.recipeapp.databinding.MainActivityLayoutBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity:AppCompatActivity() {
    private lateinit var binding:MainActivityLayoutBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle??) {
        super.onCreate(savedInstanceState)
        binding = MainActivityLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tabLayout = binding.tabLayout
        viewPager = binding.viewPager2
        viewPager.adapter = LoginRegisterSegmentAdapter(this)
        TabLayoutMediator(tabLayout,viewPager){tab,index ->
            tab.text = when(index){
                0 -> {"Login"}
                1 -> {"Register"}
                else ->  { throw Resources.NotFoundException("zhbuneo sam se")}
            }
        }.attach()
    }
}