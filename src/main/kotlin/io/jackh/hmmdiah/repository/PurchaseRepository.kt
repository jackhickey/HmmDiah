package io.jackh.hmmdiah.repository

import io.jackh.hmmdiah.model.Purchase
import org.springframework.data.repository.CrudRepository

interface PurchaseRepository : CrudRepository<Purchase, Long> {
    fun findByTag(tag: String): List<Purchase>
    fun save(purchase: Purchase): Purchase
}