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
        var dodaj_marchew=findViewById<Button>(R.id.dodaj_marchew)
        var odejmij_marchew=findViewById<Button>(R.id.odejmij_marchew)
        var mar=0

        var ziemniak=findViewById<TextView>(R.id.ziemniak)
        var dodaj_ziemniki=findViewById<Button>(R.id.dodaj_ziemniaki)
        var odejmij_ziemniki=findViewById<Button>(R.id.odejmij_ziemniaki)
        var zie=0

        var cebula=findViewById<TextView>(R.id.cebula)
        var dodaj_cebule=findViewById<Button>(R.id.dodaj_cebule)
        var odejmij_cebule=findViewById<Button>(R.id.odejmij_cebule)
        var ceb=0

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
            dodaj_marchew.isVisible=false
            odejmij_marchew.isVisible=false

            ziemniak.isVisible=false
            dodaj_ziemniki.isVisible=false
            odejmij_ziemniki.isVisible=false

            cebula.isVisible=false
            dodaj_cebule.isVisible=false
            odejmij_cebule.isVisible=false
        }

        dodaj_marchew.setOnClickListener {
            mar=1
            dodaj_marchew.isVisible=false
            odejmij_marchew.isVisible=true
        }
        odejmij_marchew.setOnClickListener {
            mar=0
            odejmij_marchew.isInvisible=true
            dodaj_marchew.isVisible=true
        }

        dodaj_ziemniki.setOnClickListener {
            zie=1
            dodaj_ziemniki.isVisible=false
            odejmij_ziemniki.isVisible=true
        }
        odejmij_ziemniki.setOnClickListener {
            zie=0
            dodaj_ziemniki.isVisible=true
            odejmij_ziemniki.isVisible=false
        }

        dodaj_cebule.setOnClickListener {
            ceb=1
            dodaj_cebule.isVisible=false
            odejmij_cebule.isVisible=true
        }
        odejmij_cebule.setOnClickListener {
            ceb=0
            dodaj_cebule.isVisible=true
            odejmij_cebule.isVisible=false
        }

        warzywo_guzik.setOnClickListener{
            guzik_lista.isInvisible=true
            guzik_wybor.isInvisible=true
            warzywo_guzik.isInvisible=true
            pieczywo_guzik.isInvisible=true
            wedlina_guzik.isInvisible=true
            powrot.isVisible=true

            marchew.isVisible=true
            if (mar==0)
            {
                dodaj_marchew.isVisible=true
                odejmij_marchew.isInvisible=true
            }
            else
            {
                dodaj_marchew.isInvisible=true
                odejmij_marchew.isVisible=true
            }

            ziemniak.isVisible=true
            if (zie==0)
            {
                dodaj_ziemniki.isVisible=true
                odejmij_ziemniki.isVisible=false
            }
            else
            {
                dodaj_ziemniki.isVisible=false
                odejmij_ziemniki.isVisible=true
            }

            cebula.isVisible=true
            if(ceb==0)
            {
                dodaj_cebule.isVisible=true
                odejmij_cebule.isVisible=false
            }
            else
            {
                dodaj_cebule.isVisible=false
                odejmij_cebule.isVisible=true
            }
        }

        pieczywo_guzik.setOnClickListener {
            guzik_lista.isInvisible=true
            guzik_wybor.isInvisible=true
            warzywo_guzik.isInvisible=true
            pieczywo_guzik.isInvisible=true
            wedlina_guzik.isInvisible=true
            powrot.isVisible=true
        }

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