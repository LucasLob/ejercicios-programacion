/**
* Escribe un programa que calcule la media de un conjunto de números positivos
* introducidos por teclado. A priori, el programa no sabe cuántos números se
* introducirán. El usuario indicará que ha terminado de introducir los datos
* cuando meta un número negativo.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    System.out.println("Introduzca números positivos y le devolveré la media de ellos: ");
    int numeroIntroducido = 0;
    int numerosIntroducidos = 0;
    int numeroFinal = 0;
    
   
      do {
        numeroIntroducido = Integer.parseInt(n.nextLine());
        numerosIntroducidos++;
        numeroFinal += numeroIntroducido;
      } while (numeroIntroducido >= 0);
      
      System.out.println("La media de los números introducidos es de : " + (numeroFinal - numeroIntroducido) / (numerosIntroducidos - 1 ));
  }
}
