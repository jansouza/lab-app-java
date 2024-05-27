package com.jansouza.springboot.lab.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex, WebRequest request) {
        logger.error(ex.getMessage(),ex);
        return new ResponseEntity<>("Ocorreu um erro interno no servidor: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
