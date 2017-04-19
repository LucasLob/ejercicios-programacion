/**
* Realiza un programa que sume los 100 números siguientes a un número entero
* y positivo introducido por teclado. Se debe comprobar que el dato introducido
* es correcto (que es un número positivo).
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int numIntr;
    int resultado = 0;
    
    System.out.print("Introduzca un número entero positivo: ");
       
    do {
      numIntr = Integer.parseInt(n.nextLine());
        if (numIntr < 0){
          System.out.println("Recuerde que el número debe ser entero y positivo.");
        }
    } while (numIntr < 0);
    
    if( numIntr > 0){
      for (int i = 0; i < 100; i++){
        resultado += numIntr + i;
      }
      System.out.println("La suma de los 100 siguiente números del número introducido es de = " + resultado);
    }
  }
}
