package com.example.myscopecalculator.MyCoroutine

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myscopecalculator.databinding.ActivityMain3Binding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.net.HttpURLConnection
import java.net.URL

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding : ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.LoadButton.setOnClickListener {
            getImageByCoroutine()
        }
    }

    private fun getImageByCoroutine(){
        GlobalScope.launch(Dispatchers.IO){
            val urlImage = URL("https://testffc.nimapinfotech.com/testdatajson/project1.jpg")
            val httpUrlConnection = urlImage.openConnection() as HttpURLConnection
            httpUrlConnection.connect()
            var bitmap = BitmapFactory.decodeStream(httpUrlConnection.inputStream)
            launch(Dispatchers.Main){
                binding.ImageView.setImageBitmap(bitmap)
            }
        }
    }

}