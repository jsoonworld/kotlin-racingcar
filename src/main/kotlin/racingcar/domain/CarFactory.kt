package racingcar.domain

class CarFactory {
    fun create(input: String): Cars {
        val names = CarNameSplitter(input).split()
        val cars = names.map { Car(CarName.from(it), MoveCount.init()) }
        return Cars(cars)
    }
}