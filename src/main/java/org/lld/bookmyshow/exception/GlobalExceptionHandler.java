package org.lld.bookmyshow.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BookMyShowException.class)
    @ResponseBody
    public ResponseEntity<?> handleBookMyShowException(BookMyShowException e){
        return new ResponseEntity<>(e,e.getErrorStatus());
    }

    @ExceptionHandler(AccessDeniedException.class)
    @ResponseBody
    public ResponseEntity<?> handleAccessDeniedException(Exception e){

        BookMyShowException bmsException=new BookMyShowException(HttpStatus.FORBIDDEN,ErrorMessage.No_ACCESS,ErrorCode.FORBIDDEN,System.currentTimeMillis());
        return new ResponseEntity<>(bmsException,HttpStatus.FORBIDDEN);
    }


}
