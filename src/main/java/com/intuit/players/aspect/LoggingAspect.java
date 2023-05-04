package com.intuit.players.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @AfterThrowing(pointcut = "within(@org.springframework.web.bind.annotation.RestController *)", throwing = "ex")
    public ResponseEntity<Object> logAfterThrowing(JoinPoint joinPoint, Throwable ex) {
        // TODOthrow new RuntimeException("This is a runtime exception");
        LOGGER.error("Exception in {}.{}() with cause = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), ex.getCause() != null ? ex.getCause() : "NULL");

        return new ResponseEntity<>("An error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
