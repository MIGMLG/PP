/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Players;

import ex2.Files.File;
import java.util.Arrays;

/**
 *
 * @author NERD-X
 */
public enum ShuffleAlgorithms {

    ORDERBYNAME, ORDERBYSIZE, ORDERBYDURATION;

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
