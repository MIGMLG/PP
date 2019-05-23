/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Exceptions;

/**
 * Definição da FileNotSupportedException
 *
 * @author NERD-X
 */
public class FileNotSupportedException extends Exception {

    /**
     * Default Constructor da FileNotSupportedException
     */
    public FileNotSupportedException() {
    }

    /**
     * Metodo Constructor da FileNotSupportedException que recebe uma string
     * como mensagem
     *
     * @param message
     */
    public FileNotSupportedException(String message) {
        super(message);
    }

}
