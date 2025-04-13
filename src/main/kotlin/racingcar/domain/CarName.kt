package racingcar.domain

@JvmInline
value class CarName private constructor(val value: String) {

    fun value(): String = value

    companion object{
        fun from(value: String): CarName{
            require(value.isNotBlank()) {"자동차 이름은 비어 있을 수 없습니다."}
            require(value.length <= 5) {"자동차 이름은 5자를 초과할 수 없습니다."}
            return CarName(value)
        }
    }
}