package ar.edu.unlam.mobile.scaffold

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import ar.edu.unlam.mobile.scaffold.ui.screens.ScreenOne
import ar.edu.unlam.mobile.scaffold.ui.screens.SecondScreen
import ar.edu.unlam.mobile.scaffold.ui.theme.MyApplicationTheme
import dagger.hilt.android.AndroidEntryPoint
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "screenOne"
                ) {
                    composable("screenOne") {
                        ScreenOne(navController = navController)
                    }

                    composable(
                        route = "segundo/{id}",
                        arguments = listOf(navArgument("id") { type = NavType.IntType })
                    ) { entry ->
                        val id = entry.arguments?.getInt("id") ?: 1
                        SecondScreen(navController = navController, id = id)
                    }
                }
            }
        }
    }
}
