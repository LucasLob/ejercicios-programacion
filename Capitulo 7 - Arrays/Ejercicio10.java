/**
* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
* y que los almacene en un array. El programa debe ser capaz de pasar todos
* los números pares a las primeras posiciones del array (del 0 en adelante) y
* todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
* es necesario.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int[] almacenRandom = new int[20];
    int[] almacenPar = new int[20];
    int[] almacenImpar = new int[20];
    int numPares = 0;
    int numImpares = 0;
    
    System.out.print("El programa generará un array con números aleatorios y"); 
    System.out.print(" después colocará los números pares en las primeras");
    System.out.println(" posiciones y los impares en las posiciones restantes");
    System.out.println();
        
    /*Almacena los valores aleatorios dentro del array y los impares y pares en
     arrays diferentes.*/
     
    for(int o = 0; o < almacenRandom.length; o++){
      almacenRandom[o] = (int)(Math.random()* 101);
      if (almacenRandom[o] % 2 == 0){
        almacenPar[numPares++] = almacenRandom[o];
      } else {
        almacenImpar[numImpares++] = almacenRandom[o];
        }
    }
    
    // Muestra el array original con sus valores almacenados
    for (int w = 0; w < almacenRandom.length ; w++){
        if (w == 0){
          System.out.printf("%5s%4d" , "Indice|" , w);
        } else {
        System.out.printf("%4d" , w);
        }
      }
    
    System.out.println();
      
    for ( int q  = 0; q < almacenRandom.length; q++){
      if(q == 0){
          System.out.printf("%5s%4d" , "Valor |" , almacenRandom[q]);
      } else {
          System.out.printf("%4d" , almacenRandom[q]);
      }
    }
    
    // Mete los numeros pares en las primeras posiciones.
    for (int l = 0; l < numPares; l++){
      almacenRandom[l] = almacenPar[l];
    }
    
    // Mete los numeros impares en las posiciones restantes.
    for(int p = numPares; p < almacenRandom.length; p++){
      almacenRandom[p] = almacenImpar[p - numPares];
    }
    
    
    // Muestra el array después de las modificaciones.
    System.out.println();
    System.out.println();
    for (int w = 0; w < almacenRandom.length ; w++){
        if (w == 0){
          System.out.printf("%5s%4d" , "Indice|" , w);
        } else {
        System.out.printf("%4d" , w);
        }
      }
    
    System.out.println();
      
    for ( int q  = 0; q < almacenRandom.length; q++){
      if(q == 0){
          System.out.printf("%5s%4d" , "Valor |" , almacenRandom[q]);
      } else {
          System.out.printf("%4d" , almacenRandom[q]);
      }
    }
  
  }
}
