package Montana;

import java.util.*;

public class MontanaManager {
    private List<Montana> montanas;


    public MontanaManager(List<Montana> montanas) {
        this.montanas = montanas;
    }

    public void menuMontanas(Scanner sc) {
        int opcion;
        do {
            System.out.println("\n╔═════════════ MENÚ MONTAÑAS ═════════════╗");
            System.out.println("║                                         ║");
            System.out.println("║ 1. Ver todas las montañas               ║");
            System.out.println("║                                         ║");
            System.out.println("║ 2. Añadir montaña                       ║");
            System.out.println("║                                         ║");
            System.out.println("║ 3. Buscar montaña por ID                ║");
            System.out.println("║                                         ║");
            System.out.println("║ 4. Volver al menú principal             ║");
            System.out.println("║                                         ║");
            System.out.println("╚═════════════════════════════════════════╝");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> mostrarMontanas();

                case 2 -> {
                    System.out.print("ID de la montaña: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Altitud: ");
                    int altitud = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Localización: ");
                    String localizacion = sc.nextLine();

                    montanas.add(new Montana(id, nombre, altitud, localizacion));
                    System.out.println(">> Montaña añadida correctamente.");
                }

                case 3 -> {
                    System.out.print("Ingrese ID de la montaña: ");
                    String idBuscar = sc.nextLine();
                    Montana encontrada = findMontana(idBuscar);  // Llamas al método que ya tienes
                    if (encontrada != null) {
                        System.out.println("Montaña encontrada:");
                        System.out.println(encontrada);
                    } else {
                        System.out.println("No se encontró una montaña con ese ID.");
                    }
                }

                case 4 -> System.out.println(">> Volviendo al menú principal...");

                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    public Montana findMontana(String id) {
    for (Montana m : montanas) {
        if (m.getIdMontana().equals(id)) {
            return m;  // Devuelve la montaña encontrada
        }
    }
    return null; // Si no se encuentra, devuelve null
}

private void mostrarMontanas() {
        System.out.println("             MONTAÑAS            ");
        System.out.println("═════════════════════════════════");
        if (montanas.isEmpty()) {
            System.out.println("No hay montañas registradas.");
        } else {
            for (Montana m : montanas) {
                System.out.println("* " + m.getNombre() + " (Altitud: " + m.getAltitud() + " m, Localización: " + m.getLocalizacion() + ")");
            }
        }
        System.out.println();
    }
    
}
