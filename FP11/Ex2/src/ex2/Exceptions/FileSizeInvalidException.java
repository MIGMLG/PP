/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Exceptions;

/**
 * Definição da FileSizeInvalidException
 *
 * @author NERD-X
 */
public class FileSizeInvalidException extends Exception {

    /**
     * Default Constructor da FileSizeInvalidException
     */
    public FileSizeInvalidException() {
    }

    /**
     * Metodo Constructor da FileSizeInvalidException que recebe uma string
     * como mensagem
     * @param message
     */
    public FileSizeInvalidException(String message) {
        super(message);
    }

}
