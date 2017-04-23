/**
* Un restaurante nos ha encargado una aplicación para colocar a los clientes en
* sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
* (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
* el programa no está preparado para colocar a grupos mayores a 4, por tanto,
* si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
* mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
* personas como máximo e intente de nuevo”. Para el grupo que llega,
* se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
* libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
* grupo es de dos personas, se podrá colocar donde haya una o dos personas.
* Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
* vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
* Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
* funcionamiento del programa se ilustra a continuación:
* @author Lucas Lobato Botelho
*/
import java.util.Scanner;
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner n = new Scanner (System.in);
    int[] mesa = new int[10];
    int i;
    int j;
    System.out.println("Bienvenido a la pizzeria 'Comemucho', estas son las mesas disponibles: ");
    
    // Almacena las posiciones del aray con números aleatorios de 1 a 4
    for(i = 0; i < mesa.length; i++){
      mesa[i] = (int)(Math.random()* 4 + 1);
    }
    
    int personas;
    
    do {
        // Muestra el array original con sus valores almacenados
        for (int w = 0; w < mesa.length ; w++){
          if (w == 0){
            System.out.printf("%1s%1d","Mesa     | ",w+1);
          } else {
            System.out.printf("%4d",w+1);
          }
        }
        
        System.out.println();
          
        for ( int q  = 0; q < mesa.length; q++){
          if(q == 0){
              System.out.printf("%9s%1d","Ocupación| ",mesa[q]);
          } else {
              System.out.printf("%4s",mesa[q]);
          }
        }
        
      System.out.println();
      System.out.println();
      System.out.println("¿Cuántas personas sois? (1-4): ");
      System.out.println("Para terminar introduzca 0");
      personas = Integer.parseInt(n.nextLine());
      System.out.println();
    
      // Si el grupo de personas mayor que 4 se muestra un mensaje de error.
      if(personas > 4){
        System.out.println("Lo sentimos,solo se admiten grupos de 4 personas como máximo");
      } else { 
        int mesaVacia = 0;
        boolean estaVacia = false;
        
        // Verifica si hay alguna mesa vacia dento del array mesa
        for(i = 9; i > 0; i--){
          if(mesa[i] == 0){
            mesaVacia = i;
            estaVacia = true;
          }
        }
        
        if(estaVacia){
          mesa[mesaVacia] = personas;
          System.out.println("Siéntese en la mesa " + (mesaVacia + 1));
        } else {
          int mesaConHueco = 0;
          boolean hayHueco = false;
          for (j = 9 ; j > 0; j--){
            if (personas <= (4 - mesa[j])) {
              mesaConHueco = j;
              hayHueco = true;
            }
          }
          
          if (hayHueco){
            mesa[mesaConHueco] += personas;
            System.out.println("Sientese en la mesa " + (mesaConHueco + 1));
          } else {
            System.out.println("Lo sentimos, en estos momentos no tenemos mesas disponibles");
          }
        }
      }
    
    } while (personas > 0);
  }
}
