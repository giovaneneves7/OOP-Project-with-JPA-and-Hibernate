package br.com.ifba.giovaneneves.oopregistrationproject.exceptions.student;

public class ExistingRegistrationNumberException extends Exception{

    public ExistingRegistrationNumberException(String message){
        super(message);
    }

}
