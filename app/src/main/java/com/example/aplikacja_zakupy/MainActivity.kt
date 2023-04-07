package com.example.aplikacja_zakupy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wybor=findViewById<Button>(R.id.wybor)
        val lista=findViewById<Button>(R.id.lista)
        val radio=findViewById<RadioGroup>(R.id.wybor2)

        val warzywa=findViewById<TextView>(R.id.warzywa)
        val marchew=findViewById<CheckBox>(R.id.marchew)
        val ziemniaki=findViewById<CheckBox>(R.id.ziemniaki)
        val cebula=findViewById<CheckBox>(R.id.cebula)
        val ogorek=findViewById<CheckBox>(R.id.ogorek)

        val pieczywo=findViewById<TextView>(R.id.pieczywo)
        val chleb_psz=findViewById<CheckBox>(R.id.chleb_psz)
        val chleb_zyt=findViewById<CheckBox>(R.id.chleb_zyt)
        val bagietka=findViewById<CheckBox>(R.id.bagietka)
        val kajzerka=findViewById<CheckBox>(R.id.kajzerka)

        val wedliny=findViewById<TextView>(R.id.)
        val szynka=findViewById<CheckBox>(R.id.szynka)
        val boczek=findViewById<CheckBox>(R.id.boczek)
        val poledwica=findViewById<CheckBox>(R.id.poledwica)
        val salami=findViewById<CheckBox>(R.id.salami)


        wybor.setOnClickListener {
            marchew.isVisible=true
            ziemniaki.isVisible=true
            cebula.isVisible=true
            ogorek.isVisible=true

            chleb_psz.isVisible=true
            chleb_zyt.isVisible=true
            bagietka.isVisible=true
            kajzerka.isVisible=true

            szynka.isVisible=true
            boczek.isVisible=true
            poledwica.isVisible=true
            salami.isVisible=true
        }

        lista.setOnClickListener {
            //WARZYWA
            var w=4
            if (marchew.isChecked!=true)
            {
                marchew.isInvisible=true
                w-=1
            }
            if (ziemniaki.isChecked!=true)
            {
                ziemniaki.isInvisible=true
                w-=1
            }
            if (cebula.isChecked!=true)
            {
                cebula.isInvisible=true
                w-=1
            }
            if (ogorek.isChecked!=true)
            {
                ogorek.isInvisible=true
                w-=1
            }
            if (w==0)
            {
                warzywa.isInvisible=true
            }

            var p=4
            //PIECZYWO
            if (chleb_psz.isChecked!=true)
            {
                chleb_psz.isInvisible=true
                p-=1
            }
            if (chleb_zyt.isChecked!=true)
            {
                chleb_zyt.isInvisible=true
                p-=1
            }
            if (bagietka.isChecked!=true)
            {
                bagietka.isInvisible=true
                p-=1
            }
            if (kajzerka.isChecked!=true)
            {
                kajzerka.isInvisible=true
                p-=1
            }
            if (p==0)
            {
                pieczywo.isInvisible=true
            }
            //SZYNKA
            var m=4
            if (szynka.isChecked!=true)
            {
                szynka.isInvisible=true
                m-=1
            }
            if (boczek.isChecked!=true)
            {
                boczek.isInvisible=true
                m-=1
            }
            if (poledwica.isChecked!=true)
            {
                poledwica.isInvisible=true
                m-=1
            }
            if (salami.isChecked!=true)
            {
                salami.isInvisible=true
                m-=1
            }
            if (m==0)
            {
                wedliny.isInvisible=true
            }

        }


    }
}