package com.worldremit.ktlint

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

class MathClass {

    fun add(first: BigDecimal, second: BigDecimal): BigDecimal {
        return first.add(second)
    }

    fun sub(first: BigDecimal, second: BigDecimal): BigDecimal {
        return first.subtract(second)
    }

    fun mul(first: BigDecimal, second: BigDecimal): BigDecimal {
        return first.multiply(second, MathContext(4, RoundingMode.HALF_UP))
    }

    fun div(first: BigDecimal, second: BigDecimal): BigDecimal {
        return first.divide(second, MathContext(4, RoundingMode.HALF_UP))
    }
}