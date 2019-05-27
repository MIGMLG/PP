/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Players;

import ex2.Interfaces.PPodInterface;

/**
 * Classe que define o objeto player
 * @author NERD-X
 */
abstract class Player implements PPodInterface {
    
    protected int globalAddFileFailures = 0;

    public int getGlobalAddFileFailures() {
        return globalAddFileFailures;
    }

    public void setGlobalAddFileFailures(int globalAddFileFailures) {
        this.globalAddFileFailures = globalAddFileFailures;
    }
}
