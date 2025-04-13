package racingcar.view

import racingcar.domain.Car

class OutputView {
    private val INPUT_CARNAME_MESSAGE: String = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"
    private val INPUT_TRY_TIMES_MESSAGE: String = "시도할 횟수는 몇 회인가요?"
    private val ROUND_RESULT_INTRO_MESSAGE: String = "실행 결과"
    private val FINAL_WINNER_MESSAGE: String = "최종 우승자"

    fun printInputCarNameMessage(){
        println(INPUT_CARNAME_MESSAGE)
    }

    fun printInputTryTimesMessage() {
        println(INPUT_TRY_TIMES_MESSAGE)
    }

    fun printRoundResultIntro() {
        println(ROUND_RESULT_INTRO_MESSAGE)
    }

    fun printRoundResult(cars: List<Pair<String, Int>>) {
        cars.forEach{ (name, position) ->
            println("$name : ${"-".repeat(position)}")
        }
        println()
    }

    fun printWinners(winners: List<Car>) {
        val winnerNames = winners.joinToString(", ") { it.name() }
        println("$FINAL_WINNER_MESSAGE : $winnerNames")
    }
}