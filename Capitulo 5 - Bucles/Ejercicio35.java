/**
* Realiza un programa que pinte una X hecha de asteriscos. El programa debe
* pedir la altura. Se debe comprobar que la altura sea un número impar mayor
* o igual a 3, en caso contrario se debe mostrar un mensaje de error.
* @author Lucas Lobato Botelho
*/
 
import java.util.Scanner;
public class Ejercicio35 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
    
    boolean flag = false;
    int num_usuario;
    do {
      System.out.printf("Introduce la altura de la X: ");
      num_usuario = Integer.parseInt(System.console().readLine());
      if (((num_usuario % 2) == 0) || (num_usuario <= 3)) {
        flag = true;
        System.out.println("Error, Introduce un número mayor que 3 y que sea impar");
      }
    } while (flag);
    for (int i = 0; i < (num_usuario / 2); i++) {      //Parte de arriba de la X
      int j;
      for (j = 1; j <= i; j++) {
        System.out.printf(" ");
      }
      System.out.printf("*");
      for (int x = 1; x <= (num_usuario - i - 1 - j); x++) {
        System.out.printf(" ");
      }
      System.out.printf("*\n");
    }
    for (int i = 0; i < (num_usuario / 2); i++) {      //Parte central de la X
      System.out.printf(" ");
    }
    System.out.printf("*\n");
    for (int i = (num_usuario / 2); i > 0; i--) {      //Parte de abajo de la X
      int j;
      for (j = 1; j <= i - 1; j++) {
        System.out.printf(" ");
      }
      System.out.printf("*");
      for (int x = 1; x <= (num_usuario - i - j); x++) {
        System.out.printf(" ");
      }
      System.out.printf("*\n");
    }
  }
}
