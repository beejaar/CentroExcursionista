package Expedicionario;

public class Medico extends Expedicionario {
    private String especialidad;

     public Medico(String idExpedicionario, String nombre, String apellido,String especialidad) {
        super(idExpedicionario, nombre, apellido);
        this.especialidad = especialidad;
    }

    public Medico(){}

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Médico{" +
                "ID='" + idExpedicionario + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Especialidad='" + especialidad + '\'' +
                '}';
    }
}
