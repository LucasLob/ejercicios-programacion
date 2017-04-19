/**
* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
* separados por espacios. Muestra también el máximo, el mínimo y la media
* de esos números.
**/

public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Este programa mostrará 50 números enteros entre 100 y 199, además de su máximo, mínimo y la media de estos: ");
    System.out.println();
    
    int suma = 0;
    int numeroMaxGenerado = 100;
    int numeroMinGenerado = 199;
    int numeroAleatorio;
    
    for (int contador = 1; contador <= 50; contador++){
      numeroAleatorio = ((int)(Math.random()*101 + 100));
      System.out.println(contador + "º numero " + numeroAleatorio);
      suma += numeroAleatorio;     
    
    if (numeroAleatorio < numeroMinGenerado){
      numeroMinGenerado = numeroAleatorio;
    }
    
    if (numeroAleatorio > numeroMaxGenerado) {
      numeroMaxGenerado = numeroAleatorio;
    }

    }
    
    System.out.println("El minimo número generado es " + numeroMinGenerado);
    System.out.println("El maximo número generado es " + numeroMaxGenerado);
    System.out.println("La media entre los 50 números es de " + (suma / 50));
  }
}
    
