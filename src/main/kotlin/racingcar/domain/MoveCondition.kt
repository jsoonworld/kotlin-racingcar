package racingcar.domain

import camp.nextstep.edu.missionutils.Randoms

class MoveCondition(
   private val numberGenerator: NumberGenerator
) {
    fun canMove(): Boolean {
        return numberGenerator.generate() >= 4
    }
}