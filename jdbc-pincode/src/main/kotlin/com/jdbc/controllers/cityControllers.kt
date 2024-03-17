package com.jdbc.controllers

import com.jdbc.repositories.CitiesRepository
import com.jdbc.repositories.EmployeeRepository
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Put


@Controller("/updateCity")
class cityControllers{

    @Put("/{pinCode}/{newCity}")
    fun updateCity(@PathVariable pinCode : Int, @PathVariable newCity : String) : HttpResponse<Any>{
        CitiesRepository().updateCity(pinCode,newCity)
        EmployeeRepository().updateCity(pinCode,newCity)
        return HttpResponse.ok()
    }


}