package es.pildoras.gestionPOA.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1) //para q este aspecto se ejecute primero
public class RequisitosCliente {

    @Before("es.pildoras.gestionPOA.aop.aspectos.paraClientes()")
    public void requisitosCliente() {
        System.out.println("El cliente cumple los requisitos para ser insertado en la BBDD");
    }
}
