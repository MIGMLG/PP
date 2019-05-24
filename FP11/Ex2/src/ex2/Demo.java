/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import ex2.Exceptions.FileNotSupportedException;
import ex2.Exceptions.FileSizeInvalidException;
import ex2.Exceptions.MaxFilesLimitException;
import ex2.Exceptions.MemoryFullException;
import ex2.Files.File;
import ex2.Players.PPod;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NERD-X
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f1 = new File("Hello World", "mp3", 52000, 300000);
        File f2 = new File("Darudo SandStorm", "mp3", 4200, 420420);

        PPod p1 = new PPod();

        try {
            System.out.println(p1.addFile(f1));
        } catch (MemoryFullException | MaxFilesLimitException | NullPointerException | FileSizeInvalidException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(p1.deleteFile(2));
        } catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(p1.playTrack(0));
        } catch (ArrayIndexOutOfBoundsException | FileNotSupportedException | NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(p1.nextTrack());

        try {
            System.out.println(p1.addFile(f2));
        } catch (MemoryFullException | MaxFilesLimitException | NullPointerException | FileSizeInvalidException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(p1.nextTrack());
        System.out.println(p1.previousTrack());
        System.out.println(p1.previousTrack());
    }
    
}
