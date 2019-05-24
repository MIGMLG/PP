/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Exceptions;

/**
 * Definição da MemoryFullException
 *
 * @author NERD-X
 */
public class MemoryFullException extends Exception {

    /**
     * Default Contructor da MemoryFullException
     */
    public MemoryFullException() {
    }

    /**
     * Metodo Constructor da MemoryFullException que recebe uma string como
     * mensagem
     *
     * @param message
     */
    public MemoryFullException(String message) {
        super(message);
    }

}
