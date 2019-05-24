/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Players;

import containerofobjectsapi.ContainerOfObjects;
import ex2.Exceptions.FileNotSupportedException;
import ex2.Exceptions.MaxFilesLimitException;
import ex2.Exceptions.MemoryFullException;
import ex2.Files.File;
import ex2.Interfaces.PPodInterface;

/**
 * Classe que define o player de mp3
 *
 * @author NERD-X
 */
public class PPod extends ContainerOfObjects implements PPodInterface {

    private final int MAX_FILES = 20;
    private final int MAX_MEMORY = 102400;
    private int currentMemory = 0;
    private int currentTrack = -1;

    /**
     * Contructor que define o tamanho máximo do array
     */
    public PPod() {
        super(20);
    }

    @Override
    public boolean addFile(File file) throws NullPointerException, MemoryFullException, MaxFilesLimitException {

        if (file == null) {
            throw new NullPointerException("Ficheiro Inexistente");
        } else {
            if (super.hasObject(file)) {
                System.out.println("Ficheiro já existe.");
                return false;
            } else {
                if ((currentMemory + file.getSize()) <= MAX_MEMORY) {
                    if (super.addObjects(file)) {
                        currentMemory += file.getSize();
                        return true;
                    } else {
                        throw new MaxFilesLimitException("Lista cheia.");
                    }
                } else {
                    throw new MemoryFullException("Memória Cheia.");
                }
            }
        }
    }

    @Override
    public boolean deleteFile(int index) throws ArrayIndexOutOfBoundsException, NullPointerException {
        if (index < MAX_FILES) {
            if (super.removeObjects(index) == null) {
                throw new NullPointerException("Ficheiro não existe.");
            } else {
                return true;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Posição Inexistente.");
        }
    }

    @Override
    public boolean playTrack(int index) throws ArrayIndexOutOfBoundsException, FileNotSupportedException, NullPointerException {
        if (index < MAX_FILES && index >= 0) {
            if (super.getObject(index) == null) {
                throw new NullPointerException("Não existe ficheiro na posição.");
            } else {
                File tmp = (File) super.getObject(index);
                if ("MP3".equals(tmp.getExtension().toUpperCase())) {
                    currentTrack = index;
                    System.out.println(tmp.toString());
                    return true;
                } else {
                    throw new FileNotSupportedException("Extensão não é mp3.");
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Posição Inexistente.");
        }
    }

    @Override
    public boolean nextTrack() {
        int nextTrack = 0;
        for (int i = this.currentTrack; i < this.MAX_FILES; i++) {
            try {
                nextTrack = this.currentTrack + 1;
                this.playTrack(nextTrack);
                return true;
            } catch (FileNotSupportedException ex) {
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
                previousTrack = this.currentTrack - 1;
                this.playTrack(previousTrack);
                return true;
            } catch (FileNotSupportedException ex) {
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

}
