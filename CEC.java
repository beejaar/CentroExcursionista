import Expedicionario.Expedicionario;
import Expedicionario.ExpedicionarioManager;
import Expediciones.Expedicion;
import Expediciones.ExpedicionManager;
import Montana.Montana;
import Montana.MontanaManager;
import Participaciones.Participacion;
import Participaciones.ParticipacionManager;
import java.util.*;

 

public class CEC {
    private final List<Montana> montanas;
    private final List<Expedicion> excursiones;
    private final List<Expedicionario> expedicionarios;
    private final List<Participacion> participaciones;
    private final MontanaManager montanaManager;
    private final ExpedicionManager excursionManager;
    private final ExpedicionarioManager expedicionarioManager;
    private final ParticipacionManager participacionManager;

    public CEC() {
    // Cargar datos de prueba
    this.montanas = DatosPruebaCeC.cargarMontanas();
    this.excursiones = DatosPruebaCeC.cargarExcursiones();
    this.expedicionarios = DatosPruebaCeC.cargarExpedicionarios();
    this.participaciones = DatosPruebaCeC.cargarParticipaciones();

    // Inicializar managers con los datos cargados
    this.montanaManager = new MontanaManager(montanas);
    this.excursionManager = new ExpedicionManager(excursiones, montanaManager);
    this.expedicionarioManager = new ExpedicionarioManager(expedicionarios);
    this.participacionManager = new ParticipacionManager(participaciones, excursiones, expedicionarios);
}
    public void iniciar() {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            Menu.borrar();
            Menu.MostrarMenu();
            opcion = Menu.leerOpcion();

            switch (opcion) {
                case 1 -> {
                    Menu.borrar();
                    montanaManager.menuMontanas(sc);
                }
                case 2 -> {
                    Menu.borrar();
                    excursionManager.menuExcursiones(sc);
                }
                case 3 -> {
                    Menu.borrar();
                    expedicionarioManager.menuExpedicionarios(sc);
                }
                case 4 -> {
                    Menu.borrar();
                    participacionManager.menuParticipaciones(sc);
                }
                case 5 -> {
                    Menu.borrar();
                    System.out.println("¡Hasta luego!");
                }
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}
