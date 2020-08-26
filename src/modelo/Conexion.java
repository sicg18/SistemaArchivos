package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	static String driver = "org.postgresql.Driver"; // Nombre del driver
	static String connectString = "jdbc:postgresql://localhost:5432/ventas"; // Úbicación de la base de datos
	static String user = "postgres"; // usuario de la base de datos
	static String password = "1234"; // password de la base de datos
	static Connection conexionDB = null; // variable que permite la conexion
	static Statement sentenciaSQL = null; // permite la ejecucion de sentencias SQL

	public static Connection crearConexion() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conexionDB = DriverManager.getConnection(connectString, user, password);
		if (conexionDB != null) {
			System.out.print("Conexion establecida...");
			sentenciaSQL = conexionDB.createStatement();

			return conexionDB;
		}
		return null;
	}

	public static void cerrarConexion() {
		conexionDB = null;
		if (sentenciaSQL != null) {
			try {
				sentenciaSQL.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if (conexionDB != null) {
			try {
				conexionDB.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();

			}
		}

	}

}
