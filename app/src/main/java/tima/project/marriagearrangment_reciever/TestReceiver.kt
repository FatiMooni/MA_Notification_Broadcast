package tima.project.marriagearrangment_reciever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.widget.Toast


class TestReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        if (intent.action == "OK") {
            Toast.makeText(context,intent.getStringExtra("name"), Toast.LENGTH_LONG).show()

            val myIntent = Intent(context, OkActivity::class.java)
            myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            myIntent.replaceExtras(intent)
            startActivity(context, myIntent, null)
        } else if (intent.action == "NOOK") {
            val myIntent = Intent(context, NoOkActivity::class.java)
            myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(context, myIntent, null)
        }

    }
}
