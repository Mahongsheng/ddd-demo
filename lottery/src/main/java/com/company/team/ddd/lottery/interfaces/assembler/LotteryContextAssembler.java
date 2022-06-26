package com.company.team.ddd.lottery.interfaces.assembler;

import com.company.team.ddd.lottery.domain.entity.Award;
import com.company.team.ddd.lottery.domain.valobj.LotteryContext;
import com.company.team.ddd.lottery.interfaces.dto.LotteryContextDTO;

import java.text.ParseException;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
public class LotteryContextAssembler {

    public static LotteryContextDTO toDTO(Award award) {
        LotteryContextDTO dto = new LotteryContextDTO();
        dto.setId(award.getId());
        return dto;
    }

    public static LotteryContext toDO(LotteryContextDTO dto) throws ParseException {
        LotteryContext lotteryContext = new LotteryContext();
        lotteryContext.setId(dto.getId());
        return lotteryContext;
    }
}
