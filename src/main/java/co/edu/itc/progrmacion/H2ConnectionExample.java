package co.edu.itc.progrmacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class H2ConnectionExample {

    public static void main(String[] args) {
        // URL de la base de datos H2 (puedes usar "mem:" para que sea en memoria)
        String url = "jdbc:h2:~/test";  // Para una base de datos en disco
        String user = "sa";  // Usuario predeterminado
        String password = "";  // Contraseña vacía por defecto

        try {
            // Establecer la conexión
            Connection conn = DriverManager.getConnection(url, user, password);

            // Crear una sentencia (puedes usarla para ejecutar consultas)
            Statement stmt = conn.createStatement();
            System.out.println("Conexión exitosa!");

            // Aquí puedes ejecutar tus consultas SQL (por ejemplo, crear una tabla, etc.)
            stmt.execute("CREATE TABLE IF NOT EXISTS personas (id INT PRIMARY KEY, nombre VARCHAR(255))");

            // Cerrar la conexión
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
