/**
* Escribe un programa que, dado un número entero, diga cuáles son y cuánto
* suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
* izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
* números largos.
* Ejemplo 1:
* Por favor, introduzca un número entero positivo: 94026782
* Dígitos pares: 4 0 2 6 8 2
* Suma de los dígitos pares: 22
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio32 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
  int numDigitos = 0;
  int suma = 0;
  
  System.out.print("Introduzca un número entero: ");
  long numIntr = Long.parseLong(n.nextLine());
  
    System.out.print("Los números pares son: ");
    
    while (numIntr > 0){
      
      if ((numIntr % 10) % 2 == 0){
        System.out.print(numIntr % 10 + " ");
        suma += numIntr % 10;
      }
      
      numIntr -= numIntr % 10;
      numIntr /= 10;
    }
    System.out.println();
    System.out.print("La suma de los dígitos pares es de : " + suma);
  }
}
