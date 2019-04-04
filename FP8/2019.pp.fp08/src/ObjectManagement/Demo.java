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
        teste.addObjects(obj2);
        teste.addObjects(obj3);
        teste.addObjects(obj4);
        teste.addObjects(obj5);
        
        teste.removeObjects(4);
        System.out.println("Hello World!");
    }
    
}
