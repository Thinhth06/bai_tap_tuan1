package com.example.bai_tap_tuan1

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //load lại giao diện dựa vào file activity_main
        setContentView(R.layout.activity_main)

        // 1. Xử lý nút Quay lại (btnBack)
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            // Đóng màn hình hiện tại (thoát app)
            finish()
        }

        // 2. Xử lý nút Chỉnh sửa (btnEdit)
        val btnEdit = findViewById<ImageButton>(R.id.btnEdit)
        btnEdit.setOnClickListener {
            Toast.makeText(this, "Chức năng chỉnh sửa thông tin",
                Toast.LENGTH_SHORT).show()
        }
    }
}