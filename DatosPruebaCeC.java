
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


import Montana.Montana;
import Expedicionario.Expedicionario;
import Expedicionario.Alpinista;
import Expedicionario.Medico;
import Expediciones.Expedicion;
import Participaciones.Participacion;


public class DatosPruebaCeC {

    public static List<Montana> cargarMontanas() {
        List<Montana> montanas = new ArrayList<>();
          montanas.add(new Montana("M001", "Aneto", 3404, "Pirineos, Huesca"));
          montanas.add(new Montana("M002", "Mulhacén", 3479, "Sierra Nevada, Granada"));
          montanas.add(new Montana("M003", "Teide", 3715, "Tenerife, Islas Canarias"));
        return montanas;
    }

    public static List<Expedicion> cargarExcursiones() {
        List<Expedicion> excursiones = new ArrayList<>();
        excursiones.add(new Expedicion("E001", "Subida al Aneto", LocalDate.parse("2025-07-10"), "M001"));
        excursiones.add(new Expedicion("E002", "Ascenso al Mulhacén", LocalDate.parse("2025-08-15"), "M002"));
        excursiones.add(new Expedicion("E003", "Ruta al Teide", LocalDate.parse("2025-09-01"), "M003"));
    
        return excursiones;
    }

    public static List<Expedicionario> cargarExpedicionarios() {
        List<Expedicionario> expedicionarios = new ArrayList<>();
        expedicionarios.add(new Alpinista("A001", "Juan","Perez"));
        expedicionarios.add(new Alpinista("A002", "Laura","Gómez"));
        expedicionarios.add(new Medico("M001", "Ana","Ruiz", "Cardiología"));
        expedicionarios.add(new Medico("M002", "Carlos","Vidal", "Traumatología"));
        return expedicionarios;
    }

    public static List<Participacion> cargarParticipaciones() {
        List<Participacion> participaciones = new ArrayList<>();

        Participacion p1 = new Participacion();
        p1.setIdExcursion("E001");
        p1.setIdExpedicionario("A001");
        p1.setLograCima(true);

        Participacion p2 = new Participacion();
        p2.setIdExcursion("E001");
        p2.setIdExpedicionario("M001");
        p2.setLograCima(false);

        Participacion p3 = new Participacion();
        p3.setIdExcursion("E002");
        p3.setIdExpedicionario("A002");
        p3.setLograCima(true);

        Participacion p4 = new Participacion();
        p4.setIdExcursion("E002");
        p4.setIdExpedicionario("M002");
        p4.setLograCima(false);

        Participacion p5 = new Participacion();
        p5.setIdExcursion("E003");
        p5.setIdExpedicionario("A001");
        p5.setLograCima(false);

        participaciones.add(p1);
        participaciones.add(p2);
        participaciones.add(p3);
        participaciones.add(p4);
        participaciones.add(p5);

        return participaciones;
    }
}
