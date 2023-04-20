package com.example.app_superheroes

import com.google.gson.annotations.SerializedName

data class SuperHeroDetailResponse(
    @SerializedName("name") val name: String,
    @SerializedName("powerstats") val powerstats: PowerStatsResponse,
    @SerializedName("image") val image: SuperHeroImageDetailResponse,
    @SerializedName("biography") val biography: Biography,
    @SerializedName("connections") val connections: Connections
)

data class PowerStatsResponse(
    @SerializedName("intelligence") val intelligence: String,
    @SerializedName("strength") val strength: String,
    @SerializedName("speed") val speed: String,
    @SerializedName("durability") val durability: String,
    @SerializedName("power") val power: String,
    @SerializedName("combat") val combat: String
)

data class SuperHeroImageDetailResponse(@SerializedName("url") val url: String)

data class Biography(
    @SerializedName("full-name") val fullName: String,
    @SerializedName("publisher") val publisher: String,
    @SerializedName("first-appearance") val first_appearance: String
)

data class Connections(
    @SerializedName("group-affiliation") val group_affiliation: String
)