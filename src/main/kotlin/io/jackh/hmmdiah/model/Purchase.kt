package io.jackh.hmmdiah.model

import java.math.BigDecimal
import java.time.Instant

class Purchase() {
    lateinit var description: String
    lateinit var cost: BigDecimal
    lateinit var time: Instant
    lateinit var tag: String

    constructor(
            description: String,
            cost: BigDecimal,
            time: Instant,
            tag: String
    ) : this() {
        this.description = description
        this.cost = cost
        this.time = time
        this.tag = tag
    }
}
