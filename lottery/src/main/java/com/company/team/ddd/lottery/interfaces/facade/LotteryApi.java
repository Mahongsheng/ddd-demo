package com.company.team.ddd.lottery.interfaces.facade;

import com.company.team.ddd.lottery.application.service.LotteryApplicationService;
import com.company.team.ddd.lottery.common.Response;
import com.company.team.ddd.lottery.interfaces.assembler.LotteryContextAssembler;
import com.company.team.ddd.lottery.interfaces.dto.LotteryContextDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

/**
 * @author Hansel Ma
 * @since 2022/6/26
 */
@RestController
@RequestMapping("/lottery")
@Slf4j
public class LotteryApi {
    @Autowired
    LotteryApplicationService lotteryApplicationService;

    @PostMapping("/login")
    public Response login(LotteryContextDTO lotteryContextDTO) {
        try {
            return lotteryApplicationService.participateLottery(LotteryContextAssembler.toDO(lotteryContextDTO));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
