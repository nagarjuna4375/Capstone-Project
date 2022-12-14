package com.ecommerce.Springbootecommerce.controller;

import com.ecommerce.Springbootecommerce.dto.Purchase;
import com.ecommerce.Springbootecommerce.dto.PurchaseResponse;
import com.ecommerce.Springbootecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}










