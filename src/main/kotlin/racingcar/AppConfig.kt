package racingcar

import racingcar.controller.CarInitializer
import racingcar.controller.RaceController
import racingcar.domain.CarFactory
import racingcar.domain.RandomNumberGenerator
import racingcar.service.GameSetup
import racingcar.service.RaceRunner
import racingcar.view.InputView
import racingcar.view.OutputView

object AppConfig {
    fun raceController(): RaceController {
        val inputView = InputView()
        val outputView = OutputView()
        val carFactory = CarFactory()
        val carInitializer = CarInitializer(carFactory)
        val gameSetup = GameSetup(inputView, outputView, carInitializer)
        val numberGenerator = RandomNumberGenerator
        val raceRunner = RaceRunner(numberGenerator, outputView)

        return RaceController(gameSetup, raceRunner)
    }
}

