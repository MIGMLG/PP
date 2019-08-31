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
public class ContactsManagerException extends Exception{
    
    public static final String LIST_NOT_CREATED = "A lista ainda não foi criada."; 
    public static final String EMPTY_LIST = "Ainda não existem contactos na lista."; 

    public ContactsManagerException() {
    }

    public ContactsManagerException(String message) {
        super(message);
    }
    
}
