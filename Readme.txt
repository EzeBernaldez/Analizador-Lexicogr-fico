-------------------------------------------------------------------
Ejemplo del uso de JFlex para construir un Analizador Lexicográfico

 Autor: Javier Apolloni

 Materia: Automatas y Lenguajes
 Carrera: Lic. en Cs. de la Computación
 Dpto. de Informatica - UNSL
-------------------------------------------------------------------

LEER LA SECCIÓN 5 DEL APUNTE DE "ANALISIS LEXICOGRÁFICO" PARA ENTENDER CORRECTAMENTE LOS RESULTADOS OBTENIDOS!!!

1) Archivos

-> mi_especificacion.jflex (especificación jflex para el ejemplo dado en teoría)
-> Ejemplo.java (clase con el método main - método invocante)

2) Uso

2.1) Descargar el JFlex -herramienta para obtener analizadores lexicográficos basados en ERs- desde el correspondiente sitio web. 

2.2) Compilar la especificación "mi_especificacion.jflex" para obtener la clase "Yylex" (archivo "Yylex.java"): 

-> Utilizar el siguiente comando desde la terminal o consola, considerando que jflex\lib\ es el directorio donde está JFlex.jar:

java -jar jflex\lib\JFlex.jar mi_especificacion.jflex 
 
-> Otra opción para lograr el paso anterior es ejecutar el archivo "JFlex.jar", seleccionar el archivo de especificaciones "mi_especificacion.jflex" y presionar el botón "Generate".

El resultado deberá ser similar a lo siguiente:
----------------------------------------------------------
Reading "mi_especificacion.jflex"
Constructing NFA : 42 states in NFA
Converting NFA to DFA :
..................
20 states before minimization, 16 states in minimized DFA
Writing code to "Yylex.java"
----------------------------------------------------------

Este resultado dice que JFlex usó el archivo "mi_especificacion.jflex" para construir la clase "Yylex.java". Desde las ERs listadas en las especificaciones, JFlex construyó un AFND con 42 estados, y lo convirtió en un AFD de 20 estados que luego minimizó a 16 estados.

La clase "Yylex" construida por la herramienta tiene la implementación tabular del AFD y el método "yylex()". Este método lee el código fuente del usuario y realiza la acción correspondiente cuando aisla un token.    

2.3) Compilar la clase Yylex y la clase con el método main ("Ejemplo.java") para obtener el analizador:

javac Yylex.java Ejemplo.java

Con este comando se obtienen los código objeto:
- Yylex.class
- Yylex$Yytoken.class
- Ejemplo.class

2.4) Ejecutar el analizador ("Ejemplo.class") con el código fuente "texto.txt":

java Ejemplo texto.txt

El resultado deberá ser similar a:
--------
Presione Enter para iniciar el analisis lexicografico:
(4,)
(7,3.5)
(1,)
(7,4)
(5,)
(6,aux1)
(3,)
(7,3)
(4,)
(7,1)
(1,)
(7,67)
(5,)
(6,y)
(3,)
(7,7)
Finalizo con exito el analisis lexicografico.
--------

