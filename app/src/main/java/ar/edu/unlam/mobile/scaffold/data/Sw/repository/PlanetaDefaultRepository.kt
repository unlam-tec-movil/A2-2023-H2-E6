package ar.edu.unlam.mobile.scaffold.data.Sw.repository

import retrofit2.Callback
import ar.edu.unlam.mobile.scaffold.data.Sw.network.PlanetaApiModel
import ar.edu.unlam.mobile.scaffold.data.Sw.network.SwApi

class PlanetaDefaultRepository(private val swApi: SwApi) {
    fun getPlanet(planetId: Int, callback: Callback<PlanetaApiModel>) {
        // Realiza la llamada a la API utilizando swApi
        val call = swApi.getPlanet(planetId)
    }
}
