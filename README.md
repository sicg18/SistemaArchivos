# SistemaArchivos

## Ejecución:

- Ejecutar el script de la base de datos, este se encuentra en recrusos.Bd_Script **IMPORTANTE: Crear siempre la clave unica de nombrecategoria para el correcto funcionamiento de la aplicación**.

**Trabajado en Windows, en las rutas(Conexión y Main) // ó \\ adecuar según sistema operativo.**

- Para ejecutar el programa, inicialmente se debe dar click en propiedades en Java Build Path dentro de librerías y en jdbcPostgresql editar y agregar la librería de postgresql, esta librería se encuentra en el package recursos.Libreria.
Cambiar la información de la clase conexión en la variable connectString poner el nombre de la base de datos jdbc:postgresql://localhost:[Puerto]//[Nombre_BD], en la variable user, insertar el nombre del usuario al igual que la contraseña, insertar la contraseña del usuario. 
- El siguiente elemento de modificación sería la clase main, en la variable ayudante insertar el nombre del archivo csv que se desea registrar en la bd, en el package recursos.Csv_Archivo se encuentran tres diferentes tamaños de registros elegir el deseado.
- Paso seguido dar el bloque del tamaño e hilos deseados, esto modificando el tamaño que se tiene por defecto en el código fuente existe un comentario que indica donde modificar las varibles que poseen el nombre de lo que es cada una de ellas.
-En el momento en el que se imprima el tiempo de ejecución del programa, este habrá finalizado y se puede terminar.

- Archivos:
Data.csv -> 10000 (Por defecto)
Datas.csv -> 3333
Datita.csv -> 555

## Recomendaciones:

- En cuanto a la configuración optima, elegir un tamaño tanto para bloque como de hilos a crear, que al multiplicar ambos de el numero de registros o uno aproximado, para delegar de una manera adecuada las insercciones a realizar. 

- (tamano_bloque)(hilo) -> (100)(100)=10000

#### Extra:

- Consulta para listar todos los registros con sus características
SELECT p.idproducto,p.nombreproducto,pt.precioproducto,c.nombrecategoria,t.idtienda,t.nombretienda from categoria c join producto p on c.idcategoria = p.idcategoria join producto_tienda pt on pt.producto_idproducto = p.idproducto join tienda t on t.idtienda = pt.tienda_idtienda;


