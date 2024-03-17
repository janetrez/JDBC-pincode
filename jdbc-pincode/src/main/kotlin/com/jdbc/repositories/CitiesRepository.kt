package com.jdbc.repositories

import com.jdbc.setup.DatabaseConnection

class CitiesRepository {
    fun findCity(pinCode: Int): String {
        val connection = DatabaseConnection().connectDatabase()
        var city = ""
        val query = connection?.prepareStatement("SELECT name FROM cities where pincode = $pinCode")
        val result = query?.executeQuery()
        if (result != null) {
            while (result.next()){
                city = result.getString("name")
            }
        }
        return city
    }

    fun updateCity(pinCode : Int, name : String){
        val connection = DatabaseConnection().connectDatabase()
        val query = connection?.prepareStatement("UPDATE cities SET name='$name' where pincode = $pinCode")
        query?.executeUpdate()
    }

}
