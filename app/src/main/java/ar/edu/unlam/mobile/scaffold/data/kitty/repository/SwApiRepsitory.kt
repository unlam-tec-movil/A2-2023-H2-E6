package ar.edu.unlam.mobile.scaffold.data.kitty.repository

import ar.edu.unlam.mobile.scaffold.data.Sw.network.Planeta
import ar.edu.unlam.mobile.scaffold.data.Sw.network.SwApi
import ar.edu.unlam.mobile.scaffold.data.kitty.di.SwApiProvider
import retrofit2.Callback

class SwApiRepsitory(private val swApi: SwApi) {
    fun getPlanet(planetId: Int, callback: Callback<Planeta>) {
        // Realiza la llamada a la API utilizando swApi
        val call = swApi.getPlanet(planetId)



    }
}