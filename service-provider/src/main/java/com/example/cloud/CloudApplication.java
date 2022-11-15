package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }

    @RestController
    class EchoController {
        @RequestMapping(value = "/echo/{code}", method = RequestMethod.GET)
        public String echo(@PathVariable String code) {
            return "Hello Nacos Discovery " + code;
        }
    }


    @RestController
    class EeeController {
        @RequestMapping(value = "/eee/count", method = RequestMethod.POST)
        public String echo(@PathVariable String code) {
            return "Hello Nacos Discovery " + code;
        }
    }
}
