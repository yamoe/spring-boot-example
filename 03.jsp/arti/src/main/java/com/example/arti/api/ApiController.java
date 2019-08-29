package com.example.arti.api;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping(value = "api")
public class ApiController {

    @GetMapping(value = "values")
    public String[] GetValues() {
        log.info("Values");
        return new String[]{"value1", "value2"};
    }

}
