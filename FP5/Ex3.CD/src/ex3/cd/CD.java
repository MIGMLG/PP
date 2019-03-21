/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.cd;

/**
 *
 * @author NERD-X
 */
public class CD {
    protected String name;
    protected int year;
    protected String editor;
    protected int size;
    protected Track[] tracks;
    protected double price;
   

    public CD(String name, int year, String editor, int size, Track[] tracks) {
        this.name = name;
        this.year = year;
        this.editor = editor;
        this.size = size;
        tracks = new Track[size];
        this.tracks = tracks;
    }
    
    public CD(String name, int year, String editor, Track[] tracks) {
        this.name = name;
        this.year = year;
        this.editor = editor;
        this.tracks = tracks;
    }
    
    public CD(String name, int year, String editor, Track[] tracks, double price) {
        this.name = name;
        this.year = year;
        this.editor = editor;
        this.tracks = tracks;
        this.price = price;
    }
    
    

}
