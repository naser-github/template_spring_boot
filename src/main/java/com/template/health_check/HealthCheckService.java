package com.template.health_check;

import org.springframework.stereotype.Component;

@Component
public class HealthCheckService implements HealthCheck{

    @Override
    public String healthCheck() {
        return "System is running";
    }
    
}