/**
* Escribe un programa que permita ir introduciendo una serie indeterminada
* de números mientras su suma no supere el valor 10000. Cuando esto último
* ocurra, se debe mostrar el total acumulado, el contador de los números
* introducidos y la media.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio23 {
  public static void main(String[] args) {
   Scanner n = new Scanner (System.in);
   int numIntr;
   int contadorNumIntr = 0;
   int sumNum = 0;
   
   System.out.println("Vaya introduciendo números.");
   
   do {
     numIntr = Integer.parseInt(n.nextLine());
     sumNum += numIntr;
     contadorNumIntr++;     
    } while (sumNum <= 10000);
    
    System.out.println("El total acumulado es de: " + sumNum);
    System.out.println("La cantidad de números introducidos es de: " + contadorNumIntr);
    System.out.println("La media de los números es de: " + sumNum / contadorNumIntr);
  }
}
