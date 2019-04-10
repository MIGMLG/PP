/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Bikes;

/**
 * Classe de gestão dos comentarios
 * @author NERD-X
 */
public class CommentsManagement extends ContainerOfObjects{
   private int objectSize;
   
    /**
     * Metodo construtor que recebe o tamanho maximo do array de objectos
     * @param objectSize
     */
    public CommentsManagement(int objectSize) {
        super(objectSize);
        this.objectSize = objectSize;
    }
   
    /**
     * Metodo para adicionar comentarios
     * @param comment
     * @return
     */
    public boolean addComment(String comment){
       return super.addObjects(comment);
   }
   
    /**
     * Metodo para remover comentarios
     * @param position
     * @return
     */
    public String removeComment(int position){
       return (String) super.removeObjects(position);
   }
   
    /**
     * Metodo para imprimir todos os comentarios
     * @return
     */
    public String getAllComments(){
       return super.printAll();
   }
}
