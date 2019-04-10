/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Bikes;

/**
 * Qualquer Objeto é uma extensão de Object por isso esta classe pode receber
 * qualquer tipo de objecto
 *
 * @author NERD-X
 */
public class ContainerOfObjects {

    private final int DEFAULT_SIZE = 100;
    private Object[] object;
    private int counter = 0;

    /**
     * Metodo Constructor que recebe um array de objeto para definir object
     *
     * @param object
     */
    public ContainerOfObjects(Object[] object) {
        this.object = object;
        this.counter = this.object.length;
    }

    /**
     * Metodo Constructor Default que define o tamanho máximo através da
     * constante
     */
    public ContainerOfObjects() {
        this.object = new Object[DEFAULT_SIZE];
    }

    /**
     * Metodo Constructor que recebe um tamanho máximo para atribuir ao array de
     * objects
     *
     * @param maxSize
     */
    public ContainerOfObjects(int maxSize) {
        this.object = new Object[maxSize];
    }

    /**
     * Metodo para adicionar objetos ao array
     * Retorna true se a operação foi um sucesso/false se falhou
     * @param newObject
     * @return
     */
    protected boolean addObjects(Object newObject) {
        if (counter < object.length) {
            object[counter] = newObject;
            counter += 1;
            return true;
        } else {
            System.out.println("Array cheio.");
            return false;
        }

    }

    /**
     * Metodo para remover objeto do array
     * Retorna o objeto eliminado
     * @param position
     * @return
     */
    protected Object removeObjects(int position) {

        if (position < object.length && position != -1) {
            if (object[position] == null) {
                System.out.println("Objecto não existe");
                return null;
            } else {
                Object delete = object[position];
                object[position] = null;
                for (int i = position; i < (counter - 1); i++) {
                    object[i] = object[i + 1];
                }
                counter -= 1;
                object[counter] = null;
                return delete;
            }
        } else {
            System.out.println("Posição Inexistente");
            return null;
        }

    }

    /**
     * Metodo que substitui um objeto no array por um novo recebido
     * Retorna true se a operação foi um sucesso/false se falhou
     * @param position
     * @param newObject
     * @return
     */
    protected boolean setObject(int position, Object newObject) {
        if (position < object.length) {
            if (object[position] == null) {
                System.out.println("Não existe nenhum objeto nesta postição.");
                return false;
            } else {
                object[position] = newObject;
                return true;
            }

        } else {
            System.out.println("Posição Inexistente");
            return false;
        }

    }
    
    /**
     * Metodo para procurar um objeto no array
     * Se existir o metodo irá retornar a posição do objeto no array
     * Se não existir retorna um -1
     * @param object
     * @return
     */
    protected int findObject(Object object){
        
        for(int i = 0; i < counter; i++){
            if(this.object[i].equals(object)){
                return i;
            }
        }
        
        return -1;
        
    }
    
    /**
     * Metodo para saber se o objeto existe no array
     * @param object
     * @return
     */
    public boolean hasObject(Object object){
        
        for (int i = 0; i < counter; i++) {
            if (this.object[i].equals(object)) {
                return true;
            }
        }
        
        return false;
        
    }
    
    /**
     * Metodo para imprimir a informação dos Objectos
     * @return
     */
    public String printAll(){
        String text = new String();
        
        for(int i = 0; i < counter; i++){
            text += object[i].toString();
        }
        
        return text;
        
    }
}
