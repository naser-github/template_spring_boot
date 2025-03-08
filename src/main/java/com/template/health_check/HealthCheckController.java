package com.template.health_check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    private final HealthCheck healthCheck;

    @Autowired
    private HealthCheckController(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    @GetMapping("/health")
    public String healthCheck() {
        return healthCheck.healthCheck();
    }
}