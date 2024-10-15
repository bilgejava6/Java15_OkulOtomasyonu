package com.muhammet.okulotomasyonu.exception;

import lombok.Getter;

@Getter
public class OkulOtomasyonuException extends RuntimeException{
    private ErrorType errorType;
    public OkulOtomasyonuException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }
}
