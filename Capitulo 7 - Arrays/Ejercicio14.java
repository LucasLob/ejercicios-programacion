/**
* Escribe un programa que pida 8 palabras y las almacene en un array. A
* continuación, las palabras correspondientes a colores se deben almacenar al
* comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
* auxiliares como quieras. Los colores que conoce el programa deben estar en
* otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
* blanco y morado.
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    
    String[] color = { "verde","rojo","azul","amarillo","naranja","rosa",
    "negro", "blanco","morado" };
    String[] input = new String[8];
    String[] arrayFinal = new String[8];
    int i;
    int j;
    int contadorColor = 0;
    
    /* Recibe las palabras por teclado, las almacena en el array "palabraInput"
     * Y luego verifica si una palabra individual está dentro del array "color"
     * y si es asi, la almacena en el "arrayFinal".
     */
    System.out.println("Por favor, introduzca 8 palabras: ");
    for(i = 0; i < input.length; i++){
      input[i] = n.nextLine();
        for ( String cor : color){
          if (input[i].equals(cor)){
            arrayFinal[contadorColor++] = cor;
          }
        }
    }
    
    
    /* Mediante un boolean verifica si una palabra es color o no, y si no es
     * color, se almacena al final del "arrayFinal".
     */
    for (j = 0; j < arrayFinal.length; j++) {
      boolean esColor = false;
      for (String cor : color) {
        if (input[j].equals(cor)) {
          esColor = true;
        }
      }
      if (!esColor) {
        arrayFinal[contadorColor++] = input[j];
      }
    }
    
    System.out.println();
    System.out.println("Array original: ");
    // Muestra el array original con sus valores almacenados
    for (int w = 0; w < input.length ; w++){
      if (w == 0){
        System.out.printf("%1s%9d","Indice|",w);
      } else {
        System.out.printf("%9d",w);
      }
    }
    
    System.out.println();
      
    for ( int q  = 0; q < input.length; q++){
      if(q == 0){
          System.out.printf("%1s%9s","Valor |",input[q]);
      } else {
          System.out.printf("%9s",input[q]);
      }
    }
    
    System.out.print("-----------------------------------------------------");
    System.out.println("----------------------------");
    System.out.println();
    System.out.println("Array final: ");
    
    for (int w = 0; w < arrayFinal.length ; w++){
      if (w == 0){
        System.out.printf("%1s%9d","Indice|",w);
      } else {
        System.out.printf("%9d",w);
      }
    }
    
    System.out.println();
      
    for ( int q  = 0; q < arrayFinal.length; q++){
      if(q == 0){
          System.out.printf("%1s%9s","Valor |",arrayFinal[q]);
      } else {
          System.out.printf("%9s",arrayFinal[q]);
      }
    }   
  }
}
