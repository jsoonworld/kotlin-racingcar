package racingcar.domain

class DefaultMoveCondition(
    private val numberGenerator: NumberGenerator
) : MoveCondition {
    override fun canMove(): Boolean {
        return numberGenerator.generate() >= 4
    }
}