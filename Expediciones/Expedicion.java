package Expediciones;
import java.time.LocalDate;

public class Expedicion {
    private String codigo;     // Identificador único
    private String nombre;     // Nombre de la excursión (opcional pero útil)
    private LocalDate fecha;
    private String idMontana;

    public Expedicion(String codigo, String nombre, LocalDate fecha, String idMontana) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.idMontana = idMontana;
    }

    // Getters y setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getIdMontana() { return idMontana; }
    public void setIdMontana(String idMontana) { this.idMontana = idMontana; }

    @Override
    public String toString() {
        return "Excursión{" +
                "Código='" + codigo + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Fecha=" + fecha +
                ", ID Montaña='" + idMontana + '\'' +
                '}';
    }
}
