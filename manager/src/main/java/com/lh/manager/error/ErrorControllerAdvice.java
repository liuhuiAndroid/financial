package com.lh.manager.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = {"com.lh.manager.controller"})
public class ErrorControllerAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity handleException(Exception e){
        Map<String, Object> attributes = new HashMap<>();
        String errorCode = e.getMessage();
        ErrorEnum errorEnum = ErrorEnum.getByCode(errorCode);
        attributes.put("message",errorEnum.getMessage());
        attributes.put("code",errorEnum.getCode());
        attributes.put("canRetry",errorEnum.isCanRetry());
        attributes.put("type","advice");
        Assert.isNull(attributes,"advice");
        return new ResponseEntity(attributes,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
