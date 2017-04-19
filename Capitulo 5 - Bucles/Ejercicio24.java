/**
Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
*    1
*   121
*  12321
* 1234321
* 
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio24 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
   System.out.print("Introduzca el tamaño de la piramide: ");
   int tamano = Integer.parseInt(n.nextLine());
   int altura = 1;
   int i = 0;
   int espacios = tamano - 1;
    
    while (altura <= tamano) {
      

      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      

      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    }
  }
}
