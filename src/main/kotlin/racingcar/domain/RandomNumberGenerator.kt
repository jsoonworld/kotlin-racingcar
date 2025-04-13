package racingcar.domain

import camp.nextstep.edu.missionutils.Randoms

object RandomNumberGenerator : NumberGenerator {
    override fun generate(): Int {
        return Randoms.pickNumberInRange(0, 9)
    }
}