package racingcar.controller

import racingcar.service.GameSetup
import racingcar.service.RaceRunner

class RaceController(
    private val setup: GameSetup,
    private val runner: RaceRunner
) {
    fun run() {
        val cars = setup.prepareCars()
        val tryCount = setup.prepareTryCount()
        runner.run(cars, tryCount)
    }
}
