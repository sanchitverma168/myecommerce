package com.sanchitverma.ecommerce.website.product_service.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanchitverma.ecommerce.website.product_service.utils.V1APIControllerr;


@RestController
@RequestMapping("/product")
@V1APIControllerr
public class ProductController {

    @GetMapping("/getAllProducts")
    public String getAllProducts(@RequestParam String param) {
        return "hello from get all products";
    }
    

}
