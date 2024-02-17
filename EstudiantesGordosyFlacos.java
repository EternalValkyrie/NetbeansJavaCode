/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package el.paseo;

/**
 *
 * @author SHADIA
 */
public class EstudiantesGordosyFlacos {

    public static int calcularBuses(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        // Calcular el número total de estudiantes (gordos y flacos)
        int totalEstudiantes = (estudiantesGordos * 2) + estudiantesFlacos;
        
        // Calcular el número de autobuses necesarios
        int busesNecesarios = totalEstudiantes / sillasPorBus;
        if (totalEstudiantes % sillasPorBus != 0) {
            busesNecesarios++; // Agregar un bus adicional si hay estudiantes adicionales
        }
        
        return busesNecesarios;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int sillasPorBus = 50;
        int estudiantesGordos = 10;
        int estudiantesFlacos = 30;
        
        int busesNecesarios = calcularBuses(sillasPorBus, estudiantesGordos, estudiantesFlacos);
        System.out.println("Se necesitan alquilar " + busesNecesarios + " autobuses.");
    }
}