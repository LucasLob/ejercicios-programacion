/**
* Escribe un programa que lea 15 números por teclado y que los almacene en un
* array. Rota los elementos de ese array, es decir, el elemento de la posición 0
* debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
* la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
* del array.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio06 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
  int[] arrayInput = new int[15];
  
  
    System.out.println("Introduzca 15 números: ");
  
    for(int i = 0 ; i < arrayInput.length; i++){
      arrayInput[i] = Integer.parseInt(n.nextLine());
    }
    
    System.out.println();
    System.out.println("El array se ha almacenado de la siguiente forma: ");
    
    for (int j = 0; j < arrayInput.length ; j++){
        if (j == 0){
          System.out.printf("%5s %2d " , "Indice|" , j);
        } else {
        System.out.printf(" %2d " , j);
        }
      }
    
    System.out.println();
      
    for ( int x  = 0; x < arrayInput.length; x++){
      if(x == 0){
          System.out.printf("%5s %2d " , "Valor |" , arrayInput[x]);
      } else {
          System.out.printf(" %2d " , arrayInput[x]);
      }
    }
    
    int ultNum = arrayInput[14];
    
    for(int z = 14; z > 0  ; z--){
      arrayInput[z] = arrayInput[z - 1];
    }
    
    arrayInput[0] = ultNum;
    
    
    System.out.println();
    System.out.println("-----------------------------------------------------");
    System.out.println();
    System.out.println("El array rotado queda de la siguiente forma: ");
    
    for (int w = 0; w < arrayInput.length ; w++){
        if (w == 0){
          System.out.printf("%5s %2d " , "Indice|" , w);
        } else {
        System.out.printf(" %2d " , w);
        }
      }
    
    System.out.println();
      
    for ( int q  = 0; q < arrayInput.length; q++){
      if(q == 0){
          System.out.printf("%5s %2d " , "Valor |" , arrayInput[q]);
      } else {
          System.out.printf(" %2d " , arrayInput[q]);
      }
    }
  }
}
