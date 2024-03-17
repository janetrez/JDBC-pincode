package com.jdbc

import com.jdbc.repositories.CitiesRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CitiesTableTest {

    @Test
    fun `should retrieve city from table cities given the pincode`(){
        val pinCode = 682507
        val citiesRepository = CitiesRepository()
        val city = citiesRepository.findCity(pinCode)

        assertEquals("Pune",city)
    }
}