package com.what.ever.exceptions;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.GeneralSecurityException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GeneralException.class)
    public @ResponseBody ExceptionResponse handle404(GeneralException ge){

        ExceptionResponse error = new ExceptionResponse();
        error.setMessage(ge.getMessage());
        error.setStatus("error");
        return error;
    }

}
