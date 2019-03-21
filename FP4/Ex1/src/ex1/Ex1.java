/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author NERD-X
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    //static User user1;
    static User user2;
    public static void main(String[] args) {
        User user1 = null;
        // TODO code application logic here
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'B','r', 'u', 'n', 'o'};
        user1.email = new char[]{'b','m', 'o', '@'};
        
        System.out.println("-------------USER1-----------");
        System.out.print("UserID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println(user1.email);
        
        user2.name = new char[]{'M','i', 'g', 'u', 'e','l'};
        user2.email = new char[]{'n','x', 't', '@'};
        System.out.println("-------------USER2-----------");
        System.out.print("UserID: ");
        System.out.println(user2.id);
        System.out.print("Name: ");
        System.out.println(user2.name);
        System.out.print("Email: ");
        System.out.println(user2.email);
    }
    
}
