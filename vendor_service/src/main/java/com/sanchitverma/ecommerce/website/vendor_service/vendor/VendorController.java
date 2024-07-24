package com.sanchitverma.ecommerce.website.vendor_service.vendor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanchitverma.ecommerce.website.vendor_service.utils.V1APIControllerr;



@RestController
@RequestMapping("/vendor")
@V1APIControllerr
public class VendorController {

    @GetMapping("/")
    public String getAllVendors(){
        return "Hello from Get all vendors";
    }
}
