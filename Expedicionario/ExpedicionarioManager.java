package Expedicionario;

import java.util.*;

public class ExpedicionarioManager {
    private List<Expedicionario> expedicionarios;

    public ExpedicionarioManager(List<Expedicionario> expedicionarios) {
        this.expedicionarios = expedicionarios;
    }

    public void menuExpedicionarios(Scanner sc) {
        int opcion;
        do {
            System.out.println("\n╔═════════ MENÚ EXPEDICIONARIOS ═════════╗");
            System.out.println("║                                        ║");
            System.out.println("║ 1. Ver todos                           ║");
            System.out.println("║                                        ║");
            System.out.println("║ 2. Añadir alpinista                    ║");
            System.out.println("║                                        ║");
            System.out.println("║ 3. Añadir médico                       ║");
            System.out.println("║                                        ║");
            System.out.println("║ 4. Buscar por ID                       ║");
            System.out.println("║                                        ║");
            System.out.println("║ 5. Volver                              ║");
            System.out.println("║                                        ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> imprimirExpedicionarios();
                
                case 2 -> {
                    Alpinista a = new Alpinista();
                    System.out.print("ID: ");
                    a.setIdExpedicionario(sc.nextLine());
                    System.out.print("Nombre: ");
                    a.setNombre(sc.nextLine());
                    System.out.print("Apellido: ");
                    a.setApellido(sc.nextLine());
                    expedicionarios.add(a);
                    System.out.println(">> Alpinista añadido.");
                }
                case 3 -> {
                    Medico m = new Medico();
                    System.out.print("ID: ");
                    m.setIdExpedicionario(sc.nextLine());
                    System.out.print("Nombre: ");
                    m.setNombre(sc.nextLine());
                    System.out.print("Apellido: ");
                    m.setApellido(sc.nextLine());
                    System.out.print("Especialidad: ");
                    m.setEspecialidad(sc.nextLine());
                    expedicionarios.add(m);
                    System.out.println(">> Médico añadido.");
                }
                case 4 -> {
                    System.out.print("Ingrese ID: ");
                    String idBuscar = sc.nextLine();
                    Expedicionario encontrado = findExpedicionario(idBuscar);
                    if (encontrado != null) {
                        System.out.println(">> Encontrado:");
                        System.out.println(encontrado);
                    } else {
                        System.out.println(">> No se encontró un expedicionario con ese ID.");
                    }
                }
                case 5 -> System.out.println(">> Volviendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    public Expedicionario findExpedicionario(String id) {
        for (Expedicionario e : expedicionarios) {
            if (e.getIdExpedicionario().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public void imprimirExpedicionarios() {
    System.out.println("                  Alpinistas                ");
    System.out.println("════════════════════════════════════════════");

    boolean hayAlpinistas = false;
    for (Expedicionario e : expedicionarios) {
        if (e instanceof Alpinista) {
            hayAlpinistas = true;
            System.out.println("ID: " + e.getIdExpedicionario());
            System.out.println("Nombre: " + e.getNombre() + " " + e.getApellido());
            System.out.println("----------------------------------------");
        }
    }
    if (!hayAlpinistas) {
        System.out.println(">> No hay alpinistas registrados.");
    }

    System.out.println("                  MÉDICOS                   ");
    System.out.println("════════════════════════════════════════════");

    boolean hayMedicos = false;
    for (Expedicionario e : expedicionarios) {
        if (e instanceof Medico) {
            Medico m = (Medico) e;
            hayMedicos = true;
            System.out.println("ID: " + m.getIdExpedicionario());
            System.out.println("Nombre: " + m.getNombre() + " " + m.getApellido());
            System.out.println("Especialidad: " + m.getEspecialidad());
            System.out.println("----------------------------------------");
        }
    }
    if (!hayMedicos) {
        System.out.println(">> No hay médicos registrados.");
    }
}

}
