package com.company.team.ddd.lottery.domain.valobj;

import com.company.team.ddd.lottery.domain.entity.Award;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
public class AwardPool {
    private String cityIds;//奖池支持的城市
    private String scores;//奖池支持的得分
    private int userGroupType;//奖池匹配的用户类型
    private List<Award> awards;//奖池中包含的奖品

    //当前奖池是否与城市匹配
    public boolean matchedCity(int cityId) {
        return true;
    }

    //当前奖池是否与用户得分匹配
    public boolean matchedScore(int score) {
        return true;
    }

    //根据概率选择奖池
    public Award randomGetAward() {
        int sumOfProbability = 0;
        for (Award award : awards) {
            sumOfProbability += award.getAwardProbability();
        }
        int randomNumber = ThreadLocalRandom.current().nextInt(sumOfProbability);
        int range = 0;
        for (Award award : awards) {
            range += award.getProbability();
            if (randomNumber < range) {
                return award;
            }
        }
        return null;
    }
}
