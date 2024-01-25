package com.pika.ecommerce.exceptions;

public class AuthenticationFailException extends Exception {
    public AuthenticationFailException(String msg) {
        super(msg);
    }
}
