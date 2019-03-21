/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.Book;

/**
 *
 * @author NERD-X
 */

/** Definition of a Book */
public class Book {
    private static final int reviewers = 3;

    /**
     *Penis
     */
    public String title;

    /**
     *
     */
    public String editor;

    /**
     *
     */
    public int ano;

    /**
     *
     */
    public int pages;

    /**
     *
     */
    public int[] score = new int[reviewers];
    
    /**
     *
     */
    public Author author1 = new Author();

    /**
     *
     */
    public Author author2 = new Author();

    
    
}
