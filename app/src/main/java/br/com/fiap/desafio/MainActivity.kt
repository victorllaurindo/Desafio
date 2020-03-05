package br.com.fiap.desafio

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Base64
import android.view.View
import android.webkit.WebView
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*


class MainActivity : AppCompatActivity() {

    var cont = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sh = getSharedPreferences("contador", Context.MODE_PRIVATE)

        var magalu = false

        val click = findViewById(R.id.imageView) as ImageView
        // set on-click listener
        click.setOnClickListener {
            // your code to perform when the user clicks on the ImageView

            Toast.makeText(this@MainActivity, "Voce Clicou", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Main3Activity::class.java)

            cont++

            Toast.makeText(this, "cliques$cont", Toast.LENGTH_SHORT).show()

            sh.edit().putInt("vl", cont).apply()






        }



        btSobre.setOnClickListener {

            var acessos = cont

            var mensagem = "VICTOR HUGO LAURINDO" + "\n" + "RM:81919    2TDSG"

            val intent = Intent(this, Main2Activity::class.java)

            intent.putExtra("msg", mensagem)
            intent.putExtra("mensagem", cont)

            //Toast.makeText(this@MainActivity, "inferno", Toast.LENGTH_SHORT).show()


            startActivity(intent)


        }





    }
}
