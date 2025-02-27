package com.manriquetavi.bootcampsaleforce

import com.google.gson.annotations.SerializedName

data class Name(
    @SerializedName("title") val title: String,
    @SerializedName("first") val first: String,
    @SerializedName("last") val last: String
)

data class Picture(
    @SerializedName("large") val large: String
)

data class User(
    @SerializedName("name") val name: Name,
    @SerializedName("picture") val picture: Picture,
)

data class ApiResponse(
    @SerializedName("results") val results: List<User>
)
