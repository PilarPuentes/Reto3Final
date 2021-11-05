package Reto3.api.Interfaz;

import Reto3.api.Modelo.Reservaciones;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceReservaciones extends CrudRepository<Reservaciones,Integer> {
}
