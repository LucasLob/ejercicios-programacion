/**
* Muestra la tabla de multiplicar de un número introducido por teclado.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int numeroIntroducido;
    int multiplicador = 1;
  
    System.out.println("Se mostrará la tabla de multiplicar de un número introducido por teclado.");
    System.out.print("Introduce un número: ");
    numeroIntroducido = Integer.parseInt(n.nextLine());
    
    do {
      System.out.println(numeroIntroducido +" x " + multiplicador + ": " + numeroIntroducido * multiplicador);
      
      multiplicador++;
    } while (multiplicador < 11);
    
    
  }
}
