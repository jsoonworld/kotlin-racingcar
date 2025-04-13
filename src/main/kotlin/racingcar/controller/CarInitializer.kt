package racingcar.controller

import racingcar.domain.CarFactory
import racingcar.domain.Cars

class CarInitializer(
    private val carFactory: CarFactory
) {
    fun initializeCar(input: String): Cars {
        return carFactory.create(input)
    }
}