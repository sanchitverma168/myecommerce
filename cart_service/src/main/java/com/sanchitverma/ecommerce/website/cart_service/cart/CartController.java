package com.sanchitverma.ecommerce.website.cart_service.cart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cart_s/cart")
// @V1APIControllerr
public class CartController {

    @GetMapping("/getAll")
    public String getHome(){
        return "hello from cart service sanchit";
    }

}
