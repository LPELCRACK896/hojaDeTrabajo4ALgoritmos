import java.io.*;
import java.util.Stack;

public class Lector {

   /**
    * Constructor vacio
    */
   public Lector() {}

   /**
    * @return devuelve la linea escrita en el txt 
    */
   public String readFile() {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      String salida = "";

      try {
         archivo = new File("assets/datos.txt");
         fr = new FileReader(archivo);
         br = new BufferedReader(fr);

         String[] linea = br.readLine().split(" ");
         Stack < String > pila = new Stack < String > ();
         for (int i = 0; i < linea.length; i++) {
            try {
               int numero = Integer.parseInt(linea[i]);
               salida = salida + linea[i] + " ";
            } catch (Exception e0) {
               if (!linea[i].equals(")")) {
                  if (pila.size() >= 1) {
                     if (pila.peek().equals("*") || pila.peek().equals("/")) {
                        for (int j = pila.size(); j > 0; j--) {
                           salida = salida + pila.pop() + " ";
                        }
                     }
                  }
                  pila.add(linea[i]);
               } else {
                  salida = salida + pila.pop() + " ";
                  pila.clear();
               }
            }
         }
         for (int j = pila.size(); j > 0; j--) {
            salida = salida + pila.pop() + " ";
         }
      } catch (Exception e) {
         salida = e.toString();
      } finally {
         try {
            if (null != fr) {
               fr.close();
            }
         } catch (Exception e2) {
            salida = e2.toString();
         }
      }

      return salida;
   }

}