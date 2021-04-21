package com.example.datateman

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val menuText = arrayOf("Teman", "Github" , "Profil")
    val menuIcon = arrayOf(R.drawable.ic_house_foreground, R.drawable.ic_add_foreground, R.drawable.ic_profil_foreground)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter (this)
        view_pager.setAdapter(adapter);
        TabLayoutMediator(tab_layout, view_pager,
            TabLayoutMediator.TabConfigurationStrategy{tab, position ->
                tab.text=menuText[position]
                tab.icon=ResourcesCompat.getDrawable(resources, menuIcon[position] ,null
                )
            }).attach()
    }
}