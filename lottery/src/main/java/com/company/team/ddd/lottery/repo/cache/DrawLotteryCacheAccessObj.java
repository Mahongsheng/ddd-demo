package com.company.team.ddd.lottery.repo.cache;

import com.company.team.ddd.lottery.domain.aggregate.DrawLottery;
import org.springframework.stereotype.Repository;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
@Repository
public class DrawLotteryCacheAccessObj {

    public void add(int lotteryId, DrawLottery drawLottery) {
    }

    public DrawLottery get(int lotteryId) {
        return null;
    }
}
