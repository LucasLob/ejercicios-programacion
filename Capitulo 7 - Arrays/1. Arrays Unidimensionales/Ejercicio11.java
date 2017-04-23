/**
* Realiza un programa que pida 10 números por teclado y que los almacene en
* un array. A continuación se mostrará el contenido de ese array junto al índice
* (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
* primos a las primeras posiciones, desplazando el resto de números (los que
* no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
* el array resultante.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    
    int[] almacenInput = new int[10];
    int[] almacenPrimos = new int[10];
    int[] almacenNoPrimos = new int[10];
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    int i;
    int j;
    
    // Almacena los números recogidos por teclado en el array.
    System.out.println("Introduzca 10 números: ");
    for(i = 0; i < almacenInput.length; i++){
      almacenInput[i] = Integer.parseInt(n.nextLine());
      esPrimo = true;
      for(j = 2; j < almacenInput[i]; j++){
        if(almacenInput[i] % j == 0){
          esPrimo = false;
        }
      }
      
      if (esPrimo){
        almacenPrimos[primos++] = almacenInput[i];
      } else {
        almacenNoPrimos[noPrimos++] = almacenInput[i];
      }
    }
    
     
    
    // Muestra el array original con sus valores almacenados
    for (int w = 0; w < almacenInput.length ; w++){
      if (w == 0){
        System.out.printf("%5s%4d" , "Indice|" , w);
      } else {
        System.out.printf("%4d" , w);
      }
    }
    
    System.out.println();
      
    for ( int q  = 0; q < almacenInput.length; q++){
      if(q == 0){
          System.out.printf("%5s%4d" , "Valor |" , almacenInput[q]);
      } else {
          System.out.printf("%4d" , almacenInput[q]);
      }
    }
    
    // Los números primos se menten en las primeras
    // posiciones del array original.
    for (i = 0; i < primos; i++) {
      almacenInput[i] = almacenPrimos[i];
    }
    
    // Los números que no son primos se colocan al final.
    for (i = primos; i < primos + noPrimos; i++) {
      almacenInput[i] = almacenNoPrimos[i - primos];
    }
    
    System.out.println();
    System.out.println();
    
    // Muestra el array original con los numeros primos al principio.
    for (int w = 0; w < almacenInput.length ; w++){
      if (w == 0){
        System.out.printf("%5s%4d" , "Indice|" , w);
      } else {
        System.out.printf("%4d" , w);
      }
    }
    
    System.out.println();
      
    for ( int q  = 0; q < almacenInput.length; q++){
      if(q == 0){
          System.out.printf("%5s%4d" , "Valor |" , almacenInput[q]);
      } else {
          System.out.printf("%4d" , almacenInput[q]);
      }
    }
  }
}
