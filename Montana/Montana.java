package Montana;

public class Montana {
    private String idMontana;
    private String nombre;
    private int altitud;
    private String localizacion;

    public Montana(String idMontana, String nombre, int altitud,String localizacion) {
        this.idMontana = idMontana;
        this.nombre = nombre;
        this.altitud = altitud;
        this.localizacion = localizacion;
    }

    public String getIdMontana() {
        return idMontana;
    }

    public void setIdMontana(String id) {
        this.idMontana = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "Montaña{" +
                "ID='" + idMontana + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Altitud=" + altitud +
                ", Localización='" + localizacion + '\'' +
                '}';
    }

}