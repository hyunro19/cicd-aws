package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/default")
@Slf4j
public class DefaultController {

    @GetMapping("/echo")
    public String echo(@RequestParam(value = "message") String message) {
        StringBuilder sb = new StringBuilder();
        sb.append(message).append("\n")
                .append(new Date()).append("\n");
        log.info(sb.toString());
        return sb.toString();
    }
}
