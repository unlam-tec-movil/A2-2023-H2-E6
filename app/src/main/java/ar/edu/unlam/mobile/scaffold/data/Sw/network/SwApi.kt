package ar.edu.unlam.mobile.scaffold.data.Sw.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SwApi {
    @GET("planets/{id}/")
    fun getPlanet(@Path("id") planetId: Int): Call<Planeta> // Asegúrate de que Planeta esté correctamente importada
}

