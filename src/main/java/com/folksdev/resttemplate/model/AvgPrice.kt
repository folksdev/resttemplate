package com.folksdev.resttemplate.model

import java.math.BigDecimal

data class AvgPrice(
    val mins: Int,
    val price: BigDecimal,
    var symbol: String?
)
