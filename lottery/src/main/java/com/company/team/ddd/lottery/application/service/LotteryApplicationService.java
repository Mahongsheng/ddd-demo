package com.company.team.ddd.lottery.application.service;

import com.company.team.ddd.lottery.common.Response;
import com.company.team.ddd.lottery.domain.valobj.LotteryContext;
import com.company.team.ddd.lottery.service.LotteryService;
import com.company.team.ddd.riskcontrol.application.service.LotteryRiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
@Service
public class LotteryApplicationService {

    @Autowired
    private LotteryRiskService riskService;

    @Autowired
    private LotteryService lotteryService;

    //用户参与抽奖活动
    public Response participateLottery(LotteryContext lotteryContext) {
        //校验用户登录信息
        validateLoginInfo(lotteryContext);
        //校验风控
        String riskToken = riskService.acquire(lotteryContext);

        //抽奖并返回结果
        Response issueResponse = lotteryService.issueLottery(lotteryContext);
        return new Response();
    }

    private void validateLoginInfo(LotteryContext lotteryContext) {
    }
}
