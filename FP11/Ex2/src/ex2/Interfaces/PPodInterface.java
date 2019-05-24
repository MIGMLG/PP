/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Interfaces;

import ex2.Exceptions.FileDurationInvalidException;
import ex2.Exceptions.FileNotSupportedException;
import ex2.Exceptions.FileSizeInvalidException;
import ex2.Exceptions.MaxFilesLimitException;
import ex2.Exceptions.MemoryFullException;
import ex2.Files.File;

/**
 * Interface para os comportamentos do PPod
 *
 * @author NERD-X
 */
public interface PPodInterface {

    /**
     * Metodo para adicionar um ficheiro á lista
     *
     * @param file ficheiro
     * @return
     * @throws NullPointerException
     * @throws MemoryFullException
     * @throws MaxFilesLimitException
     * @throws ex2.Exceptions.FileSizeInvalidException
     */
    public boolean addFile(File file) throws NullPointerException, MemoryFullException, MaxFilesLimitException, FileSizeInvalidException;

    /**
     * Metodo para apagar uma faixa da lista
     *
     * @param index posição do array
     * @return
     * @throws ArrayIndexOutOfBoundsException
     */
    public boolean deleteFile(int index) throws ArrayIndexOutOfBoundsException, NullPointerException;

    /**
     * Metodo para reproduzir uma faixa
     *
     * @param index posição do array
     * @return
     * @throws ArrayIndexOutOfBoundsException
     * @throws FileNotSupportedException
     * @throws ex2.Exceptions.FileDurationInvalidException
     */
    public boolean playTrack(int index) throws ArrayIndexOutOfBoundsException, FileNotSupportedException, NullPointerException, FileDurationInvalidException;

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
    
    /**
     * Metodo que imprime a lista de todas as músicas
     */
    public void list();
}
