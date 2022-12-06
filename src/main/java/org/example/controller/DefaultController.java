package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default")
@Slf4j
public class DefaultController {

    @GetMapping("/echo")
    public String echo(@RequestParam(value = "message") String message) {
        log.info(message);
        return message;
    }
}
