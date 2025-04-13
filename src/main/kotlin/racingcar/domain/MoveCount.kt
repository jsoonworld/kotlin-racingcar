package racingcar.domain

@JvmInline
value class MoveCount private constructor(val value: Int){

    fun increase(): MoveCount = MoveCount(value + 1)

    companion object{
        fun from(value: Int): MoveCount {
            require(value >= 0){ "이동 횟수는 0 이상이어야 합니다."}
            return MoveCount(value)
        }
    }
}