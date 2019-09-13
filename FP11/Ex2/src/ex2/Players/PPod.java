/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Players;

import ex2.Exceptions.FileDurationInvalidException;
import ex2.Exceptions.FileNotSupportedException;
import ex2.Exceptions.FileSizeInvalidException;
import ex2.Exceptions.MaxFilesLimitException;
import ex2.Exceptions.MemoryFullException;
import ex2.Files.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Serializable;

/**
 * Classe que define o player de mp3
 *
 * @author NERD-X
 */
public class PPod extends Player {

    private transient final int MAX_FILES = 2;
    private transient final int MAX_MEMORY = 102400;
    private File[] lista = new File[MAX_FILES];
    private int currentMemory = 0;
    private int currentTrack = -1;
    private ShuffleAlgorithms algo = ShuffleAlgorithms.ORDERBYDURATION;

    /**
     * Metodo Constructor
     * @param algo
     */
    public PPod(ShuffleAlgorithms algo) {
        this.algo = algo;
    }

    @Override
    public boolean addFile(File file) throws NullPointerException, MemoryFullException, MaxFilesLimitException, FileSizeInvalidException {

        if (file == null) {
            this.globalAddFileFailures = this.globalAddFileFailures + 1;
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
                    this.globalAddFileFailures = this.globalAddFileFailures + 1;
                    throw new MaxFilesLimitException("Lista cheia.");

                } else {
                    this.globalAddFileFailures = this.globalAddFileFailures + 1;
                    throw new MemoryFullException("Memória Cheia.");
                }
            } else {
                this.globalAddFileFailures = this.globalAddFileFailures + 1;
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
        return ShuffleAlgorithms.shuffle(algo, lista);
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

    /**
     * Classr para realizar o backup do estado do objecto
     * @param path
     * @return
     */
    public boolean backup(String path) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
            out.writeObject(this);
            out.close();
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    /**
     * Classe para obter o estado anterior do objeto apartir do ficheiro
     * @param path
     * @return
     */
    public boolean restore(String path) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));
            PPod tmp = (PPod) in.readObject();
            this.lista = tmp.lista;
            this.algo = tmp.algo;
            this.currentMemory = tmp.currentMemory;
            this.currentTrack = tmp.currentTrack;
            in.close();
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PPod.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
