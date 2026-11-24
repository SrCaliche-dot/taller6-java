import javax.swing.JOptionPane;

/**
 * Taller 6 - Parte 2: Arreglos de dos dimensiones
 * Integrante A: Isaaid Caicedo
 * Integrante B: Christopher Coronel
 * Fecha: 23/11/2026
 */
public class Parte2 {
    public static void main(String[] args) {

        int filas = 4;
        int columnas = 3;

        int[][] calificaciones = new int[filas][columnas];

        String[] materias = {"Matematica", "Español", "Ciencias"};
        String[] estudiantes = {"Ana", "Luis", "Carla", "Pedro"};

        calificaciones[0][0] = 85;
        calificaciones[0][1] = 72;
        calificaciones[0][2] = 90;

        calificaciones[1][0] = 60;
        calificaciones[1][1] = 88;
        calificaciones[1][2] = 75;

        calificaciones[2][0] = 95;
        calificaciones[2][1] = 70;
        calificaciones[2][2] = 80;

        calificaciones[3][0] = 78;
        calificaciones[3][1] = 65;
        calificaciones[3][2] = 92;

        StringBuilder reporte = new StringBuilder();
        reporte.append("=== TABLA DE CALIFICACIONES ===\n");
        reporte.append(String.format("%-10s", "Alumno"));

        for (String m : materias) {
            reporte.append(String.format("%-12s", m));
        }

        reporte.append("Promedio\n");
        reporte.append("-".repeat(50)).append("\n");

        for (int f = 0; f < filas; f++) {
            int sumaFila = 0;
            reporte.append(String.format("%-10s", estudiantes[f]));

            for (int c = 0; c < columnas; c++) {
                reporte.append(String.format("%-12d", calificaciones[f][c]));
                sumaFila += calificaciones[f][c];
            }

            double promedioFila = (double) sumaFila / columnas;
            reporte.append(String.format("%.2f\n", promedioFila));
        }

        reporte.append("-".repeat(50)).append("\n");
        reporte.append(String.format("%-10s", "Prom.mat"));

        for (int c = 0; c < columnas; c++) {
            int sumaCol = 0;

            for (int f = 0; f < filas; f++) {
                sumaCol += calificaciones[f][c];
            }

            reporte.append(String.format("%-12.2f", (double) sumaCol / filas));
        }

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}