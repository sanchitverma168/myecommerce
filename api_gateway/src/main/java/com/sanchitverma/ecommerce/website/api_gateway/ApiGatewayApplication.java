package com.sanchitverma.ecommerce.website.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
// @RestController
// @Configuration
public class ApiGatewayApplication {

    // @Bean
    // public RouteLocator myRoutes(RouteLocatorBuilder builder) {
    //     return builder.routes()
    //             .route(p -> p
    //             .path("/api/v1/cart_s/cart/")
    //             // .filters(f -> f.addRequestHeader("Hello", "World"))
    //             .uri("lb://CART_SERVICE"))
    //             .build();
    // }

	// @Bean
    // public RestClient.Builder restClientBuilder() {
    //     return RestClient.builder();
    // }

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
