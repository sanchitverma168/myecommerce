package com.sanchitverma.ecommerce.website.user_service.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/user")
// @V1APIControllerr
public class UserController {

    @GetMapping("/")
    public String getAllUsers(){
        return "hello from get All Users";
    }

}
