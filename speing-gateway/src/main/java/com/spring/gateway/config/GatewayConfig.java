package com.spring.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator getRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route
                (
                        p -> p.path("/get")
                        .filters(f ->
                              f.addRequestHeader("sp-Header","the header")
                              .addRequestParameter("sp-Param","employee")
                        )
                        .uri("http://httpbin.org:80")
                )
                .route
                 (
                         p -> p.path("/football-players/**")
                        .uri("lb://football-players/")
                )
                .route
                 (
                         p -> p.path("/team-players/**")
                         .uri("lb://team-service/")
                 )
                .route
                (
                        p -> p.path("/team/**")
                        .filters(f -> f.rewritePath("/team/","/team-players/"))
                        .uri("lb://team-service/")
                )
                .build();
    }
}
