/*  Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
    Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 *  @author Lucas Lobato
 */


import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args) {
    System.out.println("__________________________________________");
    System.out.print("\nIntroduzca un número: ");
    
    Scanner n = new Scanner(System.in);
    
    int numero = Integer.parseInt(n.nextLine());
    int numCopia = numero; 
    int contador = 0;
    int posicion = 0; 
    
    while (numero > 0) { 
      numero /= 10;
      contador++;
    }
    
    posicion = (int)(Math.random()*contador) + 1;
    
    for (int i = 1; i < posicion; i++) {
      numCopia /= 10;
    }
    
    System.out.println("\n" + numCopia % 10);
    
  }
}
