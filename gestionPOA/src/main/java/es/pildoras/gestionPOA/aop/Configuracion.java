package es.pildoras.gestionPOA.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("es.pildoras.gestionPOA.aop") //escanear paquete
public class Configuracion {

}
