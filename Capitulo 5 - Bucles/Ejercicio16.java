/**
* Escribe un programa que diga si un número introducido por teclado es o no
* primo. Un número primo es aquel que sólo es divisible entre él mismo y la
* unidad.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    
    int numIntr;
    boolean esPrimo = true;
    
    System.out.print("Introduzca un número y el programa dirá si es primo o no: ");
    numIntr = Integer.parseInt(n.nextLine());
    
    for (int i = 2; i < numIntr; i++){
      if (numIntr % i == 0){
        esPrimo = false;
      }
    }
    
    if (esPrimo){
      System.out.println("El número introducido es primo.");
    } else {
        System.out.println("El número introducido no es primo");
      }
  }   
}
