/**
* Define un array de 12 números enteros con nombre num y asigna los valores
* según la tabla que se muestra a continuación. Muestra el contenido de todos
* los elementos del array. ¿Qué sucede con los valores de los elementos que no
* han sido inicializados?
*
* @author Lucas Lobato Botelho
*/
public class Ejercicio01 {
  public static void main(String[] args) {

  int[] num = new int[12];

  num[0] = 39;
  num[1] = -2;
  num[4] = 0;
  num[6] = 14;
  num[8] = 5;
  num[9] = 120;

      for (int j = 0; j < num.length ; j++){
        if (j == 0){
          System.out.printf("%5s %4d " , "Indice|" , j);
        } else {
        System.out.printf(" %4d " , j);
        }
      }
      
      System.out.println();
      
      for ( int i  = 0; i < num.length; i++){
        if(i == 0){
          System.out.printf("%5s %4d " , "Valor |" , num[i]);
        } else {
          System.out.printf(" %4d " , num[i]);
        }
      }
      
  }
}
  
