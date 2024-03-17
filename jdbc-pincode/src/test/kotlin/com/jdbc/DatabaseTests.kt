package com.jdbc

import com.jdbc.setup.DatabaseConnection
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DatabaseTests {

    @Test
    fun `should connect to the jdbc database`(){
        val dbConnect = DatabaseConnection()
        val response = dbConnect.connectDatabase()
        assertTrue{response}
    }
}