/**
* Modifica el programa anterior de tal forma que los números que se introducen
* en el array se generen de forma aleatoria (valores entre 100 y 999).
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio03 {
  public static void main(String[] args) {
      Scanner n = new Scanner (System.in);
      int[][] input = new int[4][5];
      
      System.out.println("Se generará un array de 20 posiciones con valores generados aleatoriamente de entre 100 y 999");
      for(int i = 0; i < 4; i++){
        for(int j = 0; j < 5; j++){
          input[i][j] = (int)(Math.random()* 900 + 100);
        }
      }
      
      System.out.println();

      for(int j = 0; j < 4; j++){
        int sumaFilas = 0;
        for(int k = 0; k < 5; k++){
          System.out.printf("%4d ", input[j][k]);
          sumaFilas += input[j][k];
        }
        
        System.out.printf("| %4d",sumaFilas);
        System.out.println();
      }
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      
      
      for(int i = 0; i < 5; i++){
        int sumaColumnas = 0;
        for(int j = 0; j < 4; j++){
          sumaColumnas += input[j][i];
        }
        System.out.printf("%4d ",sumaColumnas);
      }


    }
  }
