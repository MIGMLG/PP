/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import ex4.Book.Book;

/**
 *
 * @author NERD-X
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Book livro = new Book();
        
        livro.title = "Ola Mundo";
        livro.editor = "Miguel Costa";
        livro.ano = 2018;
        livro.pages = 2000;
        livro.score[0] = 10;
        livro.score[1] = 10;
        livro.score[2] = 10;
        
        livro.author1.name = "Miguel";
        livro.author2.name = "Miguel";
        
    }
    
}
