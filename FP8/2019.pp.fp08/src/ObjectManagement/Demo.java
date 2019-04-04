/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectManagement;

/**
 *
 * @author NERD-X
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        Object obj5 = new Object();
        
        ContainerOfObjects teste = new ContainerOfObjects();
        teste.addObjects(obj1);
        System.out.println("1- " + obj1.toString());
        teste.addObjects(obj2);
        System.out.println("2- " + obj2.toString());
        teste.addObjects(obj3);
        System.out.println("3- " + obj3.toString());
        teste.addObjects(obj4);
        System.out.println("4- " + obj4.toString());
        teste.addObjects(obj5);
        System.out.println("5- " + obj5.toString());
        
        System.out.println("Eliminado- " + teste.removeObjects(1).toString());

    }
    
}
