/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sueldo.mensual;


 //@author SHADIA

import java.util.Scanner;

public class SueldoMensual {

    // Función para calcular el gasto en arriendo
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.4;
    }

    // Función para calcular el gasto en comida
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }

    public static void main(String[] args) {
        // Leer el sueldo de Pedro
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer el sueldo de Pedro
            System.out.print("Ingrese el sueldo de Pedro: ");
            double sueldo = scanner.nextDouble();
            
            // Calcular el gasto en arriendo
            double gastoArriendo = calcularGastoArriendo(sueldo);
            // Calcular el gasto en comida
            double gastoComida = calcularGastoComida(sueldo);
            // Calcular cuánto dinero le queda a Pedro después de gastar en arriendo y comida
            double dineroRestante = sueldo - gastoArriendo - gastoComida;
            
            // Mostrar los resultados
            System.out.println("Gasto en arriendo: $" + gastoArriendo);
            System.out.println("Gasto en comida: $" + gastoComida);
            System.out.println("Dinero restante: $" + dineroRestante);
        }
    }
}
