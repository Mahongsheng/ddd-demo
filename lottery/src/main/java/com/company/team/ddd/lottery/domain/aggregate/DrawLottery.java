package com.company.team.ddd.lottery.domain.aggregate;

import com.company.team.ddd.lottery.domain.valobj.AwardPool;
import com.company.team.ddd.lottery.domain.valobj.LotteryContext;

import java.util.List;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
public class DrawLottery {
    private int lotteryId; //抽奖id
    private List<AwardPool> awardPools; //奖池列表

    //getter & setter
    public void setLotteryId(int lotteryId) {
        if (lotteryId <= 0) {
            throw new IllegalArgumentException("非法的抽奖id");
        }
        this.lotteryId = lotteryId;
    }

    //根据抽奖入参context选择奖池
    public AwardPool chooseAwardPool(LotteryContext context) {
        if (context.getId() != 1) {
            return chooseAwardPoolByCityInfo(awardPools);
        } else {
            return chooseAwardPoolByScore(awardPools);
        }
    }

    //根据抽奖所在城市选择奖池
    private AwardPool chooseAwardPoolByCityInfo(List<AwardPool> awardPools) {
        int cityId = 1;
        for (AwardPool awardPool : awardPools) {
            if (awardPool.matchedCity(cityId)) {
                return awardPool;
            }
        }
        return null;
    }

    //根据抽奖活动得分选择奖池
    private AwardPool chooseAwardPoolByScore(List<AwardPool> awardPools) {
        return new AwardPool();
    }
}
