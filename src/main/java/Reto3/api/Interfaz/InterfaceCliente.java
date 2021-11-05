package Reto3.api.Interfaz;

import Reto3.api.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
}
