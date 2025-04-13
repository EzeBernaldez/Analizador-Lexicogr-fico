import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.io.*;

public class Ejemplo extends JFrame {
    private JTextPane textPane;

    // Constructor para la ventana gráfica
    public Ejemplo(int hayError) {
        setTitle("Visualización de Código Fuente");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        textPane = new JTextPane();
        textPane.setEditable(false);
        textPane.setBackground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane(textPane);
        add(scrollPane, BorderLayout.CENTER);
        mostrarTokens(hayError);
    }

    private void mostrarTokens(int hayError) {
        try {
                System.out.println("entra");
                BufferedReader source = new BufferedReader(new FileReader("tokens.txt"));
                String linea;
                StyledDocument doc = textPane.getStyledDocument();
                if(hayError ==0 )
                    while((linea = source.readLine()) != null ){
                        String[] palabras=linea.split("[,()]");
                        if (palabras[1].equals("6")){
                            agregarTexto(doc,palabras[2]+ " ",Color.YELLOW);
                        }
                        if(palabras[1].equals("7")){
                            agregarTexto(doc,palabras[2] + " ",Color.RED);
                        }
                        if(palabras[1].equals("33")){
                            agregarTexto(doc,"\n",Color.RED);
                        }
                        if(palabras[1].equals("35")){
                            agregarTexto(doc,palabras[2] + " ",Color.CYAN);
                        }
                    }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    // Método para agregar texto con color
    private void agregarTexto(StyledDocument doc, String texto, Color color) {
        try {
            Style style = doc.addStyle("Style", null);
            StyleConstants.setForeground(style, color);
            doc.insertString(doc.getLength(), texto, style);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    // Método para procesar el análisis léxico y guardar en tokens.txt
    public static int analizarCodigo(String archivo) {
        int hayError = 0;

        try (FileWriter f = new FileWriter("tokens.txt")) {
            Yylex s = new Yylex(new FileReader(archivo));
            System.out.print("Presione Enter para iniciar el análisis lexicográfico: ");
            System.in.read(new byte[2]);

            Yylex.Yytoken t = s.yylex();
            while (t != null) {
				boolean limite_caracteres = t.imprimir();
				if (t.m_index == 34){ //34 es el token del error
					hayError=1;
					f.write("(" + t.m_index + "," + t.m_text + ")\n");
                    if(t.m_text.equals("#")){
                        f.write("ERROR: El fin de comentario (# ) no ha sido encontrado antes del fin de archivo.");
                        System.out.println("ERROR: El fin de comentario (# ) no ha sido encontrado antes del fin de archivo.");
                    }
                    else{
                        if(t.m_text.equals("'")){
                            f.write("ERROR: El símbolo de fin de un literal (’) no fue encontrado.");
                            System.out.println("ERROR: El símbolo de fin de un literal (’) no fue encontrado.");
                        }
                        else{
                            f.write("ERROR: Se ha ingresado caracter/es no válido/s\n");
                            System.out.println("ERROR: Se ha ingresado caracter/es no válido/s\n");
                        }
                    }

				}
				else{
					if (limite_caracteres) {
						f.write("(" + t.m_index + "," + t.m_text + ")\n");
						f.write("WARNING: La palabra excede el límite de caracteres (30)\n");
					} else {
						f.write("(" + t.m_index + "," + t.m_text + ")\n");
					}
				}
                t = s.yylex();
                if (t != null) {
                    System.in.read(new byte[2]); // Presionar Enter para el próximo token
                }
            }

            System.out.println("Finalizó con éxito el análisis lexicográfico.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return hayError;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Uso: java Ejemplo <archivo_codigo>");
            System.exit(1);
        }

        // Primero analizamos el código
        int hayError = analizarCodigo(args[0]);

        // Luego mostramos la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo(hayError).setVisible(true);
            }
        });
    }
}