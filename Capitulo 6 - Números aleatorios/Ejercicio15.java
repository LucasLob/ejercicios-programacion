/**
* Realiza un generador de melodía con las siguientes condiciones:
* a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
* sol, la y si.
* b) Una melodía está formada por un número aleatorio de notas mayor o igual
* a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
* c) Cada grupo de 4 notas será un compás y estará separado del siguiente
* compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
* con dos barras.
* d) La última nota de la melodía debe coincidir con la primera.
* Ejemplo 1:
* do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
* Ejemplo 2:
* la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
*
* @author Lucas Lobato
*/


public class Ejercicio15 {

  public static void main(String[] args) {

    String primeraNota = "";
    int notas;
    String nombreNotas = "";
    int numeroDeCompases = (int)(Math.random()* 7 + 1);

    for (int i = 0; i < numeroDeCompases; i++){ //Genera los compases
      for (int j = 0; j < 4; j++) { // Genera un compás
        
        notas = (int)(Math.random()* 7 + 1); // Genera una nota
        switch (notas){
          case 1:
          nombreNotas = "do";
          break;

          case 2:
          nombreNotas = "re";
          break;

          case 3:
          nombreNotas = "mi";
          break;

          case 4:
          nombreNotas = "fa";
          break;

          case 5:
          nombreNotas = "sol";
          break;

          case 6:
          nombreNotas = "la";
          break;

          case 7:
          nombreNotas = "si";
          break;
          default:
        }

        if ((i == 0) && (j == 0)){
          primeraNota = nombreNotas;
        }

        if ((i == (numeroDeCompases - 1)) && (j ==3)) {
          nombreNotas = primeraNota;
        }

        System.out.print(" " + nombreNotas);

    }
    System.out.print(" |");
  }
  System.out.print("| ");
}
}
