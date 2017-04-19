/**
* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
* programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
* dos asteriscos menos en la base para simular la curvatura de las esquinas
* inferiores.
* Ejemplo 1:
* Introduzca la altura de la U: 5
*
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio33 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
  int altura;
  
  System.out.print("Introduzca la altura de la U: ");
  altura = Integer.parseInt(n.nextLine());
  
    for (int i = 1; i < altura; i++) {
      System.out.print("* ");
      for (int j = 2; j < altura; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }
    
    System.out.print("  ");
    for (int i = 2; i < altura; i++) {
      System.out.print("* ");
    }
  }
}
