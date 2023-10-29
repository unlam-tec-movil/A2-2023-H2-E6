import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ar.edu.unlam.mobile.scaffold.data.Sw.network.PlanetaApiModel
import ar.edu.unlam.mobile.scaffold.data.Sw.network.SwApi
import ar.edu.unlam.mobile.scaffold.data.kitty.sw.repository.PlanetaDefaultRepsitory
import ar.edu.unlam.mobile.scaffold.ui.screens.ui.theme.MobileScaffoldingTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : ComponentActivity() {
    @Inject
    lateinit var swApi: SwApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileScaffoldingTheme {

                val swApiRepository = PlanetaDefaultRepsitory(swApi)
                val planetId = 1

                val callback = object : Callback<PlanetaApiModel> {
                    override fun onResponse(call: Call<PlanetaApiModel>, response: Response<PlanetaApiModel>) {
                        if (response.isSuccessful) {
                            val planet = response.body()

                        }
                    }

                    override fun onFailure(call: Call<PlanetaApiModel>, t: Throwable) {

                    }
                }


                swApiRepository.getPlanet(planetId, callback)
            }
        }
    }
    @Composable
    fun PlanetDetails(planeta: PlanetaApiModel) {
        Column {

            Text(text = "Nombre: ${planeta.name}")
            Text(text = "Clima: ${planeta.climate}")

        }
    }

    @Preview
    @Composable
    fun PlanetPreview(@PreviewParameter(PlanetaPreviewProvider::class) planeta: PlanetaApiModel) {
        PlanetDetails(planeta)
    }

    class PlanetaPreviewProvider : PreviewParameterProvider<PlanetaApiModel> {
        override val values: Sequence<PlanetaApiModel> = sequenceOf(

        )
    }

}