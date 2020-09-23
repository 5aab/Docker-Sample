package org.punjab.elastic.ora.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ElasticController {

    @GetMapping
    public String getHello() {
        return "Hello Kubernetes";
    }


}
