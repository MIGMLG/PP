/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Exceptions;

/**
 * Definição da FileDurationInvalidException
 *
 * @author NERD-X
 */
public class FileDurationInvalidException extends Exception {

    /**
     * Default Constructor da FileDurationInvalidException
     */
    public FileDurationInvalidException() {
    }

    /**
     * Metodo Constructor da FileDurationInvalidException que recebe uma string
     * como mensagem
     *
     * @param message
     */
    public FileDurationInvalidException(String message) {
        super(message);
    }

}
