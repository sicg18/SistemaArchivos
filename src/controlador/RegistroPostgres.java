package controlador;

/**
 * Esta clase se encarga de almacenar las consultas para realizar los registros
 */

public class RegistroPostgres {
	
	public boolean insertarCategoria(int id, String nombrecategoria) {
		try {
			Conexion conexion = new Conexion();
			String query = "INSERT INTO categoria (idcategoria, nombrecategoria) VALUES (" + id + ", '"
					+ nombrecategoria + "')";
			conexion.ejecutar(query);
			conexion.desconectar();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean insertarTienda(int idtienda, String nombretienda) {
		try {
			Conexion conexion = new Conexion();
			String query = "INSERT INTO tienda (idtienda, nombretienda) VALUES (" + idtienda + ", '" + nombretienda
					+ ")";
			conexion.ejecutar(query);
			conexion.desconectar();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean insertarProducto(String idproducto, String nombreproducto, int idcategoria) {
		try {
			Conexion conexion = new Conexion();
			String query = "INSERT INTO producto (idproducto,nombreproducto,idcategoria) VALUES (" + idproducto + ", '"
					+ nombreproducto + "', " + idcategoria + ")";
			conexion.ejecutar(query);
			conexion.desconectar();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean insertarProductoTienda(String producto_idproducto, int tienda_idtienda, int precioproducto) {
		try {
			Conexion conexion = new Conexion();
			String query = "INSERT INTO producto_tienda (producto_idproducto, tienda_idtienda, precioproducto) VALUES ("
					+ producto_idproducto + ", '" + tienda_idtienda + "', " + precioproducto + ")";
			conexion.ejecutar(query);
			conexion.desconectar();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
