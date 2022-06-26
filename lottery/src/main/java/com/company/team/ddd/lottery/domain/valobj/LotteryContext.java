package com.company.team.ddd.lottery.domain.valobj;

import lombok.Data;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
@Data
public class LotteryContext {
    private int id;

    public int getLotteryId() {
        return 0;
    }

    public Object getUserId() {
        return null;
    }
}
