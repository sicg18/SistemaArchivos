package modelo;

import java.sql.Connection;
import java.sql.SQLException;

public class CargaRegistros {

	/**
	 * Esta clase se encarga de realizar la insercción de los registros
	 */

	private void insertarCategoria(String nombrecategoria) {
		try {
			Connection conexion = Conexion.crearConexion();

			String query = "INSERT INTO categoria (category_name) VALUES ('" + nombrecategoria + "')";
			Conexion.sentenciaSQL.execute(query);
			System.out.println("GUARDADO EXITOSO - categoria");

			Conexion.cerrarConexion();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void insertarProducto(String idproducto, String nombreproducto, int idcategoria) {
		try {
			Connection conexion = Conexion.crearConexion();

			String query = "INSERT INTO producto VALUES (" + idproducto + ", '" + nombreproducto + "', " + idcategoria
					+ ")";
			Conexion.sentenciaSQL.execute(query);
			System.out.println("GUARDADO EXITOSO - producto");

			Conexion.cerrarConexion();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void insertarProductoTienda(String producto_idproducto, int tienda_idtienda, int precioproducto) {
		try {
			Connection conexion = Conexion.crearConexion();

			String query = "INSERT INTO producto_tienda VALUES (" + producto_idproducto + ", '" + tienda_idtienda + "', " + precioproducto
					+ ")";
			Conexion.sentenciaSQL.execute(query);
			System.out.println("GUARDADO EXITOSO - producto tienda");

			Conexion.cerrarConexion();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertarTienda(int idtienda, String nombretienda) {
		try {
			Connection conexion = Conexion.crearConexion();

			String query = "INSERT INTO tienda VALUES (" + idtienda + ", '" + nombretienda + ")";
			Conexion.sentenciaSQL.execute(query);
			System.out.println("GUARDADO EXITOSO - tienda");

			Conexion.cerrarConexion();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
