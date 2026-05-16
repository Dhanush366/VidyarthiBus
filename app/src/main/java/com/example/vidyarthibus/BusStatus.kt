package com.example.vidyarthibus

data class BusStatus(

    val crowdLevel: Float = 0f,

    val crowdStatus: String = "",

    val updatedAt: Long = 0L
) {
}