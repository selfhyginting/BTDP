package com.belajar.spring.exceptions;

import javax.xml.bind.ValidationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BaseErrorHandler {

    @ResponseBody
    @ExceptionHandler(value = ValidationException.class)
    public ResponseEntity<?> handleException(ValidationException exception) {
        return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.BAD_REQUEST);
    }
}