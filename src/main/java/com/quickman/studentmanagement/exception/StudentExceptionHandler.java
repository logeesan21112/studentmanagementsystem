package com.quickman.studentmanagement.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler(value = {StudentNotFoundException.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException(StudentNotFoundException cloudVendorNotFoundException) {
    	StudentException cloudVendorException = new StudentException(
                cloudVendorNotFoundException.getMessage(),
                cloudVendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(cloudVendorException, HttpStatus.NOT_FOUND);
    }
    
    @ControllerAdvice
    public class GlobalExceptionHandler {
        @ExceptionHandler(MethodArgumentNotValidException.class)
        public ResponseEntity<Map<String, String>> handleValidationErrors(MethodArgumentNotValidException ex) {
            Map<String, String> errors = new HashMap<>();
            
            ex.getBindingResult().getAllErrors().forEach((error) -> {
                String fieldName = ((FieldError) error).getField();
                String errorMessage = error.getDefaultMessage();
                errors.put(fieldName, errorMessage);
            });

            return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
        }
    }
}
