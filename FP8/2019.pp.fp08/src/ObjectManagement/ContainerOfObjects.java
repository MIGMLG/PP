/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectManagement;

/**
 * Qualquer Objeto é uma extensão de Object por isso esta classe pode receber qualquer tipo de objecto 
 * @author NERD-X
 */
public class ContainerOfObjects {
    private final int DEFAULT_SIZE = 100;
    private Object[] object;

    /**
     * Metodo Constructor que recebe um array de objeto para definir object
     * @param object
     */
    public ContainerOfObjects(Object[] object) {
        this.object = object;
    }
    
    /**
     * Metodo Constructor Default que define o tamanho máximo através da constante
     */
    public ContainerOfObjects() {
        this.object = new Object[DEFAULT_SIZE];
    }
    
    /**
     * Metodo Constructor que recebe um tamanho máximo para atribuir ao array de objects
     * @param maxSize
     */
    public ContainerOfObjects(int maxSize) {
        this.object = new Object[maxSize];
    }
    
}
