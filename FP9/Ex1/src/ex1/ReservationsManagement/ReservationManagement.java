package ex1.ReservationsManagement;

import containerofobjectsapi.ContainerOfObjects;
import ex1.Enums.State;
import java.time.LocalDateTime;

/**
 * Classe De Gestão das Reservas
 *
 * @author NERD-X
 */
public class ReservationManagement extends ContainerOfObjects {

    /**
     * Metodo para adicionar reservas
     *
     * @param reservation
     * @return
     */
    public boolean addReservation(Reservation reservation) {
        if (super.hasObject(reservation)) {
            return false;
        } else {
            return super.addObjects(reservation);
        }
    }

    /**
     * Metodo para remover e concluir reservas
     *
     * @param reservation
     * @return
     */
    public boolean removeReservation(Reservation reservation) {
        int position = super.findObject(reservation);
        if (position != 1) {
            Reservation removed = (Reservation) super.removeObjects(position);
            removed.setState(State.FINISHED);
            System.out.println(removed.toString());
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para imprimir todas as reservas nao concluidas numa determinada
     * data
     *
     * @param date
     * @return
     */
    public String printCompletedByDate(LocalDateTime date) {
        String text = "";
        Object[] object = super.getObjects();
        for (Object output : object) {
            Reservation tmp = (Reservation) output;
            if (date.equals(tmp.getDate()) & tmp.getState() == State.NOTFINISHED) {
                text += output.toString();
            }
        }
        return text;
    }

}
