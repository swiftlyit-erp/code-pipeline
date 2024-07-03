package org.example.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping
    public ResponseEntity<String> healthcheck() {
        return ResponseEntity.ok().body("Service Up");

    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok().body("Test Application");

    }
}
