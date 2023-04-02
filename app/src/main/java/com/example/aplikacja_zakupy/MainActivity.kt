package com.example.aplikacja_zakupy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var guzik_lista=findViewById<Button>(R.id.lista)
        var guzik_wybor=findViewById<Button>(R.id.wybor)

        var warzywo_guzik=findViewById<Button>(R.id.warzywa)
        var marchew=findViewById<TextView>(R.id.Marchew)
        var ziemniak=findViewById<TextView>(R.id.ziemniak)
        var cebula=findViewById<TextView>(R.id.cebula)

        var pieczywo_guzik=findViewById<Button>(R.id.pieczywo)
        var wedlina_guzik=findViewById<Button>(R.id.wedlina)
        var powrot=findViewById<Button>(R.id.powrot)

        powrot.setOnClickListener {
            guzik_wybor.isInvisible=false
            guzik_lista.isVisible=false
            warzywo_guzik.isVisible=true
            pieczywo_guzik.isVisible=true
            wedlina_guzik.isVisible=true
            powrot.isInvisible=true

            marchew.isVisible=false
            ziemniak.isVisible=false
            cebula.isVisible=false
        }

        warzywo_guzik.setOnClickListener{
            guzik_lista.isInvisible=true
            guzik_wybor.isInvisible=true
            warzywo_guzik.isInvisible=true
            pieczywo_guzik.isInvisible=true
            wedlina_guzik.isInvisible=true
            powrot.isVisible=true

            marchew.isVisible=true
            ziemniak.isVisible=true
            cebula.isVisible=true
        }
        pieczywo_guzik

        guzik_lista.setOnClickListener{
            guzik_lista.isInvisible=true
            guzik_wybor.isVisible=true
            warzywo_guzik.isVisible=true
            pieczywo_guzik.isVisible=true
            wedlina_guzik.isVisible=true
            powrot.isInvisible=true
        }


        guzik_wybor.setOnClickListener{
            guzik_wybor.isInvisible=true
            guzik_lista.isVisible=true
            warzywo_guzik.isVisible=false
            pieczywo_guzik.isVisible=false
            wedlina_guzik.isVisible=false
            powrot.isInvisible=true
        }
    }
}