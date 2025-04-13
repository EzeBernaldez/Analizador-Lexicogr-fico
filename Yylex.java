// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: mi_especificacion.jflex

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


@SuppressWarnings("fallthrough")
class Yylex {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  2,  3,  3,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  4,  0,  5,  0,  0,  6,  7,  8,  9, 10, 11,  0, 12,  0,  0, 
    13, 13, 13, 13, 13, 13, 13, 13, 13, 13,  0, 14, 15, 16, 17,  0, 
     0, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 
    18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19,  0, 20,  0,  0, 
     0, 21, 18, 22, 23, 24, 25, 18, 26, 27, 18, 18, 28, 29, 30, 31, 
    32, 18, 33, 34, 35, 36, 37, 38, 18, 18, 18, 39, 40, 41,  0,  0, 
     0,  0,  0,  0,  0,  3,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\4\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\10\16\1\21\1\1\1\22\1\23\1\0"+
    "\1\24\1\25\1\0\1\26\1\27\1\30\1\31\4\16"+
    "\1\32\6\16\1\33\1\16\1\34\2\16\1\35\5\16"+
    "\1\36\1\37\1\40\1\41\2\16\1\42\2\16\1\43"+
    "\1\44\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\52\0\124\0\52\0\176\0\250\0\322\0\374"+
    "\0\52\0\52\0\52\0\52\0\52\0\u0126\0\52\0\u0150"+
    "\0\u017a\0\u01a4\0\u01ce\0\52\0\52\0\u01f8\0\u0222\0\u024c"+
    "\0\u0276\0\u02a0\0\u02ca\0\u02f4\0\u031e\0\52\0\u0348\0\52"+
    "\0\52\0\250\0\52\0\52\0\374\0\52\0\52\0\52"+
    "\0\52\0\u0372\0\u039c\0\u03c6\0\u03f0\0\u01ce\0\u041a\0\u0444"+
    "\0\u046e\0\u0498\0\u04c2\0\u04ec\0\52\0\u0516\0\u01ce\0\u0540"+
    "\0\u056a\0\u01ce\0\u0594\0\u05be\0\u05e8\0\u0612\0\u063c\0\u01ce"+
    "\0\u01ce\0\u01ce\0\u01ce\0\u0666\0\u0690\0\u01ce\0\u06ba\0\u06e4"+
    "\0\u01ce\0\u01ce\0\u01ce";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\0\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\23\1\26\1\23"+
    "\1\27\2\23\1\30\1\23\1\31\3\23\1\32\2\23"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\53\0\1\3"+
    "\70\0\1\41\31\0\5\42\1\43\44\42\6\0\1\44"+
    "\43\0\7\45\1\46\42\45\15\0\1\16\54\0\1\47"+
    "\51\0\1\50\51\0\1\51\46\0\1\23\4\0\1\23"+
    "\2\0\22\23\20\0\1\23\4\0\1\23\2\0\5\23"+
    "\1\52\1\53\3\23\1\54\7\23\20\0\1\23\4\0"+
    "\1\23\2\0\7\23\1\55\12\23\20\0\1\23\4\0"+
    "\1\23\2\0\4\23\1\56\4\23\1\57\10\23\20\0"+
    "\1\23\4\0\1\23\2\0\1\60\21\23\20\0\1\23"+
    "\4\0\1\23\2\0\3\23\1\61\16\23\20\0\1\23"+
    "\4\0\1\23\2\0\11\23\1\62\10\23\20\0\1\23"+
    "\4\0\1\23\2\0\12\23\1\63\7\23\20\0\1\23"+
    "\4\0\1\23\2\0\5\23\1\64\14\23\53\0\1\65"+
    "\16\0\1\23\4\0\1\23\2\0\1\66\21\23\20\0"+
    "\1\23\4\0\1\23\2\0\11\23\1\67\10\23\20\0"+
    "\1\23\4\0\1\23\2\0\17\23\1\70\2\23\20\0"+
    "\1\23\4\0\1\23\2\0\15\23\1\71\4\23\20\0"+
    "\1\23\4\0\1\23\2\0\16\23\1\72\3\23\20\0"+
    "\1\23\4\0\1\23\2\0\6\23\1\73\13\23\20\0"+
    "\1\23\4\0\1\23\2\0\13\23\1\74\6\23\20\0"+
    "\1\23\4\0\1\23\2\0\16\23\1\75\3\23\20\0"+
    "\1\23\4\0\1\23\2\0\6\23\1\76\13\23\20\0"+
    "\1\23\4\0\1\23\2\0\6\23\1\77\13\23\20\0"+
    "\1\23\4\0\1\23\2\0\14\23\1\100\5\23\20\0"+
    "\1\23\4\0\1\23\2\0\16\23\1\101\3\23\20\0"+
    "\1\23\4\0\1\23\2\0\3\23\1\102\16\23\20\0"+
    "\1\23\4\0\1\23\2\0\11\23\1\103\10\23\20\0"+
    "\1\23\4\0\1\23\2\0\3\23\1\104\16\23\20\0"+
    "\1\23\4\0\1\23\2\0\6\23\1\105\13\23\20\0"+
    "\1\23\4\0\1\23\2\0\2\23\1\106\17\23\20\0"+
    "\1\23\4\0\1\23\2\0\7\23\1\107\12\23\20\0"+
    "\1\23\4\0\1\23\2\0\1\110\21\23\20\0\1\23"+
    "\4\0\1\23\2\0\7\23\1\111\12\23\20\0\1\23"+
    "\4\0\1\23\2\0\3\23\1\112\16\23\20\0\1\23"+
    "\4\0\1\23\2\0\16\23\1\113\3\23\3\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[1806];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\4\1\5\11\1\1\1\11"+
    "\4\1\2\11\10\1\1\11\1\1\2\11\1\0\2\11"+
    "\1\0\4\11\13\1\1\11\26\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
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



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    return ZZ_CMAP[input];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Yytoken yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return (new Yytoken(COD_ERROR,yytext()));
            }
          // fall through
          case 38: break;
          case 2:
            { /*ninguna accion y no retornar*/
            }
          // fall through
          case 39: break;
          case 3:
            { return (new Yytoken(COD_NEW_LINE,""));
            }
          // fall through
          case 40: break;
          case 4:
            { return (new Yytoken(COD_PARENTESIS_ABRE,""));
            }
          // fall through
          case 41: break;
          case 5:
            { return (new Yytoken(COD_PARENTESIS_CIERRA,""));
            }
          // fall through
          case 42: break;
          case 6:
            { return (new Yytoken(COD_MULTI,""));
            }
          // fall through
          case 43: break;
          case 7:
            { return (new Yytoken(COD_SUMA,""));
            }
          // fall through
          case 44: break;
          case 8:
            { return (new Yytoken(COD_MENOS,""));
            }
          // fall through
          case 45: break;
          case 9:
            { return (new Yytoken(COD_NUM,yytext()));
            }
          // fall through
          case 46: break;
          case 10:
            { return (new Yytoken(COD_PUNTOCOMA,""));
            }
          // fall through
          case 47: break;
          case 11:
            { return (new Yytoken(COD_OP_REL_MEN,""));
            }
          // fall through
          case 48: break;
          case 12:
            { return (new Yytoken(COD_ASIG,""));
            }
          // fall through
          case 49: break;
          case 13:
            { return (new Yytoken(COD_OP_REL_MAY,""));
            }
          // fall through
          case 50: break;
          case 14:
            { return (new Yytoken(COD_ID,yytext()));
            }
          // fall through
          case 51: break;
          case 15:
            { return (new Yytoken(COD_CORCHETE_ABRE,""));
            }
          // fall through
          case 52: break;
          case 16:
            { return (new Yytoken(COD_CORCHETE_CIERRA,""));
            }
          // fall through
          case 53: break;
          case 17:
            { return (new Yytoken(COD_LLAVE_ABRE,""));
            }
          // fall through
          case 54: break;
          case 18:
            { return (new Yytoken(COD_LLAVE_CIERRA,""));
            }
          // fall through
          case 55: break;
          case 19:
            { return (new Yytoken(COD_DISTINTO,""));
            }
          // fall through
          case 56: break;
          case 20:
            { 
            }
          // fall through
          case 57: break;
          case 21:
            { return (new Yytoken(COD_AND,""));
            }
          // fall through
          case 58: break;
          case 22:
            { return (new Yytoken(COD_LITERAL,yytext()));
            }
          // fall through
          case 59: break;
          case 23:
            { return (new Yytoken(COD_MEN_IG,""));
            }
          // fall through
          case 60: break;
          case 24:
            { return (new Yytoken(COD_IGUAL,""));
            }
          // fall through
          case 61: break;
          case 25:
            { return (new Yytoken(COD_MAY_IG,""));
            }
          // fall through
          case 62: break;
          case 26:
            { return (new Yytoken(COD_IF,""));
            }
          // fall through
          case 63: break;
          case 27:
            { return (new Yytoken(COD_OR,""));
            }
          // fall through
          case 64: break;
          case 28:
            { return (new Yytoken(COD_CIN,""));
            }
          // fall through
          case 65: break;
          case 29:
            { return (new Yytoken(COD_INT,""));
            }
          // fall through
          case 66: break;
          case 30:
            { return (new Yytoken(COD_CHAR,""));
            }
          // fall through
          case 67: break;
          case 31:
            { return (new Yytoken(COD_COUT,""));
            }
          // fall through
          case 68: break;
          case 32:
            { return (new Yytoken(COD_ELSE,""));
            }
          // fall through
          case 69: break;
          case 33:
            { return (new Yytoken(COD_MAIN,""));
            }
          // fall through
          case 70: break;
          case 34:
            { return (new Yytoken(COD_VOID,""));
            }
          // fall through
          case 71: break;
          case 35:
            { return (new Yytoken(COD_UNTIL,""));
            }
          // fall through
          case 72: break;
          case 36:
            { return (new Yytoken(COD_WHILE,""));
            }
          // fall through
          case 73: break;
          case 37:
            { return (new Yytoken(COD_REPEAT,""));
            }
          // fall through
          case 74: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
