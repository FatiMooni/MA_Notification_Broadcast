package tima.project.marriagearrangment_reciever

import android.content.Intent
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ok.*

class OkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ok)
       val intent = intent
        Toast.makeText(this,intent.extras!!.get("name")!!.toString(),Toast.LENGTH_LONG).show()
        name.text = intent.extras!!.get("name")!!.toString()
        desc.text = intent.extras!!.get("desc")!!.toString()
        age.text = intent.extras!!.get("age")!!.toString()
        cond_img.setImageBitmap(intent.extras!!.get("img")!! as Bitmap)
    }
}
