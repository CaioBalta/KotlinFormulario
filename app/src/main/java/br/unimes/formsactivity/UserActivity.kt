package br.unimes.formsactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val bx_nome = findViewById<EditText>(R.id.bx_nome)
        val bx_sobre = findViewById<EditText>(R.id.bx_sobre)
        val bx_ida = findViewById<EditText>(R.id.bx_ida)
        val bx_fone = findViewById<EditText>(R.id.bx_fone)
        val bx_mail = findViewById<EditText>(R.id.bx_mail)
        val bx_passp = findViewById<EditText>(R.id.bx_passp)
        val btn_salv = findViewById<Button>(R.id.btn_salv)
        val btn_atua = findViewById<Button>(R.id.btn_atua)
        val btn_volta = findViewById<FloatingActionButton>(R.id.btn_volta)

        bx_nome.setText(intent.getStringExtra("nome_user"))

        btn_atua.setOnClickListener {
            bx_nome.isEnabled = true
            bx_sobre.isEnabled = true
            bx_ida.isEnabled = true
            bx_fone.isEnabled = true
            bx_mail.isEnabled = true
            bx_passp.isEnabled = true
        }

        btn_salv.setOnClickListener {
            bx_nome.isEnabled = false
            bx_sobre.isEnabled = false
            bx_ida.isEnabled = false
            bx_fone.isEnabled = false
            bx_mail.isEnabled = false
            bx_passp.isEnabled = false
        }

        btn_volta.setOnClickListener {
            finish()
        }


    }
}