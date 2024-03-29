package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

data class User(
        val id:String,
        var firstName:String?,
        var lastName:String?,
        var avatar: String?,
        var rating: Int = 0,
        var respect: Int = 0,
        val lastVisit: Date? = null,
        val isOnline: Boolean = false
){

    constructor ( id:String, firstName:String?, lastName:String?): this(
            id = id,
            firstName = firstName,
            lastName = lastName,
            avatar = null
    )

    constructor(id: String) : this(id, "John", "Doe $id" )

    init {
        println("It's alive!!!${if(lastName==="Doe") "His name is $firstName $lastName" else "And his name is $firstName $lastName!!!" }")
        /*+
        "${getIntro()}")*/

    }

    /*private fun getIntro()="""
        tu tu rtyr
        rtyty
         tu tu rtyr
        rtyty
         tu tu rtyr
        rtyty
    """.trimIndent()

    fun printMe():Unit{
        println("""
            id: $id
            firstName: $firstName
            lastName: $lastName
            avatar: $avatar
            rating: $rating
            respect: $respect
            lastVisit $lastVisit
            isOnline: $isOnline
        """.trimIndent())
    }*/

    companion object Factory{
        private var lastId :Int = -1
        fun makeUser(fullName:String?) :User{
            lastId++

            val (firstName, lastName ) = Utils.parseFullName(fullName)
            return User( id= "$lastId", firstName = firstName , lastName = lastName )
        }

    }
}