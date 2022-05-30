package viratech.layout.latihankotlindicoding

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

    val btnPindahActivyty1 : Button = findViewById(R.id.pindah_activity1)
        btnPindahActivyty1.setOnClickListener(this)

        val btnPindahActivityData :Button = findViewById(R.id.pindah_activity2)
        btnPindahActivityData.setOnClickListener(this)

        //inisialisasi button parcel
        val btnParcel : Button = findViewById(R.id.btn_parcel)
        btnParcel.setOnClickListener(this
        )

        //inisialisasi btn implicit intent
        val btnImplicit : Button = findViewById(R.id.btn_implicit_intent)
        btnImplicit.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
       when (p0?.id){
           R.id.pindah_activity1 ->{
            val moveIntent = Intent( this@MainActivity, MainActivity2::class.java)
               startActivity(moveIntent)
           }
           // menambahkan object intent
           R.id.pindah_activity2 ->{

               val moveIntentData = Intent(this@MainActivity,MainActivity2::class.java)
               moveIntentData.putExtra(MainActivity2.EXTRA_NAME,"ayah tamvan")
               moveIntentData.putExtra(MainActivity2.EXTRA_AGE,19)
               startActivity(moveIntentData)
           }

           R.id.btn_parcel ->{
               val person = Person (
                   "dicoding academy",
                   5,
                   "ada@gmail.com",
                   "depok"
                       )

               val pindahParcelCroot = Intent(this@MainActivity,BelajarParcelableActivity::class.java)
               pindahParcelCroot.putExtra(BelajarParcelableActivity.EXTRA_PERSON,person)
               startActivity(pindahParcelCroot)

           }
           R.id.btn_implicit_intent ->{
               val phoneNumb = "082125653573"
               val dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumb"))
               startActivity(dial)
           }

       }
    }
}