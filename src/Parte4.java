import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

/**
 * Taller 6 - Parte 4: Colecciones
 * Integrante A: Isaaid Caicedo
 * Integrante B: Christopher Coronel
 * Fecha: 23/11/2026
 */
public class Parte4 {
    public static void main(String[] args) {

        // SECCION A: ArrayList de ciudades

        ArrayList<String> ciudades = new ArrayList<>();

        Collections.addAll(ciudades,
            "Panamá", "Colón", "David", "Santiago", "Chitré");

        StringBuilder sb = new StringBuilder();

        sb.append("=== ArrayList de ciudades ===\n");
        sb.append("Tamaño: " + ciudades.size() + "\n");
        sb.append("Primera ciudad: " + ciudades.get(0) + "\n");
        sb.append("Última ciudad: " + ciudades.get(ciudades.size()-1) + "\n");
        sb.append("¿Contiene David? " + ciudades.contains("David") + "\n");
        sb.append("¿Contiene Bocas? " + ciudades.contains("Bocas") + "\n");

        sb.append("\nLista completa:\n");

        for (String ciudad : ciudades) {
            sb.append(" - " + ciudad + "\n");
        }

        ciudades.remove("Colón");
        sb.append("\nDespués de eliminar Colón: " + ciudades + "\n");

        ciudades.add(1, "Bocas del Toro");
        sb.append("Después de insertar en pos 1: " + ciudades + "\n");

        Collections.sort(ciudades);
        sb.append("Ordenadas alfabéticamente: " + ciudades + "\n");

        JOptionPane.showMessageDialog(null, sb.toString());
        sb.setLength(0);

        // SECCION B: ArrayList de numeros

        ArrayList<Integer> numeros = new ArrayList<>();
        int[] datos = {34, 12, 78, 56, 23, 89, 45, 67};

        for (int d : datos) {
            numeros.add(d);
        }

        int suma = 0;
        int mayor = numeros.get(0);

        for (int n : numeros) {
            suma += n;

            if (n > mayor) {
                mayor = n;
            }
        }

        sb.append("=== ArrayList de números ===\n");
        sb.append("Lista: " + numeros + "\n");
        sb.append("Suma: " + suma + "\n");
        sb.append(String.format("Prom: %.2f\n",
            (double) suma / numeros.size()));
        sb.append("Mayor: " + mayor + "\n");

        ArrayList<Integer> mayoresDe40 = new ArrayList<>();
        int sumaFiltrados = 0;

        for (int n : numeros) {
            if (n >= 40) {
                mayoresDe40.add(n);
                sumaFiltrados += n;
            }
        }

        sb.append("Mayores o iguales a 40: " + mayoresDe40 + "\n");
        sb.append("Suma de elementos filtrados: " + sumaFiltrados + "\n");

        JOptionPane.showMessageDialog(null, sb.toString());
        sb.setLength(0);

        // SECCION C: LinkedList como cola

        LinkedList<String> cola = new LinkedList<>();

        for (int i = 1; i <= 4; i++) {
            cola.addLast("Cliente " + i);
        }

        sb.append("=== LinkedList como Cola (turno bancario) ===\n");
        sb.append("Cola inicial: " + cola + "\n\n");
        sb.append("Atendiendo clientes:\n");

        String primero = cola.removeFirst();
        sb.append("Atendido: " + primero);
        sb.append(" | Restantes en cola: " + cola.size() + "\n");

        // Llegan dos clientes nuevos

        cola.addLast("Cliente 5");
        cola.addLast("Cliente 6");

        sb.append("\nLlegan Cliente 5 y Cliente 6\n");
        sb.append("Cola actualizada: " + cola + "\n\n");

        while (!cola.isEmpty()) {
            String cliente = cola.removeFirst();

            sb.append("Atendido: " + cliente);
            sb.append(" | Restantes en cola: " + cola.size() + "\n");
        }

        sb.append("\nCola vacía. Fin de atención.\n");

        cola.addLast("Cliente A");
        cola.addLast("Cliente B");
        cola.addFirst("URGENTE");

        sb.append("\nNueva cola con urgencia: " + cola + "\n");

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}