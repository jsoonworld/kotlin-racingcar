package racingcar.domain

import racingcar.view.OutputView

class Cars(
    private val values: List<Car>
) : Iterable<Car> by values {

    fun raceOnce(condition: MoveCondition): List<Pair<String, Int>> {
        moveAll(condition)
        return snapshot()
    }

    fun announceWinners(outputView: OutputView) {
        val winners = findWinners()
        outputView.printWinners(winners)
    }

    private fun moveAll(condition: MoveCondition) {
        values.forEach { car ->
            if (condition.canMove()) {
                car.forward()
            }
        }
    }

    private fun snapshot(): List<Pair<String, Int>> {
        return values.map { it.name() to it.position() }
    }

    private fun findWinners(): List<Car> {
        val maxPosition = values.maxOf { it.position() }
        return values.filter { it.position() == maxPosition }
    }
}