package es.pildoras.gestionPOA.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoginConAspecto { //este es el aspecto

  //  @Pointcut("execution(public * insertarClientes*(..))"){} //este pointcut expression es el que se reutilizará
    @Pointcut("execution(* es.pildoras.gestionPOA.aop.dao.*.*(..))") //con esto decimos q el aspecto se ejecute sobre cualquier metodo (incluidos metodos getters y setters) de este paquete con cualquier numero de argumentos
    public void paraClientes(){}

  /*
    //Pointcut para getters
    @Pointcut("execution(* es.pildoras.gestionPOA.aop.dao.*.get*(..))") //Con esto el aspecto actuará solo cuando ejecutamos un getter
    private void paraGetters(){}

    //Pointcut para setters
    @Pointcut("execution(* es.pildoras.gestionPOA.aop.dao.*.set*(..))") //Con esto el aspecto actuará solo cuando ejecutamos un setter
    private void paraSetters(){}



    //Combinacion de pointcuts
   // @Pointcut("paraClientes() && !(paraGetters() || paraSetters())") //dentro del paquete menos getters ni setters
    //private void paqueteExceptoGetterSetter(){}
    @Pointcut("paraClientes() && !paraSetters()") //dentro del paquete menos setters
    private void paqueteExceptoSetter(){}
*/

    //notar que como pusimos ClienteVipDao en el @Before solo se ejecuta el aspecto de ClienteVipDao. Sino, se ejecutarian ambos aspectos, el de ClienteDao y el de ClienteVipDAO
 //Los before de aca hacia abajo son "pointcut expressions"
  //  @Before("execution(public void es.pildoras.gestionPOA.aop.dao.ClienteVipDao.insertarCliente())")    //Esto es una PointCut Expression; notar que como pusimos ClienteVipDao en el @Before solo se ejecuta el aspecto de ClienteVipDao. Sino, se ejecutarian ambos aspectos, el de ClienteDao y el de ClienteVipDAO
   // @Before("execution(public String insertarClientes*)") // al tener insertarClientes* deberia ejecuta ambos aspectos (ya que ambos metodos desencadenantes comienzan con insertarClientes(), sin embargo solo ejecuta los aspectos para el metodo insertarClientes() que devuelve un String (el de clienteDAO, despues lo volvió a cambiar a void, pero probó con String)
  //  @Before("execution(public * insertarClientes*())") // con esto solventamos lo de la linea anterior y se ejecutaran ambos aspectos
   // @Before("execution(public * insertarClientes*(es.pildoras.gestionPOA.aop.Cliente, ..))") // con esto aceptamos todos los parámetros que le estamos pasando a insertaClientes() de ClienteDAO
   // @Before("execution(public * insertarClientes*(..))") // con esto conseguimos q funcionen toditos los aspectos, tanto para ClienteDAO (que pasa parametro), como para ClienteVipDAO (que no pasa parametros
  //  @Before("paraClientes()") // reutilizacion de pointcut expression
   // @Before("paraGetters()") //solo ejecuta el aspecto para los getters
   // @Before("paraSetters()") //solo ejecuta el aspecto para los setters
    //@Before("paqueteExceptoGetterSetter") //ejecuta todos menos getters ni setters
    @Before("paqueteExceptoSetter") //ejecuta todos menos setters
    public void antesInsertarCliente(){
        System.out.println("El usuario esta logueado");
        System.out.println("El perfil para insertar clientes es correcto");
    }


}
