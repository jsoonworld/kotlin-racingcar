package racingcar.controller

import racingcar.domain.CarFactory
import racingcar.domain.Cars
import racingcar.domain.CarNames

class CarInitializer(
    private val carFactory: CarFactory
) {
    fun initialize(input: String): Cars {
        val names = CarNames(input).split()
        return carFactory.createFromNames(names)
    }
}
