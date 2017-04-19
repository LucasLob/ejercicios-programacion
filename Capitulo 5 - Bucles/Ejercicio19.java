/**
* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
* pedir por teclado. El carácter con el que se pinta la pirámide también se debe
* pedir por teclado.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio19 {
  public static void main(String[] args) {
   Scanner n = new Scanner (System.in);
   System.out.print("Introduzca el tamaño de la piramide: ");
   int tamano = Integer.parseInt(n.nextLine());
   System.out.print("Introduzca el carácter a partir del cual se formará la piramide: ");
   String caracter = System.console().readLine();
    
    
    /* Repetirá lo que hay dentro tantas veces como valga 'tamano' y pega un
     * salto de línea al final*/
    for ( int i = 0; i <= tamano - 1 ; i++){

    /* Imprimirá tantos espacios como 'tamano' - 'i' (que se irá incrementando)
     * hasta que j valga 0 ( donde meterá 0 espacios) */
      for ( int j = tamano - i ; j > 0 ; j--){
        System.out.print(" ");
      }
    /* Imprimirá el caracter elegido hasta que l sea menor igual que 'i' */
      for ( int l = 0 ; l <= i; l++){
        System.out.print(" " + caracter);
      }

      System.out.println();
    }
  }
}
