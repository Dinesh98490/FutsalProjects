package com.example.demo.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustomerExceptionHandler {
    @ExceptionHandler({Exception.class})
    public String handleException(Exception ex, final WebRequest request) {
        return ex.getMessage();
    }

}
