/**
* Realiza un programa que vaya pidiendo números hasta que se introduzca un
* numero negativo y nos diga cuantos números se han introducido, la media de
* los impares y el mayor de los pares. El número negativo sólo se utiliza para
* indicar el final de la introducción de datos pero no se incluye en el cómputo.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio21 {
  public static void main(String[] args) {
   Scanner n = new Scanner (System.in);
   int contador = 0;
   int numIntr;
   int numPar = 0;
   int numImpar = 0;
   int contadorPares = 0;
   int maxImpar = 0;
   
   System.out.print("Introduzca números : ");
   
   do {
     numIntr = Integer.parseInt(n.nextLine());
     if (numIntr >= 0){
       contador++;
       
       if (numIntr % 2 == 0){
         numPar += numIntr;
         contadorPares++;
       }
       
       if (numIntr > maxImpar && numIntr % 2 != 0){
         maxImpar = numIntr;
       }
    }
      
   } while (numIntr >= 0);
   
   System.out.println("--------------------------------------------");
   System.out.println("La cantidad de números introducidos es de: " + contador);
   System.out.println("La media de los números pares es de : " + (numPar / contadorPares));
   System.out.println("El mayor de los números impares es : " + maxImpar); 
  }
}
