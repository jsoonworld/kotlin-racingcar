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
}