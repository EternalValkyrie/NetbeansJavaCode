/*
 
 */
package javaapplication18;

// @author SHADIA

import java.util.Scanner;

public class AumentoSueldo {
    
    // Función para calcular el valor del aumento según el sueldo actual del empleado
    public static double calcularAumento(double sueldo) {
        if (sueldo <= 800000) {
            return sueldo * 0.10; // Incremento del 10% para sueldos hasta $800.000
        } else if (sueldo <= 1200000) {
            return sueldo * 0.08; // Incremento del 8% para sueldos entre $800.000 y $1'200.000
        } else {
            return sueldo * 0.05; // Incremento del 5% para sueldos mayores a $1'200.000
        }
    }
    
    public static void main(String[] args) {
        // Leer el sueldo actual del empleado
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer el sueldo actual del empleado
            System.out.print("Ingrese el sueldo actual del empleado: ");
            double sueldoActual = scanner.nextDouble();
            
            // Calcular el valor del aumento utilizando la función
            double aumento = calcularAumento(sueldoActual);
            
            // Calcular el nuevo salario sumando el aumento al sueldo actual
            double nuevoSalario = sueldoActual + aumento;
            
            // Imprimir el valor del aumento y el nuevo salario
            System.out.println("El valor del aumento es: " + aumento);
            System.out.println("El nuevo salario del empleado es: " + nuevoSalario);
        }
    }
}
