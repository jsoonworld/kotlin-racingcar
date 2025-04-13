package racingcar.service

import racingcar.controller.CarInitializer
import racingcar.domain.Cars
import racingcar.view.InputView
import racingcar.view.OutputView

class GameSetup(
    private val inputView: InputView,
    private val outputView: OutputView,
    private val carInitializer: CarInitializer
) {
    fun prepareCars(): Cars {
        outputView.printInputCarNameMessage()
        val input = inputView.readCarNames()
        return carInitializer.initialize(input)
    }

    fun prepareTryCount(): Int {
        outputView.printInputTryTimesMessage()
        return inputView.readTryTimes().toInt()
    }
}
