/**
* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
* entre 1 y un número leído por teclado.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio27 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
        
    System.out.print("Por favor, introduzca un número: ");
    int numIntr = Integer.parseInt(n.nextLine());
    int multiplo = 0;
    int suma = 0;
    int cuenta = 0;
    
    if (numIntr < 0) {
      System.out.println("El número introducido debe ser mayor a 1.");
    } else {
      for (int x = 1; x <= numIntr; x++) {
        if ((x % 3) == 0) {
          System.out.println("El número " + x + " es múltiplo de 3.");
          multiplo = x;
          suma = suma + multiplo;
          cuenta++;
        }
      }
      System.out.println("La cantidad de múltiplos contenidos es : " + cuenta);
      System.out.println("La suma total de los múltiplos de 3 es: " + suma);
    }
  }
}
