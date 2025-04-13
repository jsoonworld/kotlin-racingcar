package racingcar.domain

import racingcar.view.OutputView

class RaceManager(
    private val cars: Cars,
    private val tryCount: Int,
    private val moveCondition: MoveCondition,
    private val outputView: OutputView
) {
    fun run() {
        outputView.printRoundResultIntro()
        repeat(tryCount) {
            cars.moveAll(moveCondition)
            outputView.printRoundResult(cars)
        }
    }
}