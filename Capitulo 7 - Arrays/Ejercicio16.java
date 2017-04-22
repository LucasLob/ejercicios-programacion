/**
* Escribe un programa que rellene un array de 20 elementos con números ente-
* ros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
* el programa mostrará el array y preguntará si el usuario quiere resaltar los
* múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
* array escribiendo los números que se quieren resaltar entre corchetes.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int[] aRandom = new int[20];
    
    for(int i = 0; i < aRandom.length; i++){
      aRandom[i] = (int)(Math.random()* 401);
    }
    
    // Muestra el array original con sus valores almacenados
    for(int j = 0; j < aRandom.length; j++){
      System.out.printf("%1s%2d %1s%3d\n", "|Indice: ",j,"|Valor: ",aRandom[j]);
    }
    
    int input;
    do {
      System.out.println();
      System.out.println("¿Desea resaltar los múltiplos de 5 o los múltiplos de 7?");
      System.out.println("Teclee (1) para los múltiplos de 5");
      System.out.println("Teclee (2) para los múltiplos de 7");
      input = Integer.parseInt(n.nextLine());
      
      System.out.println();
      if(input == 1){
        System.out.println("Los múltiplos de 5 son: ");
        for(int k = 0; k < 19; k++){
          if(aRandom[k] % 5 == 0){
            System.out.print(aRandom[k] + " ");
          }
        }
      }
      
      if(input == 2){
        System.out.println("Los múltiplos de 7 son: ");
        for(int k = 0; k < aRandom.length; k++){
          if(aRandom[k] % 7 == 0){
            System.out.print(aRandom[k] + " ");
          }
        }
      }
      
      if((input > 2) || (input == 0)){
        System.out.println("El número introducido debe ser 1 o 2");
      }
    } while ((input > 2) || (input <= 0));
    
  }
}
