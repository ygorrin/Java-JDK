/*
1.- Calcular el promedio de 4 Numeros
2.- Indicar si el número es positivo o negativo
3.- Escriba un método que escriba en la pantalla el valor de la suma de los 100 primeros números pares. 
 */
package jdkprogram1;

import java.util.Scanner;
import static sun.util.calendar.CalendarUtils.mod;

/**
 *
 * @author Ygorrin
 */
public class JDKProgram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Calcular el promedio de 4 numeros
        System.out.println("--------------------------------------");
        System.out.println("---------Calculo de Promedio----------");
        System.out.println("----------Ingrese 4 números-----------");
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

        //Indicar si el número es positivo o negativo
        System.out.println("--------------------------------------");
        System.out.println("-----Numeros positivos y Negativos----");
        System.out.println("----------Ingrese un numero-----------");
        System.out.print("Num1: ");
        a = sc.nextInt();
        if (a > 0) {
            System.out.println("El número " + a + " es Positivo");
        } else {
            if (a < 0) {
                System.out.println("El número " + a + " es negativo");
            } else {
                System.out.println("El número es Cero");
            }
        }

        //Escriba un método que escriba en la pantalla el valor de la suma de los 100 primeros números pares. 
        System.out.println("--------------------------------------");
        System.out.println("------Suma de 100 números pares-------");
        System.out.println("-------Ingrese el número inicial------");
        System.out.print("Num Inicial: ");
        a = sc.nextInt();

        if (a % 2 == 1) {
            a++;
        } else {
            b = 0;
            c = 0;
        }
        do {
            if (b <= 100){
                c = a + c;
                b++;
                a = (a + 2);
            }
        } while (b <= 100);

        System.out.println("Suma 100 primeros NrsPares es: " + c);
        System.out.println("--------------------------------------");

    }

}
