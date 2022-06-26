package com.company.team.ddd.riskcontrol.application.service;

import com.company.team.ddd.lottery.domain.valobj.LotteryContext;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
@Service
@FeignClient("RiskControl")
public class LotteryRiskService {

    @ResponseBody
    @RequestMapping(value = "/riskControl/acquire")
    public String acquire(LotteryContext lotteryContext) {
        return "";
    }
}
