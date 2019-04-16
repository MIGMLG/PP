package ex1.ReservationsManagement;

import containerofobjectsapi.ContainerOfObjects;
import ex1.Enums.StateType;
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
            removed.setState(StateType.FINISHED);
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
            if (date.equals(tmp.getDate()) & tmp.getState() == StateType.NOTFINISHED) {
                text += output.toString();
            }
        }
        return text;
    }

}
