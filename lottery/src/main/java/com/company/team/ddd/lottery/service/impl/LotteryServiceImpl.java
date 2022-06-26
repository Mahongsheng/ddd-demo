package com.company.team.ddd.lottery.service.impl;

import com.company.team.ddd.lottery.common.Response;
import com.company.team.ddd.lottery.domain.aggregate.DrawLottery;
import com.company.team.ddd.lottery.domain.entity.Award;
import com.company.team.ddd.lottery.domain.valobj.AwardPool;
import com.company.team.ddd.lottery.domain.valobj.LotteryContext;
import com.company.team.ddd.lottery.repo.repository.DrawLotteryRepository;
import com.company.team.ddd.lottery.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
@Service
public class LotteryServiceImpl implements LotteryService {
    @Autowired
    private DrawLotteryRepository drawLotteryRepo;
//    @Autowired
//    private AwardSendService awardSendService;
//    @Autowired
//    private AwardCounterFacade awardCounterFacade;

    @Override
    public Response issueLottery(LotteryContext lotteryContext) {
        DrawLottery drawLottery = drawLotteryRepo.getDrawLotteryById(lotteryContext.getLotteryId());//获取抽奖配置聚合根
//        awardCounterFacade.incrTryCount(lotteryContext);//增加抽奖计数信息
        AwardPool awardPool = drawLottery.chooseAwardPool(lotteryContext);//选中奖池
//        Award award = awardPool.randomChooseAward();//选中奖品
        return new Response();//发出奖品实体
    }
}
