-------------------------------------------------------------------
Ejemplo del uso de JFlex para construir un Analizador Lexicogr�fico

 Autor: Javier Apolloni

 Materia: Automatas y Lenguajes
 Carrera: Lic. en Cs. de la Computaci�n
 Dpto. de Informatica - UNSL
-------------------------------------------------------------------

LEER LA SECCI�N 5 DEL APUNTE DE "ANALISIS LEXICOGR�FICO" PARA ENTENDER CORRECTAMENTE LOS RESULTADOS OBTENIDOS!!!

1) Archivos

-> mi_especificacion.jflex (especificaci�n jflex para el ejemplo dado en teor�a)
-> Ejemplo.java (clase con el m�todo main - m�todo invocante)

2) Uso

2.1) Descargar el JFlex -herramienta para obtener analizadores lexicogr�ficos basados en ERs- desde el correspondiente sitio web. 

2.2) Compilar la especificaci�n "mi_especificacion.jflex" para obtener la clase "Yylex" (archivo "Yylex.java"): 

-> Utilizar el siguiente comando desde la terminal o consola, considerando que jflex\lib\ es el directorio donde est� JFlex.jar:

java -jar jflex\lib\JFlex.jar mi_especificacion.jflex 
 
-> Otra opci�n para lograr el paso anterior es ejecutar el archivo "JFlex.jar", seleccionar el archivo de especificaciones "mi_especificacion.jflex" y presionar el bot�n "Generate".

El resultado deber� ser similar a lo siguiente:
----------------------------------------------------------
Reading "mi_especificacion.jflex"
Constructing NFA : 42 states in NFA
Converting NFA to DFA :
..................
20 states before minimization, 16 states in minimized DFA
Writing code to "Yylex.java"
----------------------------------------------------------

Este resultado dice que JFlex us� el archivo "mi_especificacion.jflex" para construir la clase "Yylex.java". Desde las ERs listadas en las especificaciones, JFlex construy� un AFND con 42 estados, y lo convirti� en un AFD de 20 estados que luego minimiz� a 16 estados.

La clase "Yylex" construida por la herramienta tiene la implementaci�n tabular del AFD y el m�todo "yylex()". Este m�todo lee el c�digo fuente del usuario y realiza la acci�n correspondiente cuando aisla un token.    

2.3) Compilar la clase Yylex y la clase con el m�todo main ("Ejemplo.java") para obtener el analizador:

javac Yylex.java Ejemplo.java

Con este comando se obtienen los c�digo objeto:
- Yylex.class
- Yylex$Yytoken.class
- Ejemplo.class

2.4) Ejecutar el analizador ("Ejemplo.class") con el c�digo fuente "texto.txt":

java Ejemplo texto.txt

El resultado deber� ser similar a:
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

