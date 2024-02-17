/*
 
 */
package javaapplication15;

// * @author SHADIA
 
import java.util.Scanner;

public class OperacionesAritmeticas {
    
    // Función para realizar operaciones aritméticas
    public static double realizarOperacion(int num1, int num2, String operador) {
        switch (operador) {
            case "+" -> {
                return num1 + num2;
            }
            case "-" -> {
                return num1 - num2;
            }
            case "*" -> {
                return num1 * num2;
            }
            case "/" -> {
                if (num2 != 0) {
                    return (double) num1 / num2;
                } else {
                    System.out.println("Error: división por cero.");
                    return Double.NaN;
                }
            }
            case "%" -> {
                return num1 % num2;
            }
            case "**" -> {
                return Math.pow(num1, num2);
            }
            default -> {
                System.out.println("Error: operador no válido.");
                return Double.NaN;
            }
        }
    }
    
    public static void main(String[] args) {
        // Leer dos números enteros y el operador aritmético
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer dos números enteros y el operador aritmético
            System.out.print("Ingrese el primer número entero: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número entero: ");
            int num2 = scanner.nextInt();
            
            System.out.print("Ingrese el operador aritmético (+, -, *, /, %, **): ");
            String operador = scanner.next();
            
            // Realizar la operación utilizando la función
            double resultado = realizarOperacion(num1, num2, operador);
            
            // Imprimir el resultado
            System.out.println("El resultado de la operación es: " + resultado);
        }
    }
}