/**
* Realiza un programa que pida la temperatura media que ha hecho en cada mes
* de un determinado año y que muestre a continuación un diagrama de barras
* horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
* de asteriscos o cualquier otro carácter.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int[] temperatura = new int[12];
    String[] mes = {
      "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
      "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    
    System.out.println("Introduzca la temperatura media en cada mes: ");
    for(int i = 0; i < temperatura.length; i++){
      temperatura[i] = Integer.parseInt(n.nextLine());      
    }
    
    for(int k = 0; k < temperatura.length; k++){
      System.out.printf("%10s ", mes[k]);
      for(int o = 0; o < temperatura[k]; o++){
        System.out.print("|");
      }
      System.out.println();
    }
  }
}
