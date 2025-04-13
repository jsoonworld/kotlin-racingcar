package racingcar.view

class OutputView {
    private val INPUT_CARNAME_MESSAGE: String = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"
    private val INPUT_TRY_TIMES_MESSAGE: String = "시도할 횟수는 몇 회인가요?"

    fun printInputCarNameMessage(){
        println(INPUT_CARNAME_MESSAGE)
    }

    fun printInputTryTimesMessage() {
        println(INPUT_TRY_TIMES_MESSAGE)
    }

}