package ar.edu.unlam.mobile.scaffold.data.game.repository.models

interface RawData {
    var gameRawType: String
    var name: String
    var attributeName: String
    var attributeValue: String

    fun getOptions(size: Int): List<Option>
}
