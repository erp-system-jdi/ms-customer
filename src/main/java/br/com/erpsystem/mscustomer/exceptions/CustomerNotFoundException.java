package br.com.erpsystem.mscustomer.exceptions;

public class CustomerNotFoundException extends RuntimeException{

    private static final long serialVersionUID = -7673488275591493173L;

    public CustomerNotFoundException(String msg) {
        super(msg);
    }
}
