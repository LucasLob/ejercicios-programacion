/**
* Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
* sustituir el color blanco por colores más alegres. Realiza un programa que
* genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
* cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
* que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
* violeta y naranja.
*
* @author Lucas Lobato 
*/
public class Ejercicio18{
  public static void main(String[] args) {
    do {
    int numeroAleatorio1 = (int)(Math.random() * 6 + 1);
    int numeroAleatorio2 = (int)(Math.random() * 6 + 1);
    int numeroAleatorio3 = (int)(Math.random() * 6 + 1);
  } while ((numeroAleatorio1 == numeroAleatorio2) || (numeroAleatorio1 == numeroAleatorio3) || (numeroAleatorio2 == numeroAleatorio3));

    String color1 = "";
    String color2 = "";
    String color3 = "";

    switch (numeroAleatorio1){
      case 1:
        color1 = "rojo";
        break;
      case 2:
        color1 = "azul";
        break;
      case 3:
        color1 = "verde";
        break;
      case 4:
        color1 = "amarillo";
        break;
      case 5:
        color1 = "violeta";
        break;
      case 6:
        color1 = "naranja";
        break;
      default:
    }
    
    switch (numeroAleatorio2){
      case 1:
        color2 = "rojo";
        break;
      case 2:
        color2 = "azul";
        break;
      case 3:
        color2 = "verde";
        break;
      case 4:
        color2 = "amarillo";
        break;
      case 5:
        color2 = "violeta";
        break;
      case 6:
        color2 = "naranja";
        break;
      default:
    }

    switch (numeroAleatorio3){
      case 1:
        color3 = "rojo";
        break;
      case 2:
        color3 = "azul";
        break;
      case 3:
        color3 = "verde";
        break;
      case 4:
        color3 = "amarillo";
        break;
      case 5:
        color3 = "violeta";
        break;
      case 6:
        color3 = "naranja";
        break;
      default:
    }
    System.out.print(color1 + ", " + color2 + ", " + color3);
  }
}

    

    
