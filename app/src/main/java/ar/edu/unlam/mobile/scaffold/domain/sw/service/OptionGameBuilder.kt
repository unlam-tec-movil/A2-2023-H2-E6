package ar.edu.unlam.mobile.scaffold.domain.sw.service

import ar.edu.unlam.mobile.scaffold.data.game.repository.RawDataRepository
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option
import ar.edu.unlam.mobile.scaffold.data.game.repository.models.OptionGame
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class OptionGameBuilder @Inject constructor(private val rawDataRepo: RawDataRepository) : GameUseCase {

    override fun createGame(): Flow<OptionGame> {
        return flow {
            rawDataRepo.getRawData().collect {
                val answer = Option(content = it.attributeValue)
                val options = it.getOptions(3).toMutableList()
                options.add(answer)
                val optionGame = OptionGame(
                    question = "¿Cuál es la ${it.attributeName} del ${it.gameRawType} ${it.name}?",
                    answer = answer,
                    options = options,
                )
                optionGame.shuffle()
                emit(optionGame)
            }
        }
    }
}
