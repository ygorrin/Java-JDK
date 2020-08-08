
import java.util.Scanner;

/*1.- Escribe un programa que solicite por pantalla el ingreso de 4 números decimales para calcular el 
     promedio y los muestre en pantalla.
2.- Escriba un programa que solicite por pantalla un número y debe decidir si el número es positivo o negativo.
3.- Escriba un método que escriba en la pantalla el valor de la suma de los 100 primeros números pares. 
 */


/**
 * @author Ygorrin
 */
public class JDKProgram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("----Calculo de Promedio------");
        System.out.println("-----Ingrese 4 números-------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Num1: ");
        int a = sc.nextInt();
        System.out.print("Num2: ");
        int b = sc.nextInt();
        System.out.print("Num3: ");
        int c = sc.nextInt();
        System.out.print("Num4: ");
        int d = sc.nextInt();
        System.out.println("El promedio es: " + (a + b + c + d) / 4);
    }

}
