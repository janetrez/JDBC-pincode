package com.jdbc.setup

import java.sql.Connection
import java.sql.DriverManager

class DatabaseConnection {

    fun connectDatabase(): Connection? {
        val url = "jdbc:postgresql://localhost:5432/jdbc"
        val connection = DriverManager.getConnection(url)
        return connection
    }
}