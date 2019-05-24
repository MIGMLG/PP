/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Files;

/**
 * Classe que contem a definição de um ficheiro
 * @author NERD-X
 */
public class File {

    private String name;
    private String extension;
    private int size;
    private int duration;

    /**
     * Contructor para classe File
     * @param name
     * @param extension
     * @param size
     * @param duration
     */
    public File(String name, String extension, int size, int duration) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.duration = duration;
    }

    /**
     * Metodo para obter o nome do ficheiro
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo para obter a extensão do ficheiro
     * @return
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Metodo para obter o tamanho do ficheiro
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Metodo para obter a duração do ficheiro
     * @return
     */
    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "File{" + "name=" + name + ", extension=" + extension + ", size=" + size + ", duration=" + duration + '}';
    }
    
    
    
}
