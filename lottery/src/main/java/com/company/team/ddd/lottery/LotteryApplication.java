package com.company.team.ddd.lottery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = {"com.company.team.ddd.riskcontrol.*"})
public class LotteryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LotteryApplication.class, args);
    }
}
