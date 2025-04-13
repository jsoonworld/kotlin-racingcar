package racingcar.domain

class Car(
    private var moveCount: Int = 0
) {
    fun forward() {
        moveCount++
    }
}