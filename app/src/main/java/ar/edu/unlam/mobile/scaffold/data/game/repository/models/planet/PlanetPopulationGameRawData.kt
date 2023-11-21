package ar.edu.unlam.mobile.scaffold.data.game.repository.models.planet

import ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.RawData
import java.util.Random

const val FIRST_DIGIT_RANDOM_BOUND = 8
const val SECOND_DIGIT_RANDOM_BOUND = 8
const val MIN_RANDOM_SIZE = 4

class PlanetPopulationGameRawData(
    override var gameRawType: String,
    override var name: String,
    override var attributeName: String,
    override var attributeValue: String,
) : RawData {


    override fun getOptions(size: Int): List<Option> {
        val options = mutableListOf<Option>()
        val random = Random()
        for (i in 0 until size) {
            val firstRandom = random.nextInt(FIRST_DIGIT_RANDOM_BOUND) + 1
            val secondRanom = random.nextInt(SECOND_DIGIT_RANDOM_BOUND) + MIN_RANDOM_SIZE
            options.add(
                Option(
                    content = firstRandom.toString() + buildRandomFakeNumber(secondRanom),
                ),
            )
        }

        return options
    }

    fun buildRandomFakeNumber(size: Int): String {
        var returnString = ""
        for (i in 0 until size) {
            returnString += "0"
        }

        return returnString
    }
}
