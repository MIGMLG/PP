/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Exceptions;

/**
 * Definição da MaxFilesLimitException
 *
 * @author NERD-X
 */
public class MaxFilesLimitException extends Exception {

    /**
     * Default Constructor da MaxFilesLimitException
     */
    public MaxFilesLimitException() {
    }

    /**
     * Metodo Contructor da MaxFilesLimitException que recebe uma string como
     * mensagem
     *
     * @param message
     */
    public MaxFilesLimitException(String message) {
        super(message);
    }

}
