/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Interfaces;

import ex1.Exceptions.FileNotSupportedException;
import ex1.Exceptions.MaxFilesLimitException;
import ex1.Exceptions.MemoryFullException;
import ex1.Files.File;

/**
 * Interface para os comportamentos do PPod
 *
 * @author NERD-X
 */
public interface PPodInterface {

    /**
     * Metodo para adicionar um ficheiro á lista
     *
     * @param file
     * @return
     * @throws NullPointerException
     * @throws MemoryFullException
     * @throws MaxFilesLimitException
     */
    public boolean addFile(File file) throws NullPointerException, MemoryFullException, MaxFilesLimitException;

    /**
     * Metodo para apagar uma faixa da lista
     *
     * @param index posição do array
     * @return
     * @throws ArrayIndexOutOfBoundsException
     */
    public boolean deleteFile(int index) throws ArrayIndexOutOfBoundsException;

    /**
     * Metodo para reproduzir uma faixa
     *
     * @param index posição do array
     * @return
     * @throws ArrayIndexOutOfBoundsException
     * @throws FileNotSupportedException
     */
    public boolean playTrack(int index) throws ArrayIndexOutOfBoundsException, FileNotSupportedException;

    /**
     * Metodo para avançar para a próxima track, senão for possível reproduzir
     * avança até conseguir
     *
     * @return
     */
    public boolean nextTrack();

    /**
     * Metodo para recuar para a track anterior, senão for possível reproduzir
     * recua até conseguir
     *
     * @return
     */
    public boolean previousTrack();
}
