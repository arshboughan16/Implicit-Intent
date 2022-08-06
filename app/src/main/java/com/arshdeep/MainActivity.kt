package com.arshdeep

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etEnter : EditText
    lateinit var btnDial : Button
    lateinit var btnSms : Button
    lateinit var btnShare : Button
    lateinit var btnRating : Button
    lateinit var btnEmail : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etEnter = findViewById(R.id.etEnter)
        btnDial = findViewById(R.id.btnDial)
        btnSms = findViewById(R.id.btnSms)
        btnShare = findViewById(R.id.btnShare)
        btnRating = findViewById(R.id.btnRating)
        btnEmail = findViewById(R.id.btnEmail)


        btnDial.setOnClickListener {
            System.out.println("Clicked")
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "0123456789")

            startActivity(intent)
        }
        btnSms.setOnClickListener {
            System.out.println("Clicked")
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("sms:" +"Hello World")

            startActivity(intent)
        }
        btnShare.setOnClickListener {
            System.out.println("Clicked")
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT,"Hello")

            startActivity(intent)
        }
        btnRating.setOnClickListener {
            System.out.println("Clicked")
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("")
            intent.data = Uri.parse( "https://play.google.com")

            startActivity(intent)
        }
        btnEmail.setOnClickListener{
            System.out.println("Clicked")
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:" + "abc@gmail.com")

            startActivity(intent)
        }

    }
}

