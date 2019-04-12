/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.ReservationsManagement;

import containerofobjectsapi.ContainerOfObjects;
import ex1.Enums.StateType;

/**
 *
 * @author NERD-X
 */
public class ReservationManagement extends ContainerOfObjects {

    public boolean addReservation(Reservation reservation) {
        if (super.hasObject(reservation)) {
            return false;
        } else {
            return super.addObjects(reservation);
        }
    }

    public boolean removeReservation(Reservation reservation) {
        int position = super.findObject(reservation);
        if (position != 1) {
            Reservation removed = (Reservation) super.removeObjects(position);
            removed.setState(StateType.FINISHED);
            System.out.println(removed.toString());
            return true;
        } else {
            return false;
        }
    }

}
