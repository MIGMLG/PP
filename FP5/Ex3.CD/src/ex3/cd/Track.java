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
public class Track {
    protected final int AUTHOR_SIZE = 5;
    protected int number;
    protected String title;
    protected int duration;
    protected Author[] author = new Author[AUTHOR_SIZE];
    protected int size = 0;

    public Track() {
    }

    public Track(int number, String title, int duration, Author[] author) {
        this.number = number;
        this.title = title;
        this.duration = duration;
        this.author = author;
        this.size = author.length;
    }

}
