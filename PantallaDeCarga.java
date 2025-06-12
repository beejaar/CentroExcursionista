public class PantallaDeCarga {
    public static void mostrar() throws InterruptedException {

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                           \\   |   /                                    ");
        System.out.println("                            \\ _|_ /     /\\     _   _                   ");
        System.out.println("                        /\\ //    \\_ _  /  \\     \\_/   _   _          ");        
        System.out.println("                       /  \\     /\\    /    \\           \\_/           ");      
        System.out.println("                      /    \\   /  \\ /	    \\                         "); 
        System.out.println("                    /	    \\/	   \\         \\                           ");                                                                             
        System.out.println("                   /         \\      \\         \\                       ");                                                                                       
        System.out.println("                 /          /\\¯¯¯\\  \\   /\\ /\\  \\                   ");                                                                                      
        System.out.println("                /  	   /| \\   \\  \\/\\/\\/_/\\  \\                   ");                                                                                     
		System.out.println("               /__________/ |  \\   \\__\\/\\__\\ /\\                    "); 									  
        System.out.println("                         /  |   \\   \\ /__\\| /__\\                     ");                                                                                
    	System.out.println("                        /___|____\\___\\ ||    ||                        "); 									       
   		System.out.println("             ------------------------------------------------            ");							               
        System.out.println("                    CENTRO DE EXCURISONES CARLEMANY                      ");
        System.out.println("");
        System.out.print("                  CARGANDO: [");
        
        
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print("=");
        }

        System.out.println("] 100%");
        Thread.sleep(1000);
    }            
    
    public static void borrar() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
    }
                                                                                              
    
}
