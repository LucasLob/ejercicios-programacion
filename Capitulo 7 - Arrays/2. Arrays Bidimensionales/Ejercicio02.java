/**
* Escribe un programa que pida 20 números enteros. Estos números se deben
* introducir en un array de 4 filas por 5 columnas. El programa mostrará las
* sumas parciales de filas y columnas igual que si de una hoja de cálculo se
* tratara. La suma total debe aparecer en la esquina inferior derecha.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio02 {
  public static void main(String[] args) {
      Scanner n = new Scanner (System.in);
      int[][] input = new int[4][5];
      
      System.out.println("Introduzca 20 números enteros que se almacenarán en un array.");
      for(int i = 0; i < 4; i++){
        for(int j = 0; j < 5; j++){
          System.out.print("Valor de Fila " + i + " columna " + j + ": ");
          input[i][j] = Integer.parseInt(n.nextLine());
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
