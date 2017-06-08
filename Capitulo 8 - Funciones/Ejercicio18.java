/**
 *
 * @author Lucas
 */
package ejerciciosfunciones;
import java.util.Scanner;


public class Ejercicio18 {
    public static void main (String[] args){
      Scanner s = new Scanner (System.in);
      System.out.println("Introduce un número y el programa lo pasará a binario: ");
      int numDec = Integer.parseInt(s.nextLine());
      
      int numBin = DecABin(numDec);
      
      System.out.println("Su número en binario es: " + numBin);
    
  }
    
/* Función para pasar un número de notación decimal a binaria */
public static int DecABin (int decimal){
    String binario = "";
    while (decimal > 0) {
      binario = binario + (decimal % 2);
      decimal = decimal / 2;
    }
    String resultado = "";
    for (int i = (binario.length() - 1); i >= 0; i--) {
      resultado = resultado + binario.charAt(i);
    }
    return (int) Long.parseLong(resultado);
  }
}
