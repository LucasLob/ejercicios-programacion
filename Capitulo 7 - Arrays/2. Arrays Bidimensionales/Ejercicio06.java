/**
* Modifica el programa anterior de tal forma que no se repita ningún número en
* el array.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio06 {
  public static void main(String[] args){
    Scanner n = new Scanner (System.in);
    int[][] input = new int[6][10];
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int filaMin = 0;
    int colMin = 0;
    int filaMax = 0;
    int colMax = 0;
    boolean esRepetido;
    
    String verde = "\u001B[32m";
    String blanco = "\u001B[37m";
    
    for(int fila = 0; fila < 6; fila++){
      for(int columna = 0; columna < 10; columna++){
        do{
          esRepetido = false;
          input[fila][columna] = (int)(Math.random()*1001);
          for (int i = 0; i < 10 * fila + columna; i++) {
            if (input[fila][columna] == input[i / 10][i % 10]) {
              esRepetido = true;
            }
          }
        } while (esRepetido);
        
        if ((input[fila][columna]) < min){
          min = input[fila][columna];
          filaMin = fila;
          colMin = columna;
        }
        
        if ((input[fila][columna]) > max){
          max = input[fila][columna];
          filaMax = fila;
          colMax = columna;
        }
      }
    }
    
    System.out.println(verde + "--------------------------------------------------------------------" + blanco);
      for(int i = 0; i < 10; i++){
        if (i == 0){
        System.out.printf("%5s%5d|","Columna|",i);
        } else {
          System.out.printf("%5d|",i);
        }
      }
      
      System.out.println();
      System.out.println(verde + "--------------------------------------------------------------------" + blanco);
    
      for(int i = 0; i < 6; i++ ){
        System.out.printf("%1s%1d |","Fila ",i);
        for(int j = 0; j < 10; j++){
          System.out.printf("%4d |",input[i][j]);
        }
        System.out.println();
        System.out.println(verde + "--------------------------------------------------------------------" + blanco);
      }
      
    
    System.out.println();
    System.out.println("-> El máximo es " + max + " y se encuentra en la fila " + filaMax + " columna " + colMax + "." );
    System.out.println("-> El máximo es " + min + " y se encuentra en la fila " + filaMin + " columna " + colMin + "." );    
  }
}
