package com.jdbc.repositories

import com.jdbc.setup.DatabaseConnection

class EmployeeRepository {
    fun findCity(empId: Int): Int {
        val connection = DatabaseConnection().connectDatabase()
        val query = connection?.prepareStatement("SELECT pincode FROM employee where id = $empId")
        val result = query?.executeQuery()
        var pinCode = 0
        if (result != null) {
            while (result.next()){
                pinCode = result.getInt("pincode")
            }
        }
        return pinCode
    }

}
