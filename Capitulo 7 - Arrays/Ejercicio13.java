/**
* Escribe un programa que rellene un array de 100 elementos con números ente-
* ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
* el programa mostrará el array y preguntará si el usuario quiere destacar el
* máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
* el número destacado entre dobles asteriscos.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int[] cienEle = new int[100];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int respuesta;
    
    // Rellena 100 posiciones del array con numeros de 0 a 500
    for(int i = 0; i < cienEle.length; i++){
      cienEle[i] = ((int)(Math.random()* 501));
      if (cienEle[i] < min){
        min = cienEle[i];
      }
      
      if (cienEle[i] > max){
        max = cienEle[i];
      }
    }
    
    System.out.println("Los 100 números generados aleatoriamente de 0 a 500 son: ");
    for(int j = 0; j < cienEle.length; j++){
      System.out.printf("%7s %2d %6s %3d \n","Índice: ",j," Valor: ",cienEle[j]);  
    }
    
    System.out.println();
    System.out.println("Introduzca 1 para destacar el mínimo o 2 para destacar el máximo: ");
    respuesta = Integer.parseInt(n.nextLine());
    
    if(respuesta == 1){
      for(int j = 0; j < cienEle.length; j++){
        if( cienEle[j] == min){
          System.out.printf("%7s %2d %6s %3d %4s \n","Índice: ",j," Valor: ",cienEle[j]," MIN");
        } else {
          System.out.printf("%7s %2d %6s %3d \n","Índice: ",j," Valor: ",cienEle[j]);  
        }
        
      }
    }
    
    if(respuesta == 2){
      for(int j = 0; j < cienEle.length; j++){
        if( cienEle[j] == max){
          System.out.printf("%7s %2d %6s %3d %4s \n","Índice: ",j," Valor: ",cienEle[j]," MAX");
        } else {
          System.out.printf("%7s %2d %6s %3d \n","Índice: ",j," Valor: ",cienEle[j]);  
        }
        
      }
      
    }    
  }
}
