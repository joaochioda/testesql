package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {

    private final JdbcTemplate jdbcTemplate;

    public ShopController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/")
    public String hello() {
        return "oi my love";
    }

    @GetMapping("/test")
    public String test() {
        String currentTimestamp = jdbcTemplate.queryForObject("SELECT CURRENT_TIMESTAMP()", String.class);
        return "CURRENT TIMESTAMP: " + currentTimestamp;
    }
}