package org.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("rest-server")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}
