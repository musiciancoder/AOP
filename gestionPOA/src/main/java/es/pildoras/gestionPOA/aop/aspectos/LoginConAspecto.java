package es.pildoras.gestionPOA.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginConAspecto { //este es el aspecto

    //notar que como pusimos ClienteVipDao en el @Before solo se ejecuta el aspecto de ClienteVipDao. Sino, se ejecutarian ambos aspectos, el de ClienteDao y el de ClienteVipDAO
 //Los before de aca hacia abajo son "pointcut expressions"
  //  @Before("execution(public void es.pildoras.gestionPOA.aop.dao.ClienteVipDao.insertarCliente())")    //Esto es una PointCut Expression; notar que como pusimos ClienteVipDao en el @Before solo se ejecuta el aspecto de ClienteVipDao. Sino, se ejecutarian ambos aspectos, el de ClienteDao y el de ClienteVipDAO
   // @Before("execution(public String insertarClientes*)") // al tener insertarClientes* deberia ejecuta ambos aspectos (ya que ambos metodos desencadenantes comienzan con insertarClientes(), sin embargo solo ejecuta los aspectos para el metodo insertarClientes() que devuelve un String (el de clienteDAO, despues lo volvió a cambiar a void, pero probó con String)
  //  @Before("execution(public * insertarClientes*())") // con esto solventamos lo de la linea anterior y se ejecutaran ambos aspectos
   // @Before("execution(public * insertarClientes*(es.pildoras.gestionPOA.aop.Cliente, ..))") // con esto aceptamos todos los parámetros que le estamos pasando a insertaClientes() de ClienteDAO
    @Before("execution(public * insertarClientes*(..))") // con esto conseguimos q funcionen toditos los aspectos, tanto para ClienteDAO (que pasa parametro), como para ClienteVipDAO (que no pasa parametros
    public void antesInsertarCliente(){
        System.out.println("El usuario esta logueado");
        System.out.println("El perfil para insertar clientes es correcto");
    }
}
