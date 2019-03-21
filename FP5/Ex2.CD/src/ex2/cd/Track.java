/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.cd;

/**
 *
 * @author NERD-X
 */
public class Track {
    protected int number;
    protected String title;
    protected int duration;
    protected String author;

    public Track(){
    }

    public Track(int number, String title, int duration, String author) {
        this.number = number;
        this.title = title;
        this.duration = duration;
        this.author = author;
    }
    
    
    
}
