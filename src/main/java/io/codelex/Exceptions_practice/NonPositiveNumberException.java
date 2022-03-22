package io.codelex.Exceptions_practice;

public class NonPositiveNumberException extends Exception{
    public NonPositiveNumberException(){
        super("Number is negative!");
    }
}
