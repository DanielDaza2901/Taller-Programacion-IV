package co.edu.itc.progrmacion;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppNamePrinter {

    @Value("${app.name}")
    private String appName;

    @PostConstruct
    public void imprimirNombre() {
        System.out.println("Nombre de la aplicación: " + appName);
    }
}
