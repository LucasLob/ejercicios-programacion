/**
 *
 * @author Lucas
 */
package ejerciciosfunciones;
import matematicas.Matematicas;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main (String[] args){
      Scanner s;
      s = new Scanner (System.in);
      System.out.print("Escriba un número en binário y lo pasaré a decimal: ");
      long numBin = Integer.parseInt(s.nextLine());
      long numDec = binADec(numBin);
      System.out.print("Su número en decimal es: ");
      System.out.println(numDec);
      
    
  }
    
/* Función para pasar un número de notación binaria a decimal */
public static long binADec (long x){
    long sum = 0;
    long num = x;
    long pot;
    
    for (int i = 0; i < Matematicas.digitos(x); i++) {
      pot = (int)Math.pow(2,i);
      System.out.print(pot);
      if (num % 10 == 1) {
        sum += pot;
      }
      num /= 10;
    }
    return sum;
  }
}
