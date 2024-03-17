package com.jdbc

import com.jdbc.repositories.EmployeeRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class EmployeeTableTest {

    @Test
    fun `should retrieve the pinCode given the employee id`(){
        val empId = 1
        val employeeRepository = EmployeeRepository()
        val pinCode = employeeRepository.findCity(empId)

        Assertions.assertEquals(682507, pinCode)
    }
}