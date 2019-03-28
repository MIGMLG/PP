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
 * @author NERD-X
 */
public class RoadBike extends Bike {

    private final int MAX_OBS = 10;
    private String handlebelt;
    private float frameSize;
    private String[] observations = new String[MAX_OBS];
    private int counterObs = 0;

    /**
     * Metodo Constructor para RoadBike
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
     * Metodo que permite adicionar observações
     * @param observation
     */
    public void addObservations(String observation) {
        if (counterObs < MAX_OBS ) {
            observations[counterObs] = observation;
            counterObs += 1;
        }
        else {
            System.out.println("Já antigiu o numero máximo de Observações.");
        }

    }

    /**
     * Metodo que permite remover observações
     * @param position
     */
    public void removeObservations(int position) {
        String[] tmp = new String[MAX_OBS];
        int found = 0;

        for (int i = 0; i < counterObs; i++) {
            if (position == i) {
                found += 1;
                counterObs -= 1;
                continue;
            }
            tmp[i] = observations[i];
        }

        if (found > 0) {
            observations = tmp;
        } else {
            System.out.println("Não foi encontrado.");
        }
    }

    /**
     * Metodo que permite editar observações
     * @param position
     * @param obs
     */
    public void editObservations(int position, String obs) {
        int found = 0;

        for (int i = 0; i < counterObs; i++) {
            if (position == i) {
                observations[i] = obs;
                found += 1;
                break;
            }
        }

        if (found > 0) {
            System.out.println("Foi alterado com sucesso.");
        } else {
            System.out.println("Não foi encontrado.");
        }
    }

    /**
     * Metodo que retorna uma lista das observações
     * @return
     */
    public String printObservations() {
        String text = "";
        for (int i = 0; i < counterObs; i++) {
            text += "Observação " + (i + 1) + " : " + observations[i] + "\n";
        }
        return text;

    }
}
