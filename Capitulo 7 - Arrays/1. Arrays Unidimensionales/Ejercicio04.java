/**
* Define tres arrays de 20 números enteros cada una, con nombres numero ,
* cuadrado y cubo . Carga el array numero con valores aleatorios entre 0 y 100. En el
* array cuadrado se deben almacenar los cuadrados de los valores que hay en el
* array numero . En el array cubo se deben almacenar los cubos de los valores que
* hay en numero . A continuación, muestra el contenido de los tres arrays dispuesto
* en tres columnas.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio04 {
  public static void main(String[] args) {
  Scanner n = new Scanner (System.in);
  
  int[] numero  = new int[20];
  int[] cuadrado  = new int[20];
  int[] cubo  = new int[20];
  
    for(int i = 0; i < numero.length; i++){
      numero[i] = ((int)(Math.random()* 101));
    }
  
    for(int k = 0; k < cuadrado.length; k++){
      cuadrado[k] = numero[k] * numero[k];
    }
    
    for(int z = 0; z < cubo.length; z++){
      cubo[z] = numero[z] * numero[z] * numero[z];
    }
    
    System.out.print("El programa mostrará 20 números en una columna");
    System.out.print(" seguidos de los cuadrados y cubosde dichos numeros");
    System.out.println(" en otras dos columnas: ");
    for(int o = 0; o < numero.length; o++){
      if(o == 0){
        System.out.println();
        System.out.printf("%1s %10s %6s \n", "Numero", "Cuadrado", "Cubo");
        System.out.println("--------------------------");
        System.out.printf("%4d %10d %8d \n" , numero[o], cuadrado[o], cubo[o]);
      }
      System.out.printf("%4d %10d %8d \n" , numero[o], cuadrado[o], cubo[o]);
    }
    
    
  }
}
