package com.company.team.ddd.lottery.repo.repository;

import com.company.team.ddd.lottery.domain.aggregate.DrawLottery;
import com.company.team.ddd.lottery.repo.cache.DrawLotteryCacheAccessObj;
import com.company.team.ddd.lottery.repo.dao.AwardDao;
import com.company.team.ddd.lottery.repo.dao.AwardPoolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
@Repository
public class DrawLotteryRepository {
    @Autowired
    private AwardDao awardDao;
    @Autowired
    private AwardPoolDao awardPoolDao;
    @Autowired
    private DrawLotteryCacheAccessObj drawLotteryCacheAccessObj;

    public DrawLottery getDrawLotteryById(int lotteryId) {
        DrawLottery drawLottery = drawLotteryCacheAccessObj.get(lotteryId);
        if (drawLottery != null) {
            return drawLottery;
        }
        drawLottery = getDrawLotteryFromDB(lotteryId);
        drawLotteryCacheAccessObj.add(lotteryId, drawLottery);
        return drawLottery;
    }

    private DrawLottery getDrawLotteryFromDB(int lotteryId) {
        return null;
    }
}
