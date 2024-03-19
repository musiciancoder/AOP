package es.pildoras.gestionPOA.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class ClienteVipDAO {

    public void insertaClientes() {
        System.out.println("Cliente insertado en la bbdd"); //esto obviamente es una simulacion, sin insercion real
    }
}
