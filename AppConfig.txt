package co.edu.itc.progrmacion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("co.edu.itc.progrmacion")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
