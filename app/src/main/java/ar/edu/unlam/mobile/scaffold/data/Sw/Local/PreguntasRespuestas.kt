package ar.edu.unlam.mobile.scaffold.data.Sw.Local

data class PreguntasRepuestas(
    val id: Int,
    val pregunta: String,
    val respuesta: List<String>,
  //  val respuestaCorrecta: String
)

val preguntasRepuestas = listOf(

    PreguntasRepuestas(
        id = 1,
        pregunta = "¿Cuál es el nombre del planeta de origen de Anakin Skywalker?",
        respuesta = listOf(/*"Tatooine"trae la api,*/ "Coruscant", "Endor", "Hoth"),
       // respuestaCorrecta = "Tatooine"
    ),
    PreguntasRepuestas(
        id = 2,
        pregunta = "¿Qué especie es Yoda?",
        respuesta = listOf("Wookiee", "Twilek", "Mon Calamari", "Yoda es único"),
       // respuestaCorrecta = "Yoda es único"
    ),
    PreguntasRepuestas(
        id = 3,
        pregunta = "¿Quién es el padre de Luke Skywalker?",
        respuesta = listOf("Anakin Skywalker", "Obi-Wan Kenobi", "Han Solo", "Boba Fett"),
       // respuestaCorrecta = "Anakin Skywalker"
    ),
    PreguntasRepuestas(
        id = 4,
        pregunta = "¿Cuál es la nave insignia del Imperio Galáctico?",
        respuesta = listOf("Executor", "Imperial Star Destroyer", "Death Star", "TIE Fighter"),
     //   respuestaCorrecta = "Executor"
    ),
    PreguntasRepuestas(
        id = 5,
        pregunta = "¿Qué arma utiliza un Jedi?",
        respuesta = listOf("Sable de luz", "Blaster", "Bastón", "Lanzallamas"),
       // respuestaCorrecta = "Sable de luz"
    )
)

