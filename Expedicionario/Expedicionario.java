package Expedicionario;

public abstract class Expedicionario {
    protected String idExpedicionario;
    protected String nombre;
    protected String apellido;
    
    public Expedicionario(String idExpedicionario, String nombre, String apellido) {
        this.idExpedicionario = idExpedicionario;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Expedicionario(){}

    public String getIdExpedicionario() {
        return idExpedicionario;
    }

    public void setIdExpedicionario(String id) {
        this.idExpedicionario = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Expedicionario{" +
                "ID='" + idExpedicionario + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                '}';
    }
}
