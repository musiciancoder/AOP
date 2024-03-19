package es.pildoras.gestionPOA.aop.dao;

import es.pildoras.gestionPOA.aop.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteDAO {

    public void insertaClientes(Cliente elCliente, String tipo) { //este es el metodo que proveerá el aspecto. Por detrás se comprobará q se ha hecho login y que ese login es correcto
        System.out.println("Cliente insertado en la bbdd"); //esto obviamente es una simulacion, sin insercion real

    }
}
