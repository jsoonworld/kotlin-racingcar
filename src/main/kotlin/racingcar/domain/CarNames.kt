package racingcar.domain

@JvmInline
value class CarNames(private val raw: String) {
    fun split(): List<String> {
        require(raw.contains(",")) {
            "자동차 이름을 쉼표(,)를 기준으로 구분하여 입력해주세요."
        }

        val names = raw.split(",").map { it.trim() }

        require(names.all { it.isNotBlank() }) {
            "자동차 이름은 비어 있을 수 없습니다."
        }

        return names
    }
}

