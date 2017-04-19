/**
* Escribe un programa que muestre los n primeros términos de la serie de
* Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo
* es 1 y el resto se calcula sumando los dos anteriores,
* por lo que tendríamos quemlos términos son 
* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe 
* introducir por teclado.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    System.out.println("Introduzca un número positivo");
    System.out.println("-----------------------------");
    System.out.print("- Se mostrará la serie Fibonnaci tantas veces como el número introducido: ");

    int numIntr; // Se declara la variable en la que se guardará cuantas veces se va a repetir el bucle
    int numFibo1 = 0; // Se guarda el primer número de la serie Fibonacci.
    int numFibo2 = 1; // Se guarda el segundo número de la serie Fibonacci.
    int varTemp; // Se declara esta variable en la cual su valor va a ser "temporal" conforme se va incrementando el bucle.

    numIntr = Integer.parseInt(n.nextLine());

      for(int i = 1; i <= numIntr; i++){
        System.out.println(numFibo1);
        varTemp = numFibo1; // A principio del bucle valdrá 0.
        numFibo1 = numFibo2; // A principio del bucle valdrá 1.
        numFibo2 = varTemp + numFibo1; // El siguiente número será igual a la suma de los dos numeros anteriores.

      }
  }
}
