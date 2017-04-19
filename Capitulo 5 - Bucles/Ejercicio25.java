/**
* Realiza un programa que pida un número por teclado y que luego muestre ese
* número al revés.
* 
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    
    System.out.print("Introduzca un número entero: ");
    int numIntr = Integer.parseInt(n.nextLine());

    int numero = numIntr;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    System.out.println("El número " + numIntr + " volteado es igual a: " + volteado);
  }
}
