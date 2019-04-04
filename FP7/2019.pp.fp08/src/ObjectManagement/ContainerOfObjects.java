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
public class ContainerOfObjects {
    private final int DEFAULT_SIZE = 100;
    private Object[] object;

    public ContainerOfObjects(Object[] object) {
        this.object = object;
    }
    
    public ContainerOfObjects() {
        this.object = new Object[DEFAULT_SIZE];
    }
    
    public ContainerOfObjects(int maxSize) {
        this.object = new Object[maxSize];
    }
    
    
    
    
    
}
