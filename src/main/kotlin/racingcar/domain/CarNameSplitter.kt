package racingcar.domain

class CarNameSplitter(
    private val names: String
) {
    fun split(): List<String> {
        require(names.contains(",")) {
            "자동차 이름을 쉼표(,)를 기준으로 구분하여 입력해주세요."
        }

        val splitNames = names.split(",")
            .map { it.trim() }

        require(splitNames.all { it.isNotBlank() }) {
            "자동차 이름은 비어 있을 수 없습니다."
        }

        return splitNames
    }
}
