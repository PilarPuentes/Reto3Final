package Reto3.api.Interfaz;

import Reto3.api.Modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer> {
}
