package racingcar.domain

class Cars(
    private val values: List<Car>
) : Iterable<Car> by values {

    fun moveAll(condition: MoveCondition) {
        values.forEach { car ->
            if (condition.canMove()) {
                car.forward()
            }
        }
    }

    fun findWinners(): List<Car> {
        val maxPosition = values.maxOf { it.position() }
        return values.filter { it.position() == maxPosition }
    }
}