# SistemaArchivos

## Ejecución:

- Ejecutar el script de la base de datos, este se encuentra en recrusos.Bd_Script.

**Trabajado en Windows, en las rutas(Conexión y Main) // ó \\ adecuar según sistema operativo.**

- Para ejecutar el programa, inicialmente se debe dar click en propiedades en Java Build Path dentro de librerías y en jdbcPostgresql editar y agregar la librería de postgresql, esta librería se encuentra en el package recursos.Libreria, paso seguido, cambiar la información de la clase conexión en la variable connectString poner el nombre de la base de datos jdbc:postgresql://localhost:[Puerto]//[Nombre_BD], en la variable user, insertar el nombre del usuario al igual que la contraseña, insertar la contraseña del usuario. Después de configurada la clase conexión, el siguiente elemento de modificación sería la clase main, en la variable ayudante insertar el nombre del archivo csv que se desea registrar en la bd, en el package recursos.Csv_Archivo se encuentran tres diferentes tamaños de registros, elegir el deseado, paso seguido dar el bloque del tamaño deseado e hilos modificando el tamaño que se tiene por defecto y se puede proceder a ejecutar, en el momento en el que se imprima el tiempo de ejecución del programa, este habrá finalizado y se puede terminar.

## Recomendaciones:

- En cuanto a la configuración optima, elegir un tamaño tanto para bloque como de hilos a crear, que al multiplicar ambos de el numero de registros o uno aproximado, para delegar de una manera adecuada las insercciones a realizar. 

- (tamano_bloque)(hilo) -> (100)(100)=10000



