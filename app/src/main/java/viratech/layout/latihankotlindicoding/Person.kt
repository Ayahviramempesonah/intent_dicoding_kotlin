package viratech.layout.latihankotlindicoding

import android.os.Parcel
import android.os.Parcelable

data class Person(


    val name:String?,
    val age:Int?,
    val email:String?,
    val city:String?
) :Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel?, p1: Int) {

        p0?.writeString(name)
        p0?.writeValue(age)
        p0?.writeString(email)
        p0?.writeString(city)





    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }
}
