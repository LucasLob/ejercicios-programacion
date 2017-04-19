/**
* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio22 {
  public static void main(String[] args) {
   Scanner n = new Scanner (System.in);
   
  boolean esPrimo = true;
    
    System.out.println("Este programa mostrará los números primos entre 2 y 100: ");
    
    for (int i = 2; i < 101; i++){
      
      esPrimo = true;
      for (int j = 2; j < i; j++){
        if(i % j == 0){
          esPrimo = false;
        }
      }
      
      if (esPrimo){
        System.out.println("El número " + i + " es primo");
      }
    }
  }
}
