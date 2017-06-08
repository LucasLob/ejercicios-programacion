/**
* Realiza un programa que pida 8 números enteros y que luego muestre esos
* números junto con la palabra “par” o “impar” según proceda.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    
    int[] almacenInput = new int[8];
    
    System.out.println("Introduzca 8 números y el programa dirá si son par o impar: ");
    for(int i = 0; i < almacenInput.length; i++){
      almacenInput[i] = Integer.parseInt(n.nextLine());
    }
    
    System.out.println();
    for(int k = 0; k < almacenInput.length; k++){
      if(almacenInput[k] % 2 == 0){
        System.out.println(almacenInput[k] + " es par");
      } else {
        System.out.println(almacenInput[k] + " es impar");
      }
    }
  }
}
