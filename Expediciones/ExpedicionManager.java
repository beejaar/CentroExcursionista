package Expediciones;

import Montana.MontanaManager;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

public class ExpedicionManager {
    private List<Expedicion> excursiones;
    private MontanaManager montanaManager;

    public ExpedicionManager(List<Expedicion> excursiones, MontanaManager montanaManager) {
        this.excursiones = excursiones;
        this.montanaManager = montanaManager;
    }

    public void menuExcursiones(Scanner sc) {
        int opcion;
        do {
            System.out.println("\n╔═════════════ MENÚ EXCURSIONES ═════════════╗");
            System.out.println("║                                              ║");
            System.out.println("║ 1. Ver todas las excursiones                 ║");
            System.out.println("║                                              ║");
            System.out.println("║ 2. Añadir excursión                          ║");
            System.out.println("║                                              ║");
            System.out.println("║ 3. Buscar excursión por código               ║");
            System.out.println("║                                              ║");
            System.out.println("║ 4. Volver al menú principal                  ║");
            System.out.println("║                                              ║");
            System.out.println("╚══════════════════════════════════════════════╝");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar buffer

            switch (opcion) {
                
                case 1 -> imprimirExcursiones();

                case 2 -> {
                    System.out.print("Código de la excursión: ");
                    String codigo = sc.nextLine();

                    System.out.print("Nombre de la excursión: ");
                    String nombre = sc.nextLine();

                    System.out.print("Fecha (YYYY-MM-DD): ");
                    String fechaStr = sc.nextLine();
                    LocalDate fecha = null;
                    try {
                        fecha = LocalDate.parse(fechaStr);
                    } catch (DateTimeParseException ex) {
                        System.out.println("Fecha inválida. Use el formato YYYY-MM-DD.");
                        break;
                    }

                    System.out.print("ID de la montaña (debe existir): ");
                    String idMontana = sc.nextLine();

                    // Verificar si la montaña existe
                    if (montanaManager.findMontana(idMontana) == null) {
                        System.out.println("No existe una montaña con ese ID. Operación cancelada.");
                        break;
                    }

                    excursiones.add(new Expedicion(codigo, nombre, fecha, idMontana));
                    System.out.println(">> Excursión añadida correctamente.");
                }

                case 3 -> {
                    System.out.print("Ingrese código de la excursión: ");
                    String codigoBuscar = sc.nextLine();

                    Expedicion encontrada = null;
                    for (Expedicion e : excursiones) {
                        if (e.getCodigo().equals(codigoBuscar)) {
                            encontrada = e;
                            break;
                        }
                    }

                    if (encontrada != null) {
                        System.out.println("Excursión encontrada:");
                        System.out.println(encontrada);
                    } else {
                        System.out.println("No se encontró una excursión con ese código.");
                    }
                }

                case 4 -> System.out.println(">> Volviendo al menú principal...");

                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    public void imprimirExcursiones() {
    if (excursiones.isEmpty()) {
        System.out.println("\n>> No hay excursiones registradas.");
        return;
    }

    System.out.println("             Expediciones            ");
    System.out.println("═════════════════════════════════════");

    for (Expedicion e : excursiones) {
        System.out.println("ID: " + e.getCodigo());
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Fecha: " + e.getFecha());
        System.out.println("ID Montaña: " + e.getIdMontana());
        System.out.println("----------------------------------------");
    }
}

    
}
