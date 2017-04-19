/**
* Escribe un programa que diga si un número introducido por teclado es o no
* capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
* programa debe aceptar números de cualquier longitud siempre que lo permita
* el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
* long en lugar de int ya que el primero admite números más largos.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio36 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
  
    System.out.print("Introduzca un número: ");
    long numIntr = Long.parseLong(n.nextLine());
    long aux = numIntr;
    long volteado = 0; 
    
    while (numIntr > 0) {
      volteado = (volteado * 10) + (numIntr % 10);
      numIntr /= 10;
    }
    
    if (aux == volteado) {
      System.out.println("\nEl " + aux + " es capicúa.");
    } else {
      System.out.println("\nEl " + aux + " no es capicúa.");
    }
    
  }
}
