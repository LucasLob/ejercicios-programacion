/**
* Escribe un programa que calcule el factorial de un número entero leído por
* teclado.
* Ejemplo:
* Por favor, introduzca un número entero: 6
* 6! = 720
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio28 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
        
    System.out.print("Por favor, introduzca un número: ");
    int numIntr = Integer.parseInt(n.nextLine());
    int factorial = 1;
    
    if (numIntr > 0) {
      for (int x = numIntr; x > 0; x--) {
        factorial = factorial * x;
      }
      System.out.println("El factorial del número introducido es: " + factorial);
    } else {
      for (int x = numIntr; x < 0; x++) {
        factorial = factorial * x;
      }
      System.out.println("El factorial del número introducido es: " + factorial);
    }
  }
}
