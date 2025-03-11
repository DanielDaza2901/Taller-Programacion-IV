# Biblioteca

Este proyecto implementa un sistema de gestión de biblioteca en Java(MAVEN), utilizando principios de programación orientada a objetos y manejo de colecciones.

## Funcionalidades

- Gestión de recursos (libros, periódicos y computadoras).
- Búsqueda de recursos por criterio parcial.
- Eliminación de recursos.

## Uso

1. Compilar el proyecto con Maven: `mvn clean install`.
2. Ejecutar la clase `Main` para probar las funcionalidades.

## Paso a paso

1. Compilación del Proyecto
Para compilar tu proyecto en Java, necesitas tener instalado el JDK (Java Development Kit) en tu sistema. Si ya lo tienes instalado, sigue estos pasos:

Abrir la Terminal: En la carpeta raíz de tu proyecto, abre una terminal o símbolo del sistema.


Crear un Archivo JAR:
Si deseas empaquetar tu proyecto en un archivo JAR, ejecuta:


Se puede generar el .jar en la carpeta TARGET
despues de de correr la etapa de "PACKAGE" en la pestaña de maven,
Se debe ejecutar  "PACKAGE" y se ejecuta, se crea el .jar en la carpeta de TARGET
Se debe abrir  el main.java desde vs studio, en la parte superior debe aparecer un icono
de PLAY RUN se da click y se ejecuta.


Paso a Paso en Visual Studio Code
1. Configuración del Proyecto
Instalar Extensiones:

Instala las extensiones Java Extension Pack y Maven for Java desde el marketplace de VS Code.

Crear un Proyecto Maven:

Si no tienes un archivo pom.xml, crea uno para gestionar dependencias y compilación.

2. Compilación y Ejecución del Proyecto
Abrir el Proyecto en VS Code:

Abre la carpeta raíz de tu proyecto en VS Code.

Compilar el Proyecto:

Si estás usando Maven, ejecuta el comando en la terminal de VS Code:

bash
mvn clean compile
Si no usas Maven, puedes compilar manualmente como se indicó anteriormente.

Ejecutar el Proyecto:

## Parcial 1
## Diferencia entre @Component y @Configuration en Spring.
@Component se usa para marcar una clase como componente, mientras que @Configuration se usa para anotar una clase que define beans. 

## Ejemplo de Inyección de Dependencia mediante Constructor:

    @Component
    public class ServicioEjemplo {
        private final Repositorio<Libro> libroRepositorio;

        @Autowired
        public ServicioEjemplo(Repositorio<Libro> libroRepositorio) {
            this.libroRepositorio = libroRepositorio;
        }
    }
 Interfaz Genérica Repositorio<T>:

    public interface Repositorio<T> {
        void agregar(T elemento);
        void eliminar(T elemento);
        T buscar(String criterio);
        Collection<T> obtenerTodos();
    }
## Explique el principio de inversión de control y cómo se aplica en esta solución.

Principio de Inversión de Control (IoC):

IoC delega el control de la creación y gestión de dependencias a un contenedor (Spring).

## Refactorización del Servicio de Biblioteca (20 puntos)

1.  Modificar ServicioBiblioteca:


    @Service
    public class ServicioBiblioteca {
        private final Repositorio<Libro> libroRepositorio;
        /

        @Autowired
        public ServicioBiblioteca(Repositorio<Libro> libroRepositorio,) {
            
        }
    }
    

## Explique cómo funciona la inyección de propiedades en Spring utilizando @Value y qué precedencia tiene cada fuente.

2.  Combinar Resultados de Múltiples Repositorios:

    public Collection<Recurso> obtenerTodos() {
        return Stream.of(libroRepositorio.obtenerTodos())
                     .flatMap(Collection::stream)
                     .collect(Collectors.toList());
    }
    

### Implementación de la Clase Principal con Spring (20 puntos)

1.  Clase Main:

   
    public class Main {
        public static void main(String[] args) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            ServicioBiblioteca servicioBiblioteca = context.getBean(ServicioBiblioteca.class);

        }
    }
    

### Configuración de Spring y Lectura de Propiedades (20 puntos)

1.  Archivo application.properties:

    app.name=GestionBibliotecaSpring


2.  Clase para Leer la Propiedad:

   
    @Component
    public class AppNamePrinter {
        @Value("${app.name}")
        private String appName;

        @PostConstruct
        public void imprimirNombre() {
            System.out.println("Nombre de la aplicación: " + appName);
        }
    }

3.  Explicación de Inyección de Propiedades:

      @Value: Se utiliza para inyectar valores de propiedades.
      Precedencia: Properties > Environment Variables > Java System Properties.
## Integrantes

- [Ivan Andres Salas Leiva]
- [Daniel Eduardo Daza Cuello]
- [Andres Esteban Cruz Vargas]

- Programacion IV
- Grupo: S7B
