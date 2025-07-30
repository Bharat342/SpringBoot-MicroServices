package com.bharatnaik.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import java.util.Random;

@RestController
public class DataRestController {

    private static final String BACKEND_NAME = "redisService";

    @GetMapping("/data")
    @CircuitBreaker(name = BACKEND_NAME, fallbackMethod = "getDataFromDB")
    public String getDataFromRedis() {
        int rand = new Random().nextInt(10); // Generates a value between 0–9
        System.out.println("Random value = " + rand);

        if (rand <= 5) {
            throw new RuntimeException("Redis Server is Down");
        }

        return "✅ Data fetched from Redis (Main logic)";
    }

    // Fallback method must match original method signature + Throwable at the end
    public String getDataFromDB(Throwable t) {
        System.out.println("*** Fallback triggered: Redis is down, using DB instead ***");
        return "⚠️ Fallback: Data fetched from Database (Safe logic)";
    }
}
