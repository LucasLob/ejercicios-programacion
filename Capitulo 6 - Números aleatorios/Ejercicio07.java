/**
* Escribe un programa que muestre tres apuestas de la quiniela en tres colum-
* nas para los 14 partidos y el pleno al quince (15 filas).
* 
* OBS: Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50
* OBS4: Lo que diferencia entre filas y columnas es si tiene salto de linea o no. Filas = Salto de linea. Columnas = No tiene salto de linea
**/

public class Ejercicio07 {
  public static void main(String[] args){    
    
    System.out.println("Este programa genera el resultado de 3 columnas de la quiniela");
    int numeroGenerado;
    int columnas = 3;
    int numeroFila = 1;

    do {                                                      //El Do While imprime las 15 filas
      System.out.printf("%2d. ", numeroFila);                 //Formateando el numero de las filas para salir alineados y con un punto (.)
      numeroFila ++;
      
      for(int apuesta = 1; apuesta <= columnas ; apuesta++){  //En el for las apuestas se repiten tantas veces como columnas haya.
        numeroGenerado = (int)(Math.random() * 3 + 1);        //Y dependiendo de qué numero aletorio haya sido generado 
                                                              // Imprime por pantalla un 1, x o 2
        switch (numeroGenerado) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print(" x |");
            break;
          case 3:
            System.out.print("  2|");
          default:
        }
      }
    System.out.println();
    if (numeroFila == 15){
      columnas = 1;
    }
    } while (numeroFila <= 15);
  }
}
