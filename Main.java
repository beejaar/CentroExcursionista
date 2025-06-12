

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PantallaDeCarga.mostrar();
        PantallaDeCarga.borrar();
        MostrarMenu();
        
        
    }

    public static void mostrarCabecera() {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║      CENTRO DE EXCURSIONES CARLEMANY         ║");
        System.out.println("║          ¡Vive la aventura con nosotros!     ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    public static void MostrarMenu() {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║                      MENÚ                    ║");
        System.out.println("║                                              ║");
        System.out.println("║ 1. Ver excursiones                           ║");
        System.out.println("║                                              ║");
        System.out.println("║ 2. Reservar plaza                            ║");
        System.out.println("║                                              ║");
        System.out.println("║ 3. Consultar historial                       ║");
        System.out.println("║                                              ║");
        System.out.println("║ 4. Salir                                     ║");
        System.out.println("║                                              ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println("");
        System.out.print("Seleccione una opción: ");

    }




}