/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Persons;

import containerofobjectsapi.ContainerOfObjects;

/**
 *
 * @author NERD-X
 */
public class PersonManagement extends ContainerOfObjects{
    
    /**
     * Metodo para adicionar pessoas, retorna boolean
     * @param person
     * @return
     */
    public boolean addPerson(Person person){
        if(super.hasObject(person)){
            System.out.println("Já está contida no sistema.");
            return false;
        }else{
            return super.addObjects(person);
        }
    }
    
    /**
     * Metodo para remover pessoas, retorna Person
     * @param person
     * @return
     */
    public Person removePerson(Person person){
        int position = super.findObject(person);
        return (Person) super.removeObjects(position);
    }
    
    /**
     * Metodo para imprimir toda a informação
     * @return
     */
    public String PrintAll(){
        return super.printAll();
    }
    
}
