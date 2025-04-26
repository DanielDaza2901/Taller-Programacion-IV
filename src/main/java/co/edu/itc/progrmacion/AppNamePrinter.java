package co.edu.itc.progrmacion;

<<<<<<< HEAD
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

=======
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


>>>>>>> dd070a7911ea1426b3b517f9b21e92e8d78dab4d
@Component
public class AppNamePrinter {

    @Value("${app.name}")
    private String appName;

<<<<<<< HEAD
    @PostConstruct
=======
>>>>>>> dd070a7911ea1426b3b517f9b21e92e8d78dab4d
    public void imprimirNombre() {
        System.out.println("Nombre de la aplicación: " + appName);
    }
}
