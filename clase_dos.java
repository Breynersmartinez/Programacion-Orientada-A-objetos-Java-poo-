import java.util.Scanner;
public class clase_dos{
    public static void main(String[] args){
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del cuadrado ");
        Double  L = scanner.nextDouble();
        System.out.println("Ingrese la altura del cuadrado");
        Double  b = scanner.nextDouble();
        Double Resultado = b*b;
        System.out.println("el area del cuadrado es    L" +L+ " *  "  + b+ " es " + Resultado +"CM");
    }
}
/* Asignacion:

*/
