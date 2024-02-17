/*
 
 */
package javaapplication12;

// @author SHADIA

import java.util.Scanner;

public class NuevoEdificioUniversidad {
    
    // Función para calcular el número de salones del nuevo edificio
    public static int calcularNumeroSalones(int numEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numEstudiantes / capacidadSalon);
    }
    
    // Función para calcular el número de pisos del nuevo edificio
    public static int calcularNumeroPisos(int numSalonesTotal, int numSalonesPorPiso) {
        return (int) Math.ceil((double) numSalonesTotal / numSalonesPorPiso);
    }
    
    public static void main(String[] args) {
        // Leer el número de estudiantes y la capacidad de un salón
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer el número de estudiantes y la capacidad de un salón
            System.out.print("Ingrese el número de estudiantes que tiene la universidad: ");
            int numEstudiantes = scanner.nextInt();
            
            System.out.print("Ingrese la capacidad de un salón: ");
            int capacidadSalon = scanner.nextInt();
            
            // Calcular el número de salones del nuevo edificio
            int numSalones = calcularNumeroSalones(numEstudiantes, capacidadSalon);
            
            // Leer el número de salones que tendrá un piso del edificio
            System.out.print("Ingrese el número de salones que tendrá un piso del edificio: ");
            int numSalonesPorPiso = scanner.nextInt();
            
            // Calcular el número de pisos del nuevo edificio
            int numPisos = calcularNumeroPisos(numSalones, numSalonesPorPiso);
            
            // Imprimir resultados
            System.out.println("El número de salones del nuevo edificio es: " + numSalones);
            System.out.println("El número de pisos del nuevo edificio es: " + numPisos);
        }
    }
}