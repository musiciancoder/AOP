package es.pildoras.gestionPOA.aop;

import es.pildoras.gestionPOA.aop.dao.ClienteDAO;
import es.pildoras.gestionPOA.aop.dao.ClienteVipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClasePrincipal {

    public static void main(String[] args) {

        //Leer la configuracion de Spring
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);


        //Obtener el bean desde el contenedor
        ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);

        ClienteVipDAO elClienteVip = contexto.getBean("clienteVipDAO", ClienteVipDAO.class);

        //llamar al método
        Cliente cl1= new Cliente();
        elCliente.insertaClientes(cl1, "Normal"); //este es el método que debe coincidir con lo que va dentro de la anotacion @Before

        elClienteVip.insertaClientes(); //este es el método que debe coincidir con lo que va dentro de la anotacion @Before

        //cerrar el contexto
        contexto.close();

    }
}
