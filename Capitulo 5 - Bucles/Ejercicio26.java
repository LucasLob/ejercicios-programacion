/**
* Realiza un programa que pida primero un número y a continuación un dígito.
* El programa nos debe dar la posición (o posiciones) contando de izquierda a
* derecha que ocupa ese dígito en el número introducido.
* 
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio26 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
        
    System.out.print("Introduzca un número: ");
    int numIntr = Integer.parseInt(n.nextLine());

    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(n.nextLine());

    System.out.println("El numero " + digito + " ocupa en " + numIntr + " las posiciones: ");
    
    int numero = numIntr;
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }
        

    while (volteado > 0) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;
      posicion++;
    }

    System.out.println();
  }
}
