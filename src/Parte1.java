
import javax.swing.JOptionPane;

/**
 * Taller 6 - Parte 1: Arreglos de una dimensión
 * Integrante A: Isaaid Caicedo
 * Integrante B: 
 */
public class Parte1 {
    public static void main(String[] args) {

        int[] notas = new int[8];

        // Pedir las 8 notas
        for (int i = 0; i < notas.length; i++) {
            String entrada = JOptionPane.showInputDialog(
                "Ingresa la nota " + (i + 1) + " (0-100):"
            );
            notas[i] = Integer.parseInt(entrada);
        }

        // Calcular suma y promedio
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double promedio = (double) suma / notas.length;

        // Buscar nota máxima y mínima
        int maximo = notas[0];
        int minimo = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maximo) maximo = notas[i];
            if (notas[i] < minimo) minimo = notas[i];
        }

        // Mostrar resultados
        StringBuilder reporte = new StringBuilder();
        reporte.append("=== REPORTE DE NOTAS ===\n");
        reporte.append("Notas ingresadas: ");

        for (int i = 0; i < notas.length; i++) {
            reporte.append(notas[i]);
            if (i < notas.length - 1) reporte.append(", ");
        }

        reporte.append("\n");
        reporte.append(String.format("Suma     : %d%n", suma));
        reporte.append(String.format("Promedio : %.2f%n", promedio));
        reporte.append(String.format("Máxima   : %d%n", maximo));
        reporte.append(String.format("Mínima   : %d%n", minimo));

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}