package com.christianrondonuwu.daftarfilmku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.christianrondonuwu.daftarfilmku.models.GetMovieResponseModel
import com.christianrondonuwu.daftarfilmku.retrofit.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var startButton:Button

    fun initComponents(){
        startButton = findViewById(R.id.startButton)
    }

    fun initListeners(){
        startButton.setOnClickListener {
            startActivity(Intent(this,BerandaActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        initListeners()
    }
}