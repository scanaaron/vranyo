package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import com.example.myapplication.PictureTake
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val readyForPhotosButton: Button = findViewById(R.id.capture_photo_button)

        readyForPhotosButton.setOnClickListener {
            val intent = Intent(this, PictureTake::class.java)
            startActivity(intent)
        }
    }
}