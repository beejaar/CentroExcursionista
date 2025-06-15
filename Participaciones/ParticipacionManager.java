package Participaciones;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import Expedicionario.Expedicionario;
import Expedicionario.Alpinista;
import Expedicionario.Medico;
import Expediciones.Expedicion;

public class ParticipacionManager {
    private List<Participacion> participaciones;
    private List<Expedicion> excursiones;
    private List<Expedicionario> expedicionarios;

    public ParticipacionManager(List<Participacion> participaciones,
                                 List<Expedicion> excursiones,
                                 List<Expedicionario> expedicionarios) {
        this.participaciones = participaciones;
        this.excursiones = excursiones;
        this.expedicionarios = expedicionarios;
    }

    public void menuParticipaciones(Scanner sc) {
        int opcion;
        do {

            System.out.println("\n╔═══════════════ MENÚ PARTICIPACIONES ═══════════════╗");
            System.out.println("║                                                    ║");
            System.out.println("║ 1. Registrar participación                         ║");
            System.out.println("║                                                    ║");
            System.out.println("║ 2. Ver participaciones                             ║");
            System.out.println("║                                                    ║");
            System.out.println("║ 3. Buscar participantes por excursión              ║ ");
            System.out.println("║                                                    ║");
            System.out.println("║ 4. Buscar alpinistas que lograron cima por montaña ║");
            System.out.println("║                                                    ║");
            System.out.println("║ 5. Volver al menú principal                        ║");
            System.out.println("║                                                    ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    registrarParticipacion(sc);
                    break;
                case 2:
                    mostrarParticipaciones();
                    break;
                case 3:
                    buscarParticipantesPorExcursion(sc);
                    break;
                case 4:
                    buscarAlpinistasCimaPorMontana(sc);
                    break;
                case 5:
                    System.out.println(">> Volviendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    private void registrarParticipacion(Scanner sc) {
        String idExcursion;
        String idExpedicionario;

        Expedicion excursion = null;
        do {
            System.out.print("Ingrese ID de la excursión: ");
            idExcursion = sc.nextLine();
            excursion = buscarExcursion(idExcursion);
            if (excursion == null) {
                System.out.println(">> Excursión no encontrada. Intente de nuevo.");
            }
        } while (excursion == null);

        Expedicionario expedicionario = null;
        do {
            System.out.print("Ingrese ID del expedicionario: ");
            idExpedicionario = sc.nextLine();
            expedicionario = buscarExpedicionario(idExpedicionario);
            if (expedicionario == null) {
                System.out.println(">> Expedicionario no encontrado. Intente de nuevo.");
            }
        } while (expedicionario == null);

        System.out.print("¿Logró hacer cima? (s/n): ");
        String cima = sc.nextLine();
        boolean logroCima = cima.equalsIgnoreCase("s");

        Participacion p = new Participacion();
        p.setIdExcursion(idExcursion);
        p.setIdExpedicionario(idExpedicionario);
        p.setLograCima(logroCima);

        participaciones.add(p);
        System.out.println(">> Participación registrada con éxito.");
    }

    private void mostrarParticipaciones() {
        if (participaciones.isEmpty()) {
            System.out.println(">> No hay participaciones registradas.");
            return;
        }

        System.out.println("\n╔════════════ LISTADO DE PARTICIPACIONES ═══════════╗");
        for (Participacion p : participaciones) {
            String idExcursion = p.getIdExcursion();
            String idExpedicionario = p.getIdExpedicionario();

            Expedicion excursion = buscarExcursion(idExcursion);
            Expedicionario expedicionario = buscarExpedicionario(idExpedicionario);

            String nombreExcursion = (excursion != null) ? excursion.getNombre() : "Desconocida";
            String nombreExpedicionario = (expedicionario != null) ? expedicionario.getNombre() : "Desconocido";
            String tipo = (expedicionario instanceof Alpinista) ? "Alpinista" :
                          (expedicionario instanceof Medico) ? "Médico" : "Desconocido";

            System.out.println("Excursión: " + nombreExcursion);
            System.out.println(" - Participante: " + nombreExpedicionario + " [" + tipo + "]");
            System.out.println(" - Logró cima: " + (p.isLograCima() ? "Sí" : "No"));
            System.out.println("---------------------------------------------------");
        }
    }

    private Expedicion buscarExcursion(String id) {
        for (Expedicion e : excursiones) {
            if (e.getCodigo().equals(id)) {
                return e;
            }
        }
        return null;
    }

    private Expedicionario buscarExpedicionario(String id) {
        for (Expedicionario e : expedicionarios) {
            if (e.getIdExpedicionario().equals(id)) {
                return e;
            }
        }
        return null;
    }


    // Nuevos métodos para las búsquedas solicitadas

    public List<Expedicionario> buscarParticipantesXExcursion(String idExcursion) {
        List<Expedicionario> lista = new ArrayList<>();
        for (Participacion p : participaciones) {
            if (p.getIdExcursion().equals(idExcursion)) {
                Expedicionario exp = buscarExpedicionario(p.getIdExpedicionario());
                if (exp != null) {
                    lista.add(exp);
                }
            }
        }
        return lista;
    }

    public List<Alpinista> findAlpinistasCimaXMontana(String idMontana) {
        List<Alpinista> lista = new ArrayList<>();
        for (Participacion p : participaciones) {
            if (p.isLograCima()) {
                Expedicion excursion = buscarExcursion(p.getIdExcursion());
                if (excursion != null && excursion.getIdMontana().equals(idMontana)) {
                    Expedicionario exp = buscarExpedicionario(p.getIdExpedicionario());
                    if (exp instanceof Alpinista) {
                        lista.add((Alpinista) exp);
                    }
                }
            }
        }
        return lista;
    }

    // Métodos para interacción en menú

    private void buscarParticipantesPorExcursion(Scanner sc) {
        System.out.print("Ingrese ID de excursión: ");
        String idExcursion = sc.nextLine();
        List<Expedicionario> participantes = buscarParticipantesXExcursion(idExcursion);
        if (participantes.isEmpty()) {
            System.out.println(">> No hay participantes para esa excursión o no existe.");
        } else {
            System.out.println("Participantes en la excursión " + idExcursion + ":");
            for (Expedicionario e : participantes) {
                String tipo = (e instanceof Alpinista) ? "Alpinista" : (e instanceof Medico) ? "Médico" : "Desconocido";
                System.out.println("- " + e.getNombre() + " [" + tipo + "]");
            }
        }
    }

    private void buscarAlpinistasCimaPorMontana(Scanner sc) {
        System.out.print("Ingrese ID de montaña: ");
        String idMontana = sc.nextLine();
        List<Alpinista> alpinistas = findAlpinistasCimaXMontana(idMontana);
        if (alpinistas.isEmpty()) {
            System.out.println(">> No hay alpinistas que hayan logrado cima para esa montaña o no existe.");
        } else {
            System.out.println("Alpinistas que lograron cima en la montaña " + idMontana + ":");
            for (Alpinista a : alpinistas) {
                System.out.println("- " + a.getNombre());
            }
        }
    }
}
