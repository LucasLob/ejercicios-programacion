/**
* Escribe un programa que obtenga los números enteros comprendidos entre
* dos números introducidos por teclado y validados como distintos, el programa
* debe empezar por el menor de los enteros introducidos e ir incrementando de
* 7 en 7.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int numIntr1;
    int numIntr2;
        
    // Se introducen dos números, y si son iguales el programa vuelve a pedir que los introduzca hasta que sean distintos.
    do {
    System.out.print("Introduzca un número entero: ");
    numIntr1 = Integer.parseInt(n.nextLine());
    System.out.print("Introduzca otro número entero distinto: ");
    numIntr2 = Integer.parseInt(n.nextLine());
    
      if (numIntr1 == numIntr2){
        System.out.println("Un poquito de por favor, los números no pueden ser iguales.");
        System.out.print("Introduzcalos otra vez: ");
      }
      
    } while (numIntr1 == numIntr2);
    
    // Si el número primero es mayor que el segundo, se cambian de posiciones.
    if (numIntr1 > numIntr2){
      int temp = numIntr1;
      numIntr1 = numIntr2;
      numIntr2 = temp;
    }
    
    System.out.println("Los números comprendidos entre los números introducidos de 7 en 7 son: ");
    //Se muestran los numeros sumandoles 7, y el rango va desde numIntr1 hasta numIntr2.
    for (int i = numIntr1; i <= numIntr2; i += 7){
      System.out.print( i + " ");
      
    }
  }
}
