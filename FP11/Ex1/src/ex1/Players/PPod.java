/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Players;

import containerofobjectsapi.ContainerOfObjects;
import ex1.Exceptions.FileNotSupportedException;
import ex1.Exceptions.MaxFilesLimitException;
import ex1.Exceptions.MemoryFullException;
import ex1.Files.File;
import ex1.Interfaces.PPodInterface;

/**
 *
 * @author NERD-X
 */
public class PPod extends ContainerOfObjects implements PPodInterface {

    private final int MAX_FILES = 20;
    private final int MAX_MEMORY = 102400;
    private int currentMemory = 0;
    private File[] files;

    public PPod() {
        super(20);
    }

    public PPod(File[] files) {
        super(files);
        this.files = files;
    }

    @Override
    public boolean addFile(File file) throws NullPointerException, MemoryFullException, MaxFilesLimitException {

        if (super.hasObject(file)) {
            System.out.println("Ficheiro já existe.");
            return false;
        } else {
            if ((currentMemory + file.getSize()) <= MAX_MEMORY) {
                if (super.addObjects(file)) {
                    currentMemory += currentMemory + file.getSize();
                    return true;
                } else {
                    throw new MaxFilesLimitException("Lista cheia.");
                }
            } else {
                throw new MemoryFullException("Memória Cheia.");
            }
        }

    }

    @Override
    public boolean deleteFile(int index) throws ArrayIndexOutOfBoundsException {
        if (index < MAX_FILES) {
            if (super.removeObjects(index) == null) {
                System.out.println("Ficheiro não existe");
                return false;
            } else {
                return true;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Posição Inexistente.");
        }
    }

    @Override
    public boolean playTrack(int index) throws ArrayIndexOutOfBoundsException, FileNotSupportedException, NullPointerException {
        if (index < MAX_FILES) {
            if (super.getObject(index) == null) {
                throw new NullPointerException("Não existe ficheiro na posição.");
            } else {
                File tmp = (File) super.getObject(index);
                System.out.println(tmp.toString());
                return true;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Posição Inexistente.");
        }
    }

    @Override
    public boolean nextTrack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean previousTrack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
