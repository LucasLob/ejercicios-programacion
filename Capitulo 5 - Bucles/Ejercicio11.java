/**
* Escribe un programa que muestre en tres columnas, el cuadrado
* y el cubo de los 5 primeros números enteros a partir de uno que se 
* introduce por teclado.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    System.out.println("Introduzca un número positivo: ");
    System.out.println("_______________________________");
    
      int numeroIntr;
      int suma = 0;
    
      numeroIntr = Integer.parseInt(n.nextLine());
    
      for(int i = 0; i < 5; i++){
        System.out.printf("%4d %6d %8d\n", numeroIntr,numeroIntr * numeroIntr,numeroIntr * numeroIntr * numeroIntr);
        numeroIntr++;
      }
  }
}
