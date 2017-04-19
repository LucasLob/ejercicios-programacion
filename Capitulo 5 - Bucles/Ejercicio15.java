/**
* Escribe un programa que dados dos números, uno real (base) y un entero
* positivo (exponente), saque por pantalla todas las potencias con base el
* numero dado y exponentes entre uno y el exponente introducido. No se deben
* utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
* se deberán mostrar 2^1 , 2^2 , 2^3 , 2^4 y 2^5 .
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int base;
    int exponente;
    int potencia = 1;
    
    System.out.print("Introduzca un numero real que será la base: ");
    base = Integer.parseInt(n.nextLine());
    
    System.out.print("Introduzca un número entero que será el exponente: ");
    exponente = Integer.parseInt(n.nextLine());
       
    System.out.println("Sus potencias son: ");
    System.out.println("-------------------");
    
    for(int i = 1; i <= exponente; i++){
      potencia *= base;
      System.out.println(base + " elevado a " + i + " = " + potencia);
    
    }
    
  }
}
