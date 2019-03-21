/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.cd;

/**
 * Ex3
 * @author NERD-X
 */
public class CDDemo {

    /**
     * Ex3
     * @param args the command line arguments
     * NO ARGS
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Author author1 = new Author("Lumineers", 30);
        Author author2 = new Author("Wesley Schultz", 50);

        Author[] array = {author1, author2};

        Track[] t = {
            new Track(1, "Ho Hey", 90, new Author [] {author1}),
            new Track(2, "Stubborn Love", 105, new Author [] {author2}),
            new Track(3, "Teste", 200, array)
        };

        CD cd = new CD("The Lumineers", 2012, "Dualtone Records", t);

        System.out.println("Nome do CD: " + cd.name);
        System.out.println("Ano de lançamento: " + cd.year);
        System.out.println("Editors: " + cd.editor);
        System.out.println("---------------------------------------");

        for (int i = 0; i < t.length; i++) {
            System.out.println("Titulo da música número "
                    + t[i].number + " do CD: " + t[i].title);
            System.out.println("Duração: " + t[i].duration);
            System.out.print("Autores da musica: ");
            for (int j = 0; j < t[i].size; j++) {
                System.out.print("" + t[i].author[j].name + ", ");
            }
            //System.out.println("\n");
            System.out.println("\n" + "---------------------------------------");

        }
    }

}
