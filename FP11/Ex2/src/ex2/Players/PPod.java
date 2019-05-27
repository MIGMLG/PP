/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Players;

import containerofobjectsapi.ContainerOfObjects;
import ex2.Exceptions.FileDurationInvalidException;
import ex2.Exceptions.FileNotSupportedException;
import ex2.Exceptions.FileSizeInvalidException;
import ex2.Exceptions.MaxFilesLimitException;
import ex2.Exceptions.MemoryFullException;
import ex2.Files.File;
import ex2.Interfaces.PPodInterface;

/**
 * Classe que define o player de mp3
 *
 * @author NERD-X
 */
public class PPod extends Player {

    private final int MAX_FILES = 20;
    private final int MAX_MEMORY = 102400;
    private File[] lista = new File[MAX_FILES];
    private int currentMemory = 0;
    private int currentTrack = -1;

    @Override
    public boolean addFile(File file) throws NullPointerException, MemoryFullException, MaxFilesLimitException, FileSizeInvalidException {

        if (file == null) {
            throw new NullPointerException("Ficheiro Inexistente");
        } else {
            if (file.getSize() > 0) {
                if ((currentMemory + file.getSize()) <= MAX_MEMORY) {
                    for (int i = 0; i < lista.length; i++) {
                        if (lista[i] == null) {
                            lista[i] = file;
                            currentMemory += file.getSize();
                            return true;
                        }
                    }
                    throw new MaxFilesLimitException("Lista cheia.");

                } else {
                    throw new MemoryFullException("Memória Cheia.");
                }
            } else {
                throw new FileSizeInvalidException("Tamanho Invalido.");
            }

        }

    }

    @Override
    public boolean deleteFile(int index) throws ArrayIndexOutOfBoundsException, NullPointerException {

        if (index < MAX_FILES) {
            if (lista[index] == null) {
                throw new NullPointerException("Ficheiro não existe.");
            } else {
                lista[index] = null;
                return true;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Posição Inexistente.");
        }
    }

    @Override
    public boolean playTrack(int index) throws ArrayIndexOutOfBoundsException, FileNotSupportedException, NullPointerException, FileDurationInvalidException {

        if (index < MAX_FILES && index >= 0) {
            if (lista[index] == null) {
                throw new NullPointerException("Não existe ficheiro na posição.");
            } else {
                if (lista[index].getDuration() > 0) {
                    if ("MP3".equals(lista[index].getExtension().toUpperCase())) {
                        currentTrack = index;
                        System.out.println(lista[index].toString());
                        return true;
                    } else {
                        throw new FileNotSupportedException("Extensão não é mp3.");
                    }
                } else {
                    throw new FileDurationInvalidException("Duração do ficheiro Inválida.");
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Posição Inexistente.");
        }
        
    }

    @Override
    public boolean nextTrack() {
        
        int nextTrack = this.currentTrack;
        for (int i = this.currentTrack; i < this.MAX_FILES; i++) {
            try {
                nextTrack += 1;
                this.playTrack(nextTrack);
                return true;
            } catch (FileNotSupportedException | FileDurationInvalidException ex) {
                continue;
            } catch (NullPointerException ex) {
                System.out.println("Ainda não está preenchida a posição seguinte.");
                break;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Chegou ao fim da lista.");
                break;
            }
        }
        return false;
        
    }

    @Override
    public boolean previousTrack() {
        
        int previousTrack = this.currentTrack;
        for (int i = this.currentTrack; i >= 0; i--) {
            try {
                previousTrack -= 1;
                this.playTrack(previousTrack);
                return true;
            } catch (FileNotSupportedException | FileDurationInvalidException ex) {
                continue;
            } catch (NullPointerException ex) {
                System.out.println("Posição Vazia.");
                break;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Chegou ao ínicio da lista.");
                break;
            }
        }
        return false;
    }

    @Override
    public boolean shufflePlay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void list() {
        for (int i = 0; i < this.MAX_FILES; i++) {
            if (lista[i] != null) {
                System.out.println("-------------------------" + "\n"
                        + lista[i].toString() + "\n"
                        + "-------------------------" + "\n");
            }
        }
    }

}
