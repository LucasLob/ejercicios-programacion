/**
* Escribe un programa que muestre por pantalla todos los números enteros
* positivos menores a uno leído por teclado que no sean divisibles entre otro
* también leído de igual forma.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio29 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
        
    System.out.print("Por favor, introduzca un número: ");
    int primernumero = Integer.parseInt(n.nextLine());
    System.out.print("Por favor, introduzca otro número: ");
    int segundonumero = Math.abs(Integer.parseInt(n.nextLine()));
    
    if (primernumero > 0) {
      for (int x = 0; x <= primernumero; x++) {
        if ( (x % segundonumero) > 0) {
         System.out.println("El número " +  x + " no es divisible por " + segundonumero);
        }
      }
    } else {
      System.out.println("El número introducido debe ser positivo.");
    }
  }
}
