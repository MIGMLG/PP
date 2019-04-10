/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Bikes;

import static ex1.enums.BrakeType.*;
import static ex1.enums.Material.*;

/**
 * Definição do Objeto RoadBike
 *
 * @author NERD-X
 */
public class RoadBike extends Bike {

    private final int MAX_OBS = 10;
    private String handlebelt;
    private float frameSize;
    private CommentsManagement observations = new CommentsManagement(MAX_OBS);
    private int counterObs = 0;

    /**
     * Metodo Constructor para RoadBike
     *
     * @param handlebelt
     * @param frameSize
     * @param id
     * @param numberOfGears
     * @param mainColor
     * @param wheelSize
     * @param price
     * @param guarantee
     */
    public RoadBike(String handlebelt, float frameSize, int id, int numberOfGears, String mainColor, float wheelSize, float price, int guarantee) {
        super(id, numberOfGears, mainColor, wheelSize, H, CARBONO, price, guarantee);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
    }

    /**
     * Metodo para adicionar comentarios á bicicleta
     * @param comment
     * @return
     */
    public boolean addComment(String comment) {
        if (comment.length() <= 60 ) {
            return observations.addComment(comment);
        }else {
            return false;
        }
    }

    /**
     * Metodo para remover comentarios á bicicleta
     * @param position
     * @return
     */
    public String removeComment(int position) {
        return (String) observations.removeComment(position);
    }

    /**
     * Metodo para imprimir todos os comentarios da bicicleta
     * @return
     */
    public String getAllComments() {
        return observations.getAllComments();
    }

}
