/**
* Escribe un programa que lea una lista de diez números y determine cuántos
* son positivos, y cuántos son negativos.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int numIntr;
    
    System.out.println("Introduzca 10 números y te diré si son negativos o positivos: ");
    
    for(int i = 0; i < 10; i++){
      numIntr = Integer.parseInt(n.nextLine());
      if (numIntr == 0){
        System.out.println("El número introducido : " + numIntr + " es considerado neutro.");
      } else if (numIntr > 0){
        System.out.println("El número introducido : " + numIntr + " es positivo.");
      } else {
        System.out.println("El número introducido : " + numIntr + " es negativo.");
      }
    }

  }
}
