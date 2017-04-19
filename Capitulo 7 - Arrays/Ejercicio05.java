/**
* Escribe un programa que pida 10 números por teclado y que luego muestre
* los números introducidos junto con las palabras “máximo” y “mínimo” al lado
* del máximo y del mínimo respectivamente.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio05 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);

    // Creación del Array y de las variables para la comparación del máximo y minimo;
    int[] arrayNumIntr = new int[10];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    System.out.println("Introduzca 10 números por teclado y se mostrará el máximo y el mínimo:");
    
    // Asignación de los valores dentro del array 'numero'.
    for(int i = 0; i < arrayNumIntr.length; i++){
      arrayNumIntr[i] = Integer.parseInt(n.nextLine());
      
      if (arrayNumIntr[i] < min){
        min = arrayNumIntr[i];
      }
      
      if (arrayNumIntr[i] > max){
        max = arrayNumIntr[i];
      }
    }
    
    System.out.println();
    System.out.println("Los números introducidos y el máximo y mínimo son: ");
    System.out.println("---------------------------------------------------");
    
    // Monstraje de los números y del máximo y minimo.
    for(int j = 0; j < arrayNumIntr.length;j++){
      System.out.print(arrayNumIntr[j]);
      
      if (arrayNumIntr[j] == min){
        System.out.print(" (MÍNIMO) ");
      }
      
      if (arrayNumIntr[j] == max){
        System.out.print(" (MÁXIMO) ");
      }
      System.out.println();
    }
    
   
  }
}
