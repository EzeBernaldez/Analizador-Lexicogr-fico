/* 
 mi_especificacion.jflex

 Ejemplo de una especificacion flex utilizando JAVA
 para el analizador lexicografico de un hipotético
 lenguaje de programación dado en la teoria. 

 Autor: Javier Apolloni

 Materia: Automatas y Lenguajes
 Carrera: Lic. en Cs. de la Computación
 Dpto. de Informatica - UNSL
*/

import java.io.*;

%%

%{
public static final int COD_OP_REL_MEN = 1; 
public static final int COD_OP_REL_MAY = 2; 
public static final int COD_ASIG = 3; 
public static final int COD_IF = 4; 
public static final int COD_ELSE = 5; 
public static final int COD_ID = 6; 
public static final int COD_NUM = 7; 
public static final int COD_MAIN = 8;
public static final int COD_CHAR = 9;
public static final int COD_INT = 10;
public static final int COD_WHILE = 11;
public static final int COD_REPEAT = 12;
public static final int COD_UNTIL = 13;
public static final int COD_CIN = 14;
public static final int COD_COUT = 15;
public static final int COD_DISTINTO = 16;
public static final int COD_SUMA = 17;
public static final int COD_OR = 18;
public static final int COD_MULTI = 19;
public static final int COD_AND = 20;
public static final int COD_MEN_IG = 21;
public static final int COD_MAY_IG = 22;
public static final int COD_MENOS = 23;
public static final int COD_PUNTOCOMA = 24;
public static final int COD_PARENTESIS_ABRE = 25;
public static final int COD_PARENTESIS_CIERRA = 26;
public static final int COD_LLAVE_ABRE = 27;
public static final int COD_LLAVE_CIERRA = 28;
public static final int COD_CORCHETE_ABRE = 29;
public static final int COD_CORCHETE_CIERRA = 30;
public static final int COD_IGUAL = 31;
public static final int COD_VOID = 32;
public static final int COD_NEW_LINE = 33;
public static final int COD_ERROR = 34;
public static final int COD_LITERAL = 35;



class Yytoken {
  public int m_index;
  public String m_text;
  
  public Yytoken (int index, String text) {
    /* Crea el token */
    m_index = index;
    m_text = text;
  }


  public boolean imprimir() {
     /* Imprimir el token */
        if((m_index == 6) && (m_text.length() > 30)){
          System.out.println("WARNING: La palabra excede el límite de caracteres (30)");
          String text_aux = m_text;
          m_text="";
          for (int i=0; i<30; i++){
            m_text += text_aux.charAt(i);
            } 
          System.out.println("("+m_index+","+m_text+")");
          return true; /* True si excede el limite de caracteres*/
        }
        else{
          System.out.println("("+m_index+","+m_text+")");
          return false;
        }
    }
}

%} 

%line
%char
%full

delim=[ \t\r]
eb={delim}+
letra=[A-Za-z]
digito=[0-9]
id={letra}({letra}|{digito})*
num={digito}+({digito})*
comentario=#[^#]*#
literal='[^']*'

%% 
  
{eb} 	{/*ninguna accion y no retornar*/}

{comentario} {}

{literal} {return (new Yytoken(COD_LITERAL,yytext()));}

"\n"	{return (new Yytoken(COD_NEW_LINE,""));}

if	{return (new Yytoken(COD_IF,""));}

else	{return (new Yytoken(COD_ELSE,""));}

main	{return (new Yytoken(COD_MAIN,""));}

void	{return (new Yytoken(COD_VOID,""));}

char	{return (new Yytoken(COD_CHAR,""));}

int	{return (new Yytoken(COD_INT,""));}

while	{return (new Yytoken(COD_WHILE,""));}

repeat	{return (new Yytoken(COD_REPEAT,""));}

until	{return (new Yytoken(COD_UNTIL,""));}

cin	{return (new Yytoken(COD_CIN,""));}

cout	{return (new Yytoken(COD_COUT,""));}

{id}	{return (new Yytoken(COD_ID,yytext()));}

{num}	{return (new Yytoken(COD_NUM,yytext()));}

"="	{return (new Yytoken(COD_ASIG,""));}

"<"	{return (new Yytoken(COD_OP_REL_MEN,""));}

">"	{return (new Yytoken(COD_OP_REL_MAY,""));}

"!="	{return (new Yytoken(COD_DISTINTO,""));}

"+"	{return (new Yytoken(COD_SUMA,""));}

"||"	{return (new Yytoken(COD_OR,""));}

"*"	{return (new Yytoken(COD_MULTI,""));}

"&&"	{return (new Yytoken(COD_AND,""));}

"<="	{return (new Yytoken(COD_MEN_IG,""));}

">="	{return (new Yytoken(COD_MAY_IG,""));}

"-"	{return (new Yytoken(COD_MENOS,""));}

";"	{return (new Yytoken(COD_PUNTOCOMA,""));}

"("	{return (new Yytoken(COD_PARENTESIS_ABRE,""));}

")"	{return (new Yytoken(COD_PARENTESIS_CIERRA,""));}

"["	{return (new Yytoken(COD_CORCHETE_ABRE,""));}

"]"	{return (new Yytoken(COD_CORCHETE_CIERRA,""));}

"{"	{return (new Yytoken(COD_LLAVE_ABRE,""));}

"}"	{return (new Yytoken(COD_LLAVE_CIERRA,""));}

"=="	{return (new Yytoken(COD_IGUAL,""));}


. 	{return (new Yytoken(COD_ERROR,yytext()));}
