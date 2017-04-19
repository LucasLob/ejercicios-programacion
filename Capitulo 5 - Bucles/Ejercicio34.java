/**
* Escribe un programa que pida dos números por teclado y que luego mezcle en
* dos números diferentes los dígitos pares y los impares. Se van comprobando
* los dígitos de la siguiente manera: primer dígito del primer número, primer
* dígito del segundo número, segundo dígito del primer número, segundo
* dígito del segundo número, tercer dígito del primer número... Para facilitar
* el ejercicio, podemos suponer que el usuario introducirá dos números de la
* misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
* long en lugar de int donde sea necesario para admitir números largos.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio34 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
  
    System.out.print("\nPor favor, introduce un número: ");
    long numero1 = Long.parseLong(n.nextLine());
    
    System.out.print("\nPor favor, introduce otro número: ");
    long numero2 = Long.parseLong(n.nextLine());
    
    int contador = 0; //llevará la cuenta del número de repeticiones
    
    long volteado1 = 0; //damos la vuelta al primer número
    while (numero1 > 0) {  
      volteado1 = (volteado1 * 10) + (numero1 % 10);
      numero1 /= 10;
      contador++;
    }  
    
    
    long volteado2 = 0; //damos la vuelta al segundo número
    while (numero2 > 0) {  
      volteado2 = (volteado2 * 10) + (numero2 % 10);
      numero2 /= 10;
    }
    
    
    int cuenta = 0;
    int numeroPar = 0;
    int numeroImpar = 0;
    int digito = 1; //llevará la cuenta por el dígito que vamos
      
  
    do {
        
       //introduce el dígito del primer número
        cuenta = (int)(volteado1 % 10);
        if ((cuenta % 2) == 0) {
          numeroPar = numeroPar * 10;
          numeroPar += cuenta;
        } else {
          numeroImpar = numeroImpar * 10;
          numeroImpar += cuenta;
        }
              
      volteado1 /=10;
      
       //introduce el dígito del segundo número
        cuenta = (int)(volteado2 % 10);
        if ((cuenta % 2) == 0) {
          numeroPar *= 10;
          numeroPar += cuenta;
        } else {
          numeroImpar *= 10;
          numeroImpar += cuenta;
        }
        
           
      volteado2 /= 10;
      
      digito++;
    } while (digito <= contador);
   
   System.out.println("\n__________________________________");
   System.out.print("El número formado por los dígitos pares es: " + numeroPar);
   System.out.print("\nEl número formado por los dígitos impares es: " + numeroImpar);
    
  }
}
