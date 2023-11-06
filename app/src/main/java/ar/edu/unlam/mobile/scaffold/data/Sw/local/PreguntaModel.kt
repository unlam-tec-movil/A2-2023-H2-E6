package ar.edu.unlam.mobile.scaffold.data.Sw.local

data class PreguntaModel(
    val question: String,
    val answer1: String,
    val answer2: String,
    val answer3: String
){
    fun getPregunta(): PreguntaModel {
        return PreguntaModel(
            question = question,
            answer1 = answer1,
            answer2 = answer2,
            answer3 = answer3
        )
    }
}


