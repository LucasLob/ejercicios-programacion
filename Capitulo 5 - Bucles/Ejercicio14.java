/**
* Escribe un programa que pida una base y un exponente (entero positivo) y
* que calcule la potencia.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int base;
    int exponente;
    
    
    System.out.print("Introduce una base: ");
    base = Integer.parseInt(n.nextLine());
    
    System.out.print("Introduce un exponente entero positivo: ");
    exponente = Integer.parseInt(n.nextLine());
    
    int potencia = 1;
    

    for(int i = 0; i < exponente; i++){
      potencia *= base;
      
    }
    
     
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }
    
    System.out.println("La potencia del número es: " + potencia);
   
  }
}
