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
public class InvalidPhoneNumberException extends Exception{

    public InvalidPhoneNumberException() {
    }

    public InvalidPhoneNumberException(String message) {
        super(message);
    }

}
