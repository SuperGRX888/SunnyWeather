package com.example.sunnyweather.logic.model

import android.provider.CallLog.Locations
import com.google.gson.annotations.SerializedName
import okhttp3.Address

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location,
           @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)