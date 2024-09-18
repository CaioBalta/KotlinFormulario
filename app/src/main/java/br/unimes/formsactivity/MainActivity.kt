package br.unimes.formsactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bx_email = findViewById<EditText>(R.id.bx_email)
        val bx_senha = findViewById<EditText>(R.id.bx_senha)
        val btn_entra = findViewById<Button>(R.id.btn_entra)

        btn_entra.setOnClickListener {
            val email = bx_email.text.toString()
            val senha = bx_senha.text.toString().toInt()
            if(email.equals("Balta")&& senha == 1234){

                val intent = Intent(this, UserActivity::class.java)
                intent.putExtra("nome_user", email)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Login incorreto", Toast.LENGTH_SHORT).show()
            }
        }
    }
}