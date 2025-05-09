package co.edu.itc.progrmacion;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@ComponentScan("co.edu.itc.progrmacion")
@EnableJdbcRepositories("co.edu.itc.progrmacion")  // paquete donde están tus repositorios
@PropertySource("classpath:application.properties")
public class AppConfig {
}
