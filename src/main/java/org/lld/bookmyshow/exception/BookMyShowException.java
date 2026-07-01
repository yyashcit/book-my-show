package org.lld.bookmyshow.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Setter
@Getter
@AllArgsConstructor
public class BookMyShowException extends RuntimeException{
    private HttpStatus errorStatus;
    private String errorMessage;
    private Integer errorCode;
    private long timeStamp;


    public BookMyShowException(HttpStatus httpStatus,String errorMessage){
        this.errorStatus=httpStatus;
        this.errorMessage=errorMessage;
    }
}
