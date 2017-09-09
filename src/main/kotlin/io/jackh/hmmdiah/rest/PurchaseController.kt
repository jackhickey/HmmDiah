package io.jackh.hmmdiah.rest

import io.jackh.hmmdiah.model.Purchase
import io.jackh.hmmdiah.repository.PurchaseRepository
import org.springframework.web.bind.annotation.*
import java.time.Instant

@RestController
@RequestMapping("/purchase")
class PurchaseController(val repository: PurchaseRepository) {

    @GetMapping("/{tag}")
    fun findPurchaseByTag(@PathVariable tag:String) = repository.findByTag(tag)

    @PostMapping
    fun purchase(@RequestBody purchase: Purchase): Purchase {
        purchase.time = Instant.now()
        repository.save(purchase)
        return purchase
    }


}