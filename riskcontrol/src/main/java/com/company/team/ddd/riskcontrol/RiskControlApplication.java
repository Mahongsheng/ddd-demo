package com.company.team.ddd.riskcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
@SpringBootApplication
@EnableFeignClients
public class RiskControlApplication {
    public static void main(String[] args) {
        SpringApplication.run(RiskControlApplication.class, args);
    }
}
