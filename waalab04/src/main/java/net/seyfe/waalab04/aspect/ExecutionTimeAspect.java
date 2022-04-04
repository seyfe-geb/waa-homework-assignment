package net.seyfe.waalab04.aspect;

import net.seyfe.waalab04.domain.Logger;
import net.seyfe.waalab04.service.LoggerService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;

@Aspect
@Component
public class ExecutionTimeAspect {

    @Autowired
    LoggerService loggerService;

    private StopWatch execTime = new StopWatch();

    @Pointcut("@annotation(net.seyfe.waalab04.aspect.annotation.ExecutionTime)")
    public void executionTimeAnnotation(){

    }

    @Before("executionTimeAnnotation()")
    public void setTimerBefore(JoinPoint joinPoint){
        execTime.start();
    }
    @After("executionTimeAnnotation()")
    public void setTimerAfter(JoinPoint joinPoint){
        execTime.stop();
        System.out.println("Time it took to run " + joinPoint.getSignature().getName() + "() is : " + execTime.getLastTaskTimeMillis() + " milliseconds.");
        loggerService.saveLog(new Logger(LocalDate.now(), LocalTime.now(), "Some Principle", joinPoint.getSignature().getName()));
    }
}
