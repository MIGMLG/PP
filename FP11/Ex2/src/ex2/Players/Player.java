/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Players;

import ex2.Interfaces.PlayerInterface;
import java.io.Serializable;

/**
 * Classe que define o objeto player
 * @author NERD-X
 */
abstract class Player implements PlayerInterface, Serializable{
    
    protected int globalAddFileFailures = 0;

    public int getGlobalAddFileFailures() {
        return globalAddFileFailures;
    }

    public void setGlobalAddFileFailures(int globalAddFileFailures) {
        this.globalAddFileFailures = globalAddFileFailures;
    }
}
