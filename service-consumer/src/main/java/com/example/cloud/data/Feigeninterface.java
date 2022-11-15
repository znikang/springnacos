package com.example.cloud.data;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("service-provider")
public interface Feigeninterface {

    @PostMapping("/eee/count")
    String query(@RequestBody String query);

    @GetMapping("/echo/{code}")
    String count(@PathVariable String code);
}
