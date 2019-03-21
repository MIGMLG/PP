/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.cd;

/**
 * Object of CD
 * @author NERD-X
 */
public class CD {

    /**
     *Name of the CD
     */
    public String name;

    /**
     *Year of the CD
     */
    public int year;

    /**
     *Editor´s Name
     */
    public String editor;

    /**
     *Amount of Tracks
     */
    public int size;

    /**
     *Array of the information about Tracks
     */
    public Track[] tracks;

    /**
     *Price of the CD, by default 0
     */
    public double price = 0;

    /**
     * Constructor with size of the array of tracks
     * @param name
     * @param year
     * @param editor
     * @param size
     * @param tracks
     */
    public CD(String name, int year, String editor, int size, Track[] tracks) {
        this.name = name;
        this.year = year;
        this.editor = editor;
        this.size = size;
        tracks = new Track[size];
        this.tracks = tracks;
    }

    /**
     * Constructor without Price
     * @param name
     * @param year
     * @param editor
     * @param tracks
     */
    public CD(String name, int year, String editor, Track[] tracks) {
        this.name = name;
        this.year = year;
        this.editor = editor;
        this.tracks = tracks;
    }

    /**
     * Constructor with Price
     * @param name
     * @param year
     * @param editor
     * @param tracks
     * @param price
     */
    public CD(String name, int year, String editor, Track[] tracks, double price) {
        this.name = name;
        this.year = year;
        this.editor = editor;
        this.tracks = tracks;
        this.price = price;
    }

}
