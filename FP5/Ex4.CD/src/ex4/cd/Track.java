/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.cd;

/**
 * Object of Track
 * @author NERD-X
 */
public class Track {

    /**
     *Size of the array of author information
     */
    protected final int AUTHOR_SIZE = 5;

    /**
     *Number of the Track
     */
    protected int number;

    /**
     *Title of the track
     */
    protected String title;

    /**
     *Duration of the track
     */
    protected int duration;

    /**
     *Array of Authors information
     */
    protected Author[] author = new Author[AUTHOR_SIZE];

    /**
     *Size of the array received
     */
    protected int size = 0;

    /**
     *Default Constructor
     */
    public Track() {
    }
    
    /**
     * Default Constructor
     * @param number
     * @param title
     * @param duration
     * @param author
     */
    public Track(int number, String title, int duration, Author[] author) {
        this.number = number;
        this.title = title;
        this.duration = duration;
        this.author = author;
        this.size = author.length;
    }

}
