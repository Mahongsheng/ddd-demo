package com.company.team.ddd.lottery.domain.entity;

import lombok.Data;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
@Data
public class Award {
    private int id;

    public int getAwardProbability() {
        return 0;
    }

    public int getProbability() {
        return 0;
    }
}
