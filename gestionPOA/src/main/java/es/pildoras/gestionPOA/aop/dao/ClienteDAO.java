package es.pildoras.gestionPOA.aop.dao;

import es.pildoras.gestionPOA.aop.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteDAO {

    private String valoracionClienteNormal;
    private String codigoClienteNormal;

    public void insertaClientes(Cliente elCliente, String tipo) { //este es el metodo que proveerá el aspecto. Por detrás se comprobará q se ha hecho login y que ese login es correcto
        System.out.println("Cliente insertado en la bbdd"); //esto obviamente es una simulacion, sin insercion real

    }

    public String getValoracionClienteNormal() {
        System.out.println("Obteniendo valoracion del cliente");
        return valoracionClienteNormal;
    }

    public void setValoracionClienteNormal(String valoracionClienteNormal) {
        System.out.println("Estableciendo valoracion del cliente");
        this.valoracionClienteNormal = valoracionClienteNormal;
    }

    public String getCodigoClienteNormal() {
        System.out.println("Obteniendo codigo del cliente");
        return codigoClienteNormal;
    }

    public void setCodigoClienteNormal(String codigoClienteNormal) {
        System.out.println("Estableciendo codigo del cliente");
        this.codigoClienteNormal = codigoClienteNormal;
    }
}
