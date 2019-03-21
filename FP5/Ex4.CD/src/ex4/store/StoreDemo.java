/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.store;

import ex4.cd.Author;
import ex4.cd.CD;
import ex4.cd.Track;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 * Main Class
 * @author NERD-X
 */
public class StoreDemo {
    
    /**
     * Main Class
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("---------------------------------------");
        User utilizador = new User("Miguel Costa", 21 , "gmail");
        System.out.println("Nome : " + utilizador.name);
        System.out.println("Idade : " + utilizador.age);
        System.out.println("Email : " + utilizador.email);
        System.out.println("---------------------------------------");
        Author author1 = new Author("Lumineers", 30);
        Author author2 = new Author("Wesley Schultz", 50);

        Author[] array = {author1, author2};

        Track[] t = {
            new Track(1, "Ho Hey", 90, new Author [] {author1}),
            new Track(2, "Stubborn Love", 105, new Author [] {author2}),
            new Track(3, "Teste", 200, array)
        };

        CD cd[] = {new CD("The Lumineers", 2012, "Dualtone Records", t , 20)};
        
        Sale venda = new Sale(1, ParseDates.ParseDates("01/02/2019"), cd);
        System.out.println("Data : " + formatter.format(venda.dateOfSale));
        System.out.println("Total : " + venda.Total);
        System.out.println("Lista de CDS : ");
        for(int i = 0; i < venda.listOfCds.length; i++){
            System.out.println("- " + venda.listOfCds[i].name);
        }
        System.out.println("---------------------------------------");
    }
    
}
