import java.util.Scanner;


public class Ejejcricio3 {
    public static void main(String[] argumentos) {
       
/*fahrenheit a centrigrados */
       Scanner scanner = new Scanner(System.in);
       System.out.println("los grados fahrenheit a convertir  ");
       Double  F = scanner.nextDouble();
      Double centigrados = (F-32)/1.8;
      System.out.println("La conversion de  grados Fahrenheit a  celsius es:"+centigrados);
      /*Grados centigrados a  Fahrenheit*/
      System.out.println(" los grados centigrados a convertir ");
       Double  C = scanner.nextDouble();
      Double Fahrenheit = (C-1.8)+32;
      System.out.println("La conversion de  grados centigrados a Fahrenheit  es:"+Fahrenheit);
    }
}