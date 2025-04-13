package racingcar.domain

class CarFactory {
    fun createFromNames(names: List<String>): Cars {
        val cars = names.map { Car(CarName.from(it), MoveCount.init()) }
        return Cars(cars)
    }
}
