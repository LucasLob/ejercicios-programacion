/**
* Define un array de números enteros de 3 filas por 6 columnas con nombre num
* y asigna los valores según la siguiente tabla. Muestra el contenido de todos
* los elementos del array dispuestos en forma de tabla como se muestra en la
* figura.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio01 {
  public static void main(String[] args) {
      Scanner n = new Scanner (System.in);
      int[][] num = new int[3][6];
      num[0][0] = 0;
      num[1][0] = 75;
      num[0][1] = 30;
      num[0][2] = 2;
      num[2][2] = -2;
      num[2][3] = 9;
      num[1][4] = 0;
      num[0][5] = 5;
      num[2][5] = 11;
      String verde = "\u001B[32m";
      String blanco = "\u001B[37m";
    
      System.out.println(verde + "----------------------------------------------------------------------------" + blanco);
      for(int i = 0; i < 6; i++){
        if (i == 0){
        System.out.printf("%1s%8s%1d| ", "Array num| ","Columna ",i);
        } else {
          System.out.printf("%8s%1d| ", "Columna ",i);
        }
      }
      
      System.out.println();
      System.out.println(verde + "----------------------------------------------------------------------------" + blanco);
    
      for(int i = 0; i < 3; i++ ){
        System.out.printf(" %1s%1d  |","Fila ",i);
        for(int j = 0; j < 6; j++){
          System.out.printf("%8d  |",num[i][j]);
        }
        System.out.println();
        System.out.println(verde + "----------------------------------------------------------------------------" + blanco);
      }
      
    }
  }
