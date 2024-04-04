package com.shivatube;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ELKController {

    private static final Logger logger = LogManager.getLogger(ELKController.class);

    @GetMapping(path = "/welcome")
    public ResponseEntity<String> welcome() {
        logger.info("Welcome to ELK Demo");
        return ResponseEntity.ok("Hello Everyone !!!");
    }
}
