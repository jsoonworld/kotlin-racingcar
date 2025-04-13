package racingcar.view

class OutputView {
    private val INPUT_CARNAME_MESSAGE: String = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"

    fun printInputCarNameMessage(){
        println(INPUT_CARNAME_MESSAGE)
    }

}