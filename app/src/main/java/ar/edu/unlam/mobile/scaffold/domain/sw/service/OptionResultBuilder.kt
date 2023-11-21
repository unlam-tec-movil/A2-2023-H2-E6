package ar.edu.unlam.mobile.scaffold.domain.sw.service

import ar.edu.unlam.mobile.scaffold.data.game.repository.models.OptionGame
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResult
import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


    class OptionResultBuilder @Inject constructor(private val resultREpo: GameResultRepository) : ResultUseCase {

        override fun createResult(): Flow<GameResult> {
            return flow {
                resultREpo.getAllResults().collect {
                    val result = Result(content = it.)
                    val options = it.getOptions(3).toMutableList()
                    options.add(answer)
                    val optionGame = OptionGame(
                        question = "¿Cuál es la ${it.attributeName} del ${it.gameRawType} ${it.name}?",
                        answer = answer,
                        options = options,
                    )

                    emit(GameResult)
                }
            }
        }
}
/*
class OptionGameBuilder @Inject constructor(private val rawDataRepo: RawDataRepository) : GameUseCase {
    // Todo, si el content es de value "unkown" traerlo de nuevo
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
 */