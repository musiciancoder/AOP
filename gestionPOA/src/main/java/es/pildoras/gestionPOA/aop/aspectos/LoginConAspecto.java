package es.pildoras.gestionPOA.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginConAspecto { //este es el aspecto

    //notar que como pusimos ClienteVipDao en el @Before solo se ejecuta el aspecto de ClienteVipDao. Sino, se ejecutarian ambos aspectos, el de ClienteDao y el de ClienteVipDAO
  //  @Before("execution(public void es.pildoras.gestionPOA.aop.dao.ClienteVipDao.insertarCliente())")    //Esto es una PointCut Expression; notar que como pusimos ClienteVipDao en el @Before solo se ejecuta el aspecto de ClienteVipDao. Sino, se ejecutarian ambos aspectos, el de ClienteDao y el de ClienteVipDAO
    @Before("execution(public void insertarCliente())") // antes de q se ejecute insertarCliente() siempre se ejecutará esto!!
    public void antesInsertarCliente(){
        System.out.println("El usuario esta logueado");
        System.out.println("El perfil para insertar clientes es correcto");
    }
}
