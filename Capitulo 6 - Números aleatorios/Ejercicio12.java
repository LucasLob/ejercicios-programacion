/**
* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
* con el código ascii entre el 32 y el 126 (94). Puedes hacer casting con (char) para
* convertir un entero en un carácter.
* 
* OBS: Math.random(), por defecto tiene el rango de 0 a 0,99.
* OBS2: * lo que hace es agrandar el intervalo (selecionar el rango que tendrá)
* OBS3: + lo que hace es empezar por el número que introducido por ejemplo: + 50r 
* @author Lucas Lobato Botelho
**/

public class Ejercicio12 {
  public static void main(String[] args){
    String verde = "\033[32m";
    int numeroAleatorio;
    int numeroInfinito = 0;

    System.out.println("Este programa muestra caracteres a lo Matrix");

    do {
      numeroAleatorio = (int)(Math.random()*94 + 32);
      System.out.print((char)numeroAleatorio + verde);
    } while ( numeroInfinito != 10);
  }
}
    
