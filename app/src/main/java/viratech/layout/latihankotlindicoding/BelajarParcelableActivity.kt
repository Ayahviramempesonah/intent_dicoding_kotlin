package viratech.layout.latihankotlindicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BelajarParcelableActivity : AppCompatActivity() {

    // kita tambahkan object untuk dapat menerima object dari activity asal

    companion object{
        const val EXTRA_PERSON ="extra_person"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_parcelable)


        val tvParcelable : TextView = findViewById(R.id.tv_parcelable)

        val person= intent.getParcelableExtra<Person>(EXTRA_PERSON) as Person

        val text = "name: ${person.name.toString()}, \n ${person.age.toString()}, \n ${person.city.toString()}, \n ${person.email.toString()}"
        tvParcelable.text=text

    }
}