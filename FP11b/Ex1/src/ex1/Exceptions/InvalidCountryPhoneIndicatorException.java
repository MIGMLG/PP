/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Exceptions;

/**
 *
 * @author NERD-X
 */
public class InvalidCountryPhoneIndicatorException extends Exception{

    public InvalidCountryPhoneIndicatorException() {
    }

    public InvalidCountryPhoneIndicatorException(String message) {
        super(message);
    }
    
}
