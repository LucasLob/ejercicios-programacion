/**
* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
* programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
* mitad (división entera entre 2) de la altura más uno.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio31 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
  int altIntr;
  
  System.out.print("El programa pintará una L. Introduzca la altura: ");
  altIntr = Integer.parseInt(n.nextLine());
  int linHor;
  System.out.println("");
  
    for(int i = altIntr - 1 ; i > 0; i--){
      System.out.println("*");
    }
    
    linHor = (altIntr + 1) / 2;
    for(int j = linHor; j > 0; j--){
    System.out.print("* ");
    }
  }
}
