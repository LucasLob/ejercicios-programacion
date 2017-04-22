/**
* Escribe un programa que muestre por pantalla un array de 10 números enteros
* generados al azar entre 0 y 100. A continuación, el programa debe pedir
* un número al usuario. Se debe comprobar que el número introducido por
* teclado se encuentra dentro del array, en caso contrario se mostrará un
* mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
* introduzca uno correctamente. A continuación, el programa rotará el array
* hacia la derecha las veces que haga falta hasta que el número introducido
* quede situado en la posición 0 del array. Por último, se mostrará el array rotado
* por pantalla.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int[] numeros = new int[10];
    
    for(int i = 0; i < numeros.length; i++){
      numeros[i] = (int)(Math.random()*101);
    }
    
     // Muestra el array original con sus valores almacenados
    for (int w = 0; w < numeros.length ; w++){
      if (w == 0){
        System.out.printf("%1s%4d","Indice|",w);
      } else {
        System.out.printf("%4d",w);
      }
    }
    
    System.out.println();
      
    for ( int q  = 0; q < numeros.length; q++){
      if(q == 0){
          System.out.printf("%1s%4d","Valor |",numeros[q]);
      } else {
          System.out.printf("%4d",numeros[q]);
      }
    }
    System.out.println();
    System.out.println();
    boolean inArray = false;
    int input;
    
    do {
      System.out.println("Introduzca uno de los números del array: ");
      input = Integer.parseInt(n.nextLine());
      
      for(int aux : numeros){
        if(aux == input){
          inArray = true;
        } 
      }
      
      if (!inArray){
        System.out.println("El número no se encuentra en el array :(");
      }
    } while (!inArray);
    
    while(numeros[0] != input){
      int aux = numeros[9];
      for(int i = 9; i > 0; i--){
        numeros[i] = numeros[i - 1];
      }
      numeros[0] = aux;
    }
    
    // Muestra el array original con sus valores almacenados
    for (int w = 0; w < numeros.length ; w++){
      if (w == 0){
        System.out.printf("%1s%4d","Indice|",w);
      } else {
        System.out.printf("%4d",w);
      }
    }
    
    System.out.println();
      
    for ( int q  = 0; q < numeros.length; q++){
      if(q == 0){
          System.out.printf("%1s%4d","Valor |",numeros[q]);
      } else {
          System.out.printf("%4d",numeros[q]);
      }
    }
    
  }
}
