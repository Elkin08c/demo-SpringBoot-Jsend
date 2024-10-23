package com.example.demo.controller

import com.example.demo.model.Model
import com.example.demo.response.JSendResponse
import jakarta.websocket.server.PathParam
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/home")
class HomeController {

    /*@GetMapping("/{id}")
    fun home(@PathVariable ("id") id: Int ): String {
        return "Hello, World! $id"
    }

    @GetMapping()
    fun home(@PathParam ("id") id: Int): String {
        return "Hello, World! $id"
    }*/

    @GetMapping()
    fun home(@RequestBody model:Model): String {
        return "Hello, World! ${model.id} ${model.name} ${model.age}"
    }
        @ExceptionHandler(Exception::class)
        fun handleException(ex: Exception): JSendResponse<Any> {
            return JSendResponse(
                status = "error",
                message = ex.message
            )
        }
    }
