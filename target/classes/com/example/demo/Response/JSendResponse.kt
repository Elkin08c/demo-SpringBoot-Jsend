package com.example.demo.response

data class JSendResponse<T>(
    val status: String,
    val data: T? = null,
    val message: String? = null
){
}