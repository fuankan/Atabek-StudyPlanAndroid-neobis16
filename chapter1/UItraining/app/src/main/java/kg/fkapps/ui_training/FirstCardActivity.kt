package kg.fkapps.ui_training

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class FirstCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_card)

        val btnCall = findViewById<Button>(R.id.btn_call_first_card)
//        val tvAddress = findViewById<TextView>(R.id.tv_address)

        /*tvAddress.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:42.878961, 74.627801")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }*/

        btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "+996504772077"))
            startActivity(intent)
        }
    }
}