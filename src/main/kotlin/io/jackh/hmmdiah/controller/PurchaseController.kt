package io.jackh.hmmdiah.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/purchase")
class PurchaseController {

    @GetMapping
    fun purchase() = "Welcome to the purchase controller"

}