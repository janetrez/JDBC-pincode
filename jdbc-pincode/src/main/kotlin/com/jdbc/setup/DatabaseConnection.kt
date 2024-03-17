package com.jdbc.setup

import java.sql.DriverManager

class DatabaseConnection {

    fun connectDatabase() :Boolean{
        val url = "jdbc:postgresql://localhost:5432/jdbc"
        val connection = DriverManager.getConnection(url)
        return connection.isValid(0)
    }
}