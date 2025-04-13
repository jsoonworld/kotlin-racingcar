package racingcar.domain

class Cars(
    private val values: List<Car>
) : Iterable<Car> by values {

    fun findByName(name: String): Car?{
        return values.find { it.name() == name }
    }

    fun all(): List<Car> = values
}