package viratech.layout.latihankotlindicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    // deklarasi object untuk menerima data dari activity asal

    companion object{

        const val EXTRA_AGE="extra_age"
        const val EXTRA_NAME="extra_name"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        val tvDataReceived : TextView = findViewById(R.id.tv_activity2)


        // untuk menerioma data dari activity asal kondsikan seperti inni

        val name=intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE,0)

        val text ="name : $name , your age $age"
        tvDataReceived.text=text






    }
}