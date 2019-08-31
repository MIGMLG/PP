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
public class FirstLetterIsLowerCaseException extends Exception{

    public FirstLetterIsLowerCaseException() {
    }

    public FirstLetterIsLowerCaseException(String message) {
        super(message);
    }
    
}
