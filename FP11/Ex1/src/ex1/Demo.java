/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import ex1.Exceptions.FileNotSupportedException;
import ex1.Exceptions.MaxFilesLimitException;
import ex1.Exceptions.MemoryFullException;
import ex1.Files.File;
import ex1.Players.PPod;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para testes
 *
 * @author NERD-X
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        File f1 = new File("Hello World", "mp3", 15000, 300000);
        File f2 = new File("Darudo SandStorm", "mp3", 4200, 420420);

        PPod p1 = new PPod();

        try {
            System.out.println(p1.addFile(f1));
        } catch (MemoryFullException | MaxFilesLimitException | NullPointerException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            System.out.println(p1.deleteFile(2));
        } catch (ArrayIndexOutOfBoundsException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            System.out.println(p1.playTrack(0));
        } catch (ArrayIndexOutOfBoundsException | FileNotSupportedException | NullPointerException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(p1.nextTrack());

        try {
            System.out.println(p1.addFile(f2));
        } catch (MemoryFullException | MaxFilesLimitException | NullPointerException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(p1.nextTrack());
        System.out.println(p1.previousTrack());
        System.out.println(p1.previousTrack());
    }

}
