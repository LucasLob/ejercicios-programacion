/**
* Realiza un programa que nos diga cuántos dígitos tiene un número 
* introducido por teclado.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int numeroIntroducido;
    int digitos = 1;
    
  
    System.out.print("Introduce un número entero y te diré de cuántos digitos se compone: ");
    numeroIntroducido = Integer.parseInt(n.nextLine());
    
    while (numeroIntroducido > 9){
      numeroIntroducido /= 10;
      digitos++;
    }
    
    System.out.println("Su número se compone de " + digitos + " dígitos");
    
    
    
    
  }
}
