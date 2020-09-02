# SistemaArchivos

## Ejecuci�n:

- Ejecutar el script de la base de datos, este se encuentra en recrusos.Bd_Script **IMPORTANTE: Crear siempre la clave unica de nombrecategoria para el correcto funcionamiento de la aplicaci�n**.

**Trabajado en Windows, en las rutas(Conexi�n y Main) // � \\ adecuar seg�n sistema operativo.**

- Para ejecutar el programa, inicialmente se debe dar click en propiedades en Java Build Path dentro de librer�as y en jdbcPostgresql editar y agregar la librer�a de postgresql, esta librer�a se encuentra en el package recursos.Libreria.
Cambiar la informaci�n de la clase conexi�n en la variable connectString poner el nombre de la base de datos jdbc:postgresql://localhost:[Puerto]//[Nombre_BD], en la variable user, insertar el nombre del usuario al igual que la contrase�a, insertar la contrase�a del usuario. 
- El siguiente elemento de modificaci�n ser�a la clase main, en la variable ayudante insertar el nombre del archivo csv que se desea registrar en la bd, en el package recursos.Csv_Archivo se encuentran tres diferentes tama�os de registros elegir el deseado.
- Paso seguido dar el bloque del tama�o e hilos deseados, esto modificando el tama�o que se tiene por defecto en el c�digo fuente existe un comentario que indica donde modificar las varibles que poseen el nombre de lo que es cada una de ellas.
-En el momento en el que se imprima el tiempo de ejecuci�n del programa, este habr� finalizado y se puede terminar.

- Archivos:
Data.csv -> 10000 (Por defecto)
Datas.csv -> 3333
Datita.csv -> 555

## Recomendaciones:

- En cuanto a la configuraci�n optima, elegir un tama�o tanto para bloque como de hilos a crear, que al multiplicar ambos de el numero de registros o uno aproximado, para delegar de una manera adecuada las insercciones a realizar. 

- (tamano_bloque)(hilo) -> (100)(100)=10000

#### Extra:

- Consulta para listar todos los registros con sus caracter�sticas
SELECT p.idproducto,p.nombreproducto,pt.precioproducto,c.nombrecategoria,t.idtienda,t.nombretienda from categoria c join producto p on c.idcategoria = p.idcategoria join producto_tienda pt on pt.producto_idproducto = p.idproducto join tienda t on t.idtienda = pt.tienda_idtienda;


