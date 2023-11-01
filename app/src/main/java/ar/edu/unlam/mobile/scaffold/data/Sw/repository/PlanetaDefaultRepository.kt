package ar.edu.unlam.mobile.scaffold.data.Sw.repository

import ar.edu.unlam.mobile.scaffold.data.Sw.network.PlanetaApiModel
import ar.edu.unlam.mobile.scaffold.data.Sw.network.SwApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Callback
class PlanetaDefaultRepsitory(private val swApi: SwApi) {
    fun getPlanet(planetId: Int, callback: Callback<PlanetaApiModel>) {
        // Realiza la llamada a la API utilizando swApi
        val call = swApi.getPlanet(planetId)
    }
}