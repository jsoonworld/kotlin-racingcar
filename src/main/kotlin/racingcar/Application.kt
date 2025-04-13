package racingcar

import racingcar.controller.RaceController
import racingcar.domain.CarFactory
import racingcar.domain.NumberGenerator
import racingcar.domain.RandomNumberGenerator
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    val inputView = InputView()
    val outputView = OutputView()
    val carFactory = CarFactory()
    val numberGenerator: NumberGenerator = RandomNumberGenerator
    val raceController = RaceController(inputView, outputView, carFactory, numberGenerator)
    raceController.run()
}
