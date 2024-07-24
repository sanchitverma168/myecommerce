package com.sanchitverma.ecommerce.website.category_service.category;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// @V1APIControllerr
@RestController
@RequestMapping("/api/v1/category_s")
public class CategoryController {

    @GetMapping("/all")
    public String getAllCategories() {
        return "hello from get all category";
    }
    

}
