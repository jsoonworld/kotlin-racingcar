package racingcar.controller

import racingcar.domain.*
import racingcar.view.InputView
import racingcar.view.OutputView

class RaceController(
    private val inputView: InputView,
    private val outputView: OutputView,
    private val carFactory: CarFactory,
    private val numberGenerator: NumberGenerator
) {
    fun run(){
        val cars = readCarNamesOrExit()
        val tryTimes = readTryCountOrExit().toInt()
        val moveCondition = MoveCondition(numberGenerator)
        val manager = RaceManager(cars, tryTimes, moveCondition, outputView)
        manager.run()
    }

    private fun readCarNamesOrExit(): Cars{
        return try {
            outputView.printInputCarNameMessage()
            val input = inputView.readCarNames()
            carFactory.create(input)
        } catch (e: IllegalArgumentException) {
            throw e
        }
    }

    private fun readTryCountOrExit(): String{
        return try {
            outputView.printInputTryTimesMessage()
            inputView.readTryTimes()
        } catch (e: IllegalArgumentException) {
            throw e
        }
    }
}