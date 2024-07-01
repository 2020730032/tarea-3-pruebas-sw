# Descripción del diseño del programa
- Programa de línea de comandos en Java para gestionar la reserva de salas de reuniones en una organización. Permite la gestión de salas, usuarios y reservas. Se entiende por gestión al Crear, Ver, Editar y Eliminar.
- El programa fue desarrollado utilizando el IDE de JetBrains, IntelliJ IDEA. Se creo un proyecto de tipo Maven con la configuracion y estructura inicial. Para poder utilizar JUnit se agrego a las dependencias del proyecto JUnit 5. 
- Para el desarrollo del programa se definieron 7 clases. Las primeras 3 clases corresponden a las clases basicas de usuario, sala y reserva. Estas clases sirven para que el crud de usuarios, salas y reservas pueda ser gestionado de mejor manera. Las siguientes 3 clases corresponden a
listaUsuarios, listaSalas y listaReservas. Dichas clases manejan toda la logica del CRUD. Cada una de esas clases listaAlgo, contiene un atributo de tipo ArrayList el cual almacena en tiempo de ejecucion todos los usuarios, salas y reservas creados. La ultima clase corresponde a la clase
Interfaz, la cual es la que contiene la logica de la interfaz para interactuar con los CRUD.
- Para las clases encargadas del CRUD, es decir, las clases listaUsuarios, listaSalas y listaReservas se realizaron test unitarios.

## Supuestos
Se considera que al momento de gestionar las reservas, el espacio de tiempo es la ejecucion del programa, es decir, un usuario no puede tener en una misma ejecucion mas de 1 reserva.

# Instrucciones de ejecución
## Requisitos técnicos 
- Java
- IntelliJ
- IDEA
- Maven
- JUnit
## Uso del programa
1. Clonar el repositorio https://github.com/2020730032/tarea-3-pruebas-sw/
2. Abrir IntelliJ IDEA
3. Abrir repositorio clonado <br>
   ![image](https://github.com/2020730032/tarea-3-pruebas-sw/assets/72176824/59e4bea5-2302-4b87-8b5a-d8d3878c1a44)
4. Dentro del repositorio ejecutar src/java/Interfaz
## Ejecución pruebas
1. Ir a la carpeta test
2. Click derecho en test/java
3. Seleccionar "Run tests in java" <br>
![image](https://github.com/2020730032/tarea-3-pruebas-sw/assets/72176824/69007adb-12c7-4dab-b91c-84c62be0581c)

# Reporte de resultados de las pruebas unitarias
![image](https://github.com/2020730032/tarea-3-pruebas-sw/assets/72176824/74e23694-e3c7-43c3-8d81-95900cbb8317)

