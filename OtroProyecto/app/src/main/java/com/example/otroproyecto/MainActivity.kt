package com.example.otroproyecto

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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

  //  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
  //      menuInflater.inflate(R.menu.appbarmenu,menu)
        //return super.onCreateOptionsMenu(menu)
    //    return true
   // }

   //override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //return super.onOptionsItemSelected(item)
       // when(item.itemId){
        //    R.id.miContactos -> {
         //       Toast.makeText(this,"has seleccionado contactos", Toast.LENGTH_SHORT).show()
          //  }
         //   R.id.miFavorito -> {
         //       Toast.makeText(this,"has seleccionado favorito", Toast.LENGTH_SHORT).show()
        //    }
         //   R.id.configuracion -> {
         //       Toast.makeText(this,"has seleccionado configuracion", Toast.LENGTH_SHORT).show()
         ///   }
          //  R.id.miNActividad -> {
         //       //Toast.makeText(this,"has seleccionado nueva actividad",Toast.LENGTH_SHORT).show()
          //      val ventana = Intent(applicationContext,ScrollViewApp::class.java)
          //      startActivity(ventana)
         //   }
         //   R.id.miCerrar -> {
         //       finish()
         //   }

      //  }
       // return true
   // }


}