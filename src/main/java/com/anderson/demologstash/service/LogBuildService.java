package com.anderson.demologstash.service;

import com.anderson.demologstash.controller.ControllerLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class LogBuildService {

    //private static final Logger log = LoggerFactory.getLogger(LogBuildService.class);
    private Logger log = LoggerFactory.getLogger(ControllerLog.class.getName());

    @Scheduled(fixedDelay = 2000)
    public void logInfo(){
        log.info("Esse Log é teste de Info");
    }

    @Scheduled(fixedDelay = 5000)
    public void logError(){
        log.error("Error   #######   Erro");
    }

}
