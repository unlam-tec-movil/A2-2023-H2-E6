package ar.edu.unlam.mobile.scaffold.data.game.repository.models

class OptionGame(
    val question: String,
    val answer: Option,
    var options: List<Option>,
) {
    fun isCorrect(option: Option): Boolean {
        return option == answer
    }

    fun shuffle() {
        this.options = options.shuffled()
    }
}
