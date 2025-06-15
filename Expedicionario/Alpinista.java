package Expedicionario;

public class Alpinista extends Expedicionario {
    private int numeroAscensos;

     public Alpinista(String idExpedicionario, String nombre, String apellido) {
        super(idExpedicionario, nombre, apellido);
    }

    public Alpinista(){}

    public int getNumeroAscensos() {
        return numeroAscensos;
    }

    public void setNumeroAscensos(int numeroAscensos) {
        this.numeroAscensos = numeroAscensos;
    }

    @Override
    public String toString() {
        return "Alpinista{" +
                "ID='" + idExpedicionario + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Número de ascensos=" + numeroAscensos +
                '}';
    }
}
