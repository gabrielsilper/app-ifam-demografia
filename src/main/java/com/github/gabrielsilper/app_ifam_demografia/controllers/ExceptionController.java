package com.github.gabrielsilper.app_ifam_demografia.controllers;

import com.github.gabrielsilper.app_ifam_demografia.dtos.ErrorMessageResponse;
import com.github.gabrielsilper.app_ifam_demografia.exceptions.CidadeNotFoundException;
import com.github.gabrielsilper.app_ifam_demografia.exceptions.EstadoNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler({
            EstadoNotFoundException.class,
            CidadeNotFoundException.class
    })
    public ResponseEntity<ErrorMessageResponse> notFoundExceptionHandler(Exception e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ErrorMessageResponse(e.getMessage(), HttpStatus.NOT_FOUND.value()));
    }
}
