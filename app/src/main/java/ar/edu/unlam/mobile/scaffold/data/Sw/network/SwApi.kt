package ar.edu.unlam.mobile.scaffold.data.Sw.network

import retrofit2.http.GET

interface SwApi {

    @GET ("https://swapi.dev/api/planets/1/")
    suspend fun getPregunta():List<SwApi>
    

}