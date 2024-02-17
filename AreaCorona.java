/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

// @author SHADIA
 
import java.util.Scanner;

public class AreaCorona {

    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Función para calcular el área de la corona circular
    public static double calcularAreaCorona(double radioExterno, double radioInterno) {
        // Calcular el área del círculo grande
        double areaCirculoExterno = calcularAreaCirculo(radioExterno);
        // Calcular el área del círculo pequeño
        double areaCirculoInterno = calcularAreaCirculo(radioInterno);
        // Restar el área del círculo pequeño del área del círculo grande
        double areaCorona = areaCirculoExterno - areaCirculoInterno;
        return areaCorona;
    }

    public static void main(String[] args) {
        // Leer el radio externo (R) y el radio interno (r)
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer el radio externo (R) y el radio interno (r)
            System.out.print("Ingrese el radio externo (R) del círculo grande: ");
            double radioExterno = scanner.nextDouble();
            System.out.print("Ingrese el radio interno (r) del círculo pequeño: ");
            double radioInterno = scanner.nextDouble();
            
            // Calcular el área de la corona circular
            double areaCorona = calcularAreaCorona(radioExterno, radioInterno);
            
            // Mostrar el resultado
            System.out.println("El área de la corona circular es: " + areaCorona);
        }
    }
}