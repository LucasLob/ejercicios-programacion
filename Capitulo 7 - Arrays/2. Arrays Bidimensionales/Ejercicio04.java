/**
* Modifica el programa anterior de tal forma que las sumas parciales y la suma
* total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
* que el ordenador se queda “pensando” antes de mostrar los números.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio04 {
  public static void main(String[] args)
  throws InterruptedException {
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
      
      Thread.sleep(1000);
      System.out.printf("| %4d",sumaFilas);
      System.out.println();
      Thread.sleep(1000);
    }
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    
    
    for(int i = 0; i < 5; i++){
      int sumaColumnas = 0;
      for(int j = 0; j < 4; j++){
        sumaColumnas += input[j][i];
      }
      Thread.sleep(1000);
      System.out.printf("%4d ",sumaColumnas);
      
    }


  }
}
