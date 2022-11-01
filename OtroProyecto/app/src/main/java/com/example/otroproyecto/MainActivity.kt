package com.example.otroproyecto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var vpVistapager: ViewPager2
    private lateinit var vlVistaTabla: TabLayout


    private val adaptador by lazy {
        vpAdaptador(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vpVistapager = findViewById(R.id.vp_vistaP)
        vlVistaTabla = findViewById(R.id.tl_vitaTablero)

        vpVistapager.adapter = adaptador

        val medidorTabla = TabLayoutMediator(
            vlVistaTabla, vpVistapager,
            TabLayoutMediator.TabConfigurationStrategy{ tab, position ->
                when (position) {
                    0 -> {
                        tab.text = "Opcion 1"
                    }
                    1 -> {
                        tab.text = "Opcion 2"
                    }
                    2 -> {
                        tab.text = "Opcion 3"
                    }

                }
            }

        )
        medidorTabla.attach()
    }
}