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
        //HACKY SHIT IM TIRED XD
        int counter = super.getCounter();
        Object[] obj = super.getObject();
        for (int i = 0; i < counter; i++) {
            Reservation reservation = (Reservation) obj[i];
            if (date.equals(reservation.getDate()) & reservation.getState() == State.NOTFINISHED) {
                text += reservation.toString();
            }
        }

        return text;
    }

}
