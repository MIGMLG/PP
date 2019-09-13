/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Players;

import ex2.Files.File;
import java.util.Arrays;

/**
 * Classe com os algoritmos de od«rdenação
 * @author NERD-X
 */
public enum ShuffleAlgorithms {

    /**
     * Ordenar por nome
     */
    ORDERBYNAME,

    /**
     * Ordenar por tamanho
     */
    ORDERBYSIZE,

    /**
     * Ordenar por duração
     */
    ORDERBYDURATION;

    /**
     * Metodo para selecionar o algoritmo a usar
     * @param algo
     * @param array
     * @return
     */
    public static boolean shuffle(ShuffleAlgorithms algo, File[] array) {
        switch (algo) {
            case ORDERBYNAME:
                return orderByName(array);
            case ORDERBYSIZE:
                return orderBySize(array);
            case ORDERBYDURATION:
                return orderByDuraton(array);
            default:
                return false;
        }
    }

    /**
     * Metodo para ordenar as músicas por nome
     * @param array
     * @return
     */
    public static boolean orderByName(File[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != null && array[j] != null) {
                    if (array[i].getName().compareToIgnoreCase(array[j].getName()) > 0) {
                        File tmpObject = array[i];
                        array[i] = array[j];
                        array[j] = tmpObject;
                    }
                }
            }
        }
        return true;

    }
    
    /**
     * Metodo para ordenar as músicas por tamanho
     * @param array
     * @return
     */
    public static boolean orderBySize(File[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != null && array[j] != null) {
                    if (array[i].getSize() < array[j].getSize()) {
                        File tmpObject = array[i];
                        array[i] = array[j];
                        array[j] = tmpObject;
                    }
                }
            }
        }
        return true;
    }
    
    /**
     * Metodo para ordenar as músicas por duração
     * @param array
     * @return
     */
    public static boolean orderByDuraton(File[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != null && array[j] != null) {
                    if (array[i].getDuration() > array[j].getDuration()) {
                        File tmpObject = array[i];
                        array[i] = array[j];
                        array[j] = tmpObject;
                    }
                }
            }
        }
        return true;
    }
}
