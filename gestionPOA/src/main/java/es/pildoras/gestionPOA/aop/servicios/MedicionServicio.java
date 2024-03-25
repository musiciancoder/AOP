package es.pildoras.gestionPOA.aop.servicios;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class MedicionServicio {

    public String getServicio() {
        //vamos a simular que estas tareas toman un tiempo, con el objetivo de poder medir ese tiempo
        System.out.println("****EL METODO ESTA SIMULANDO SUS TAREAS***");
        try {
            TimeUnit.SECONDS.sleep(4);//dormir 4 segundos
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Servicios terminados";
    }
}
