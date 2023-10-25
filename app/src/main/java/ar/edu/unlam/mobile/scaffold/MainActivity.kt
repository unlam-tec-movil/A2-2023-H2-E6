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
                    startDestination = "screenOne",
                ) {
                    composable("screenOne") {
                        ScreenOne(navController = navController)
                    }

                    composable(
                        route = "segundo/{id}",
                        arguments = listOf(navArgument("id") { type = NavType.IntType })
                    ) { entry -> // ktlint-disable trailing-comma-on-call-site
                        val id = entry.arguments?.getInt("id") ?: 1
                        SecondScreen(navController = navController, id = id)
                    }
                    composable(
                        route = "home/{id}",
                        arguments = listOf(navArgument("id") { type = NavType.IntType })
                    ) { entry ->
                        val id = entry.arguments?.getInt("id") ?: 1
                        ScreenOne(navController = navController)
                    }
                }
            }
        }
    }
}
/*class MainActivity : ComponentActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // Define tu sistema de navegación y rutas
                val navController = rememberNavController()


                    NavHost(
                        navController = navController,
                        startDestination = "screenOne"
                    ) {
                        composable("screenOne") { navBackStackEntry ->
                            val navController = rememberNavController()
                            ScreenOne(navController = navController)
                        }

                        composable(
                            route = "segundo/{id}",
                            arguments = listOf(navArgument("id") { type = NavType.IntType }),
                        ) { navBackStackEntry ->
                            val id = navBackStackEntry.arguments?.getInt("id") ?: 1

                            val controller
                            SecondScreen(controller = controller, id = id)
                        }
                    }
                        }


                    }
                }
            }


        }


/*@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    // Controller es el elemento que nos permite navegar entre pantallas. Tiene las acciones
    // para navegar como naviegate y también la información de en dónde se "encuentra" el usuario
    // a través del back stack
    val controller = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(controller = controller) },
        floatingActionButton = {
            IconButton(onClick = { controller.navigate("home") }) {
                Icon(Icons.Filled.Home, contentDescription = "Home")
            }
        },
    ) { paddingValue ->
        // NavHost es el componente que funciona como contenedor de los otros componentes que
        // podrán ser destinos de navegación.
        NavHost(navController = controller, startDestination = "home") {
            // composable es el componente que se usa para definir un destino de navegación.
            // Por parámetro recibe la ruta que se utilizará para navegar a dicho destino.
            composable("home") {
                // Home es el componente en sí que es el destino de navegación.
                HomeScreen(modifier = Modifier.padding(paddingValue))
            }
            composable(
                route = "segundo/{id}",
                arguments = listOf(navArgument("id") { type = NavType.IntType }),
            ) { navBackStackEntry ->
                val id = navBackStackEntry.arguments?.getInt("id") ?: 1
                SecondaryScreen(controller = controller, id = id)
            }
        }
    }
}
*/