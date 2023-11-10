package ar.edu.unlam.mobile.scaffold.data.sw.network

import retrofit2.http.GET
import retrofit2.http.Path

interface SwApi {

    @GET("planets/{id}/")
    suspend fun getPlanet(@Path("id") planetId: Int): PlanetApiModel
}
