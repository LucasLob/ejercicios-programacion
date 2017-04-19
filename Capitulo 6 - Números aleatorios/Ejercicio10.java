/**
* Realiza un programa que pinte por pantalla diez líneas formadas por carac-
* teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
* entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
* aleatoria entre 1 y 40 caracteres.
* 
* OBS: Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50r 
* @author Lucas Lobato Botelho
**/

public class Ejercicio10 {
  public static void main(String[] args){

    int numeroAleatorio;
    String caracterAleatorio = "";

    for (int lineas = 1; lineas <= 10; lineas++){
      numeroAleatorio = (int)(Math.random()*6 +1);
      int longitudLinea = (int)(Math.random()*41 +1);
      System.out.print(lineas + "º. ");
    
      
      switch (numeroAleatorio) {
        case 1:
        caracterAleatorio = "*";
        break;

        case 2:
        caracterAleatorio = "-";
        break;

        case 3:
        caracterAleatorio = "=";
        break;

        case 4:
        caracterAleatorio = ".";
        break;

        case 5:
        caracterAleatorio = "|";
        break;

        case 6:
        caracterAleatorio = "@";
        break;
      }
      for(int contador = 1; contador <= longitudLinea; contador++){
        System.out.print(caracterAleatorio);
      }
      System.out.println();
    }
  }
}
      
