package es.pildoras.gestionPOA.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class RequisitosTabla {

    @Before("es.pildoras.gestionPOA.aop.aspectos.paraClientes()")
    public void requisitosTabla() {
        System.out.println("Hay menos de 3000 registros en la tabla. Puedes insertar");
    }
}
