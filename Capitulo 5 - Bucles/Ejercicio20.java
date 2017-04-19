/**
* Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio20 {
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
      for ( int l = 0 ; l <= i - 1; l++){
        if (l == 0 || l == i - 1){ //Se pintará el caracter siempre que empiece y finalice, asi se pintaran los bordes.
          System.out.print(caracter);
          
        } if (l != 0 || l != i - 1 ){ //Siempre que no sea el principio o el fin del bucle, se pintarán espacios, asi se rellenará la piramide.
            System.out.print(" ");
          } if (l != 0 || l != i - 1  && l > 2){ //Siempre que que no sea el principio ni el fin, y además el bucle vaya por un numero mayor que 2, se pintarán espacios, asi cuadrará la piramide simetricamente.
              System.out.print(" ");
          }
      }

      System.out.println();
      
    }
    
    for (int i = 0; i < tamano; i++){ // Cuando termine el bucle de arriba. Se pintará la base de la piramide imprimiendo caracteres tantas veces como el tamaño.
      System.out.print(caracter  + " ");
    }
    
      
  }
}
