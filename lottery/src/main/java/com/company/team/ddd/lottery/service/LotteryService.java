package com.company.team.ddd.lottery.service;

import com.company.team.ddd.lottery.common.Response;
import com.company.team.ddd.lottery.domain.valobj.LotteryContext;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
public interface LotteryService {
    Response issueLottery(LotteryContext lotteryContext);
}