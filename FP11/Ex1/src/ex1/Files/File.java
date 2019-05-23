/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Files;

/**
 *
 * @author NERD-X
 */
public class File {

    private String name;
    private String extension;
    private int size;
    private int duration;

    public File(String name, String extension, int size, int duration) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }

    public int getDuration() {
        return duration;
    }

}
