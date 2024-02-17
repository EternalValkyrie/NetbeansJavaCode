/*
 
 */
package javaapplication14;

// * @author SHADIA
 
import java.util.Scanner;

public class MayorDeDosNumeros {
    
    // Función para encontrar el mayor de dos números enteros
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    public static void main(String[] args) {
        // Leer dos números enteros
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer dos números enteros
            System.out.print("Ingrese el primer número entero: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número entero: ");
            int num2 = scanner.nextInt();
            
            // Encontrar el mayor de los dos números utilizando la función
            int mayor = encontrarMayor(num1, num2);
            
            // Imprimir el resultado
            System.out.println("El mayor de los dos números es: " + mayor);
        }
    }
}
