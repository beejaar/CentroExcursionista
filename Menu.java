import java.util.Scanner;

public class Menu {
        public static void MostrarMenu() {

        System.out.println("╔═══════════════════ MENÚ ═════════════════════╗");
        System.out.println("║                                              ║");
        System.out.println("║ 1. Montañas                                  ║");
        System.out.println("║                                              ║");
        System.out.println("║ 2. Excursiones                               ║");
        System.out.println("║                                              ║");
        System.out.println("║ 3. Expedicionarios                           ║");
        System.out.println("║                                              ║");
        System.out.println("║ 4. Expediciones                              ║");
        System.out.println("║                                              ║");
        System.out.println("║ 5. Salir                                     ║");
        System.out.println("║                                              ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println("");
    }

     public static int leerOpcion() {
        System.out.print("Seleccione una opción: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void borrar() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
    }
}
