
package com.example.healthmonitor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.Instant;
import java.util.Map;

@RestController
public class HealthController {
    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/health/details")
    public Map<String, Object> details() {
        return Map.of(
            "status", "UP",
            "service", "api-health-monitor",
            "timestamp", Instant.now().toString()
        );
    }
}
