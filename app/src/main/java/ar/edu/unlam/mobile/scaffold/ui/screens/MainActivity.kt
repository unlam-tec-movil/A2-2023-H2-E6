import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ar.edu.unlam.mobile.scaffold.data.Sw.network.Planeta
import ar.edu.unlam.mobile.scaffold.data.Sw.network.SwApi
import ar.edu.unlam.mobile.scaffold.data.kitty.repository.SwApiRepsitory
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

                val swApiRepository = SwApiRepsitory(swApi)
                val planetId = 1

                val callback = object : Callback<Planeta> {
                    override fun onResponse(call: Call<Planeta>, response: Response<Planeta>) {
                        if (response.isSuccessful) {
                            val planet = response.body()

                        }
                    }

                    override fun onFailure(call: Call<Planeta>, t: Throwable) {

                    }
                }


                swApiRepository.getPlanet(planetId, callback)
            }
        }
    }
    @Composable
    fun PlanetDetails(planeta: Planeta) {
        Column {

            Text(text = "Nombre: ${planeta.name}")
            Text(text = "Clima: ${planeta.climate}")

        }
    }

    @Preview
    @Composable
    fun PlanetPreview(@PreviewParameter(PlanetaPreviewProvider::class) planeta: Planeta) {
        PlanetDetails(planeta)
    }

    class PlanetaPreviewProvider : PreviewParameterProvider<Planeta> {
        override val values: Sequence<Planeta> = sequenceOf(

        )
    }

}