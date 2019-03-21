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
public class CDDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Track[] t = {
            new Track(1, "Ho Hey", 90, "Lumineers"),
            new Track(2, "Stubborn Love", 105, "Wesley Schultz")
        };

        CD cd = new CD("The Lumineers", 2012, "Dualtone Records", t);
        
        System.out.println("Nome do CD: " + cd.name);
        System.out.println("Ano de lançamento: " + cd.year);
        System.out.println("Editors: " + cd.editor);
        
        for(Track track : t){
            System.out.println("Titulo da música número " 
                    + track.number + " do CD: " + track.title);
            System.out.println("Duração: " + track.duration);
            System.out.println("Autor da musica: " + track.author);
        }
    }

}
