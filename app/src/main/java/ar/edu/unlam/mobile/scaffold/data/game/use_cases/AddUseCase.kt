package ar.edu.unlam.mobile.scaffold.data.game.use_cases

import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity
import ar.edu.unlam.mobile.scaffold.data.result.repository.GameResultRepository
import javax.inject.Inject

class AddUseCase @Inject constructor(
    private val repository: GameResultRepository
){
   suspend operator fun invoke (result: GameResultEntity) = repository.insert(result)

}