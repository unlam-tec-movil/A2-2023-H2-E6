package ar.edu.unlam.mobile.scaffold

import OptionGameScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import ar.edu.unlam.mobile.scaffold.ui.screens.OptionResultScreen
import ar.edu.unlam.mobile.scaffold.ui.screens.ScreenOne
import ar.edu.unlam.mobile.scaffold.ui.theme.MyApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Suppress("ktlint:standard:trailing-comma-on-call-site")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val snackbarHostState = remember { SnackbarHostState() }
            val navController = rememberNavController()
            MyApplicationTheme {
                Scaffold(
                    snackbarHost = { SnackbarHost(snackbarHostState) },
                ) { paddingValues ->
                    NavHost(
                        navController = navController,
                        startDestination = "screenOne",
                    ) {
                        composable("screenOne") {
                            ScreenOne(
                                modifier = Modifier.padding(paddingValues),
                                snackbarHostState = snackbarHostState,
                                navController = navController,
                            )
                        }

                        composable(
                            route = "segundo/{id}",
                            arguments = listOf(navArgument("id") { type = NavType.IntType }),
                        ) { entry ->
                            val id = entry.arguments?.getInt("id") ?: 1
                            OptionGameScreen(
                                // modifier = Modifier.padding(paddingValues),
                                snackbarHostState = snackbarHostState,
                                navController = navController,
                            )
                        }
                        composable(
                            route = "resultado/{id}",
                            arguments = listOf(navArgument("id") { type = NavType.IntType }),
                        ) { entry ->
                            val id = entry.arguments?.getInt("id") ?: 2
                            OptionResultScreen(
                                // modifier = Modifier.padding(paddingValues),
                                navController = navController,

                            )
                        }
                        composable(
                            route = "home/{id}",
                            arguments = listOf(navArgument("id") { type = NavType.IntType }),
                        ) { entry ->
                            val id = entry.arguments?.getInt("id") ?: 1
                            ScreenOne(
                                snackbarHostState = snackbarHostState,
                                navController = navController,
                            )
                        }
                    }
                }
            }
        }
    }
}
