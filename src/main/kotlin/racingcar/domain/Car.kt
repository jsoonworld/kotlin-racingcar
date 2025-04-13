package racingcar.domain

class Car(
    private var moveCount: MoveCount = MoveCount.from(0)
) {
    fun forward() {
        moveCount = moveCount.increase()
    }
}