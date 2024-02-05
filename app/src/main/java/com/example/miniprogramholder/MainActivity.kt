package com.example.miniprogramholder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.buttonCameraMiniProgram)
        button.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
            startActivity(intent);
        }
        val buttonBt = findViewById<Button>(R.id.buttonBluetoothMiniProgram)
        buttonBt.setOnClickListener {
            val intent = Intent(this, BluetoothActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
            startActivity(intent);
        }
        val buttonGeolocation = findViewById<Button>(R.id.buttonGeolocation)
        buttonGeolocation.setOnClickListener {
            val intent = Intent(this, GeolocationActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
            startActivity(intent);
        }
        val buttonDeviceMotion = findViewById<Button>(R.id.buttonDeviceMotion)
        buttonDeviceMotion.setOnClickListener {
            val intent = Intent(this, DeviceMotionActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
            startActivity(intent);
        }


    }
}