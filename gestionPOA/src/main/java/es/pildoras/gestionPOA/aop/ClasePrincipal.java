package es.pildoras.gestionPOA.aop;

import es.pildoras.gestionPOA.aop.dao.ClienteDAO;
import es.pildoras.gestionPOA.aop.dao.ClienteVipDAO;
import es.pildoras.gestionPOA.aop.servicios.MedicionServicio;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClasePrincipal {

    public static void main(String[] args) {

        //Leer la configuracion de Spring
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);


/*        //Obtener el bean desde el contenedor
        ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);

        try {
            boolean miParam=true;
            elCliente.encuentraClientes(miParam);
        } catch (Exception miEx) {
            System.out.println("Excepcion lanzada desde clase principal");
            System.out.println(miEx.getMessage());
        }


        System.out.println("Aqui continuaria la ejecucion del programa");
 */
        /*
        ClienteVipDAO elClienteVip = contexto.getBean("clienteVipDAO", ClienteVipDAO.class);

        //llamar al método
        Cliente cl1= new Cliente();

        cl1.setNombre("Juan Diaz");

        cl1.setTipo("Normal");

        elCliente.insertaClientes(cl1, cl1.getTipo()); //este es el método que debe coincidir con lo que va dentro de la anotacion @Before

        elClienteVip.insertaClientes(); //este es el método que debe coincidir con lo que va dentro de la anotacion @Before

         */

        //Para que funcione @Around
        MedicionServicio elServicio=contexto.getBean("medicionServicio",MedicionServicio.class);
        System.out.println("Llamando al método getServicio()");
        String datos = elServicio.getServicio();
        System.out.println("Devolucion del metodo: " + datos);

        //cerrar el contexto
        contexto.close();

/*        elCliente.setCodigoClienteNormal("547475");
        elCliente.setValoracionClienteNormal("positiva");

        String codigoCl = elCliente.getCodigoClienteNormal();
        String valoraCl = elCliente.getValoracionClienteNormal();*/

    }
}
