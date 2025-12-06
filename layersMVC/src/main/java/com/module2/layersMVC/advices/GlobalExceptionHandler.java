package com.module2.layersMVC.advices;

import com.module2.layersMVC.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

public class GlobalExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiError> handleResourceNotFound(ResourceNotFoundException exception){

      ApiError apiError= ApiError.builder().status(HttpStatus.NOT_FOUND)
              .message(exception.getMessage())
              .build();
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }
}
