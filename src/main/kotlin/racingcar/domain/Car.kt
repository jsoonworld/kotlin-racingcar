package racingcar.domain

class Car(
    private val name: CarName,
    private var moveCount: MoveCount
) {
    fun forward() {
        moveCount = moveCount.increase()
    }

    fun name(): String = name.value()
    fun position(): Int = moveCount.value()
}
