package racingcar.service

import racingcar.domain.Cars
import racingcar.domain.DefaultMoveCondition
import racingcar.domain.NumberGenerator
import racingcar.view.OutputView

class RaceRunner(
    private val numberGenerator: NumberGenerator,
    private val outputView: OutputView
) {
    fun run(cars: Cars, tryCount: Int) {
        val moveCondition = DefaultMoveCondition(numberGenerator)

        outputView.printRoundResultIntro()
        repeat(tryCount) {
            val roundResult = cars.raceOnce(moveCondition)
            outputView.printRoundResult(roundResult)
        }

        cars.announceWinners(outputView)
    }
}
