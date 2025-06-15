package Participaciones;

public class Participacion {
    private String idExcursion;
    private String idExpedicionario;
    private boolean lograCima;

    public Participacion() {
    }

    public Participacion(String idExcursion, String idExpedicionario, boolean lograCima) {
        this.idExcursion = idExcursion;
        this.idExpedicionario = idExpedicionario;
        this.lograCima = lograCima;
    }

    public String getIdExcursion() {
        return idExcursion;
    }

    public void setIdExcursion(String idExcursion) {
        this.idExcursion = idExcursion;
    }

    public String getIdExpedicionario() {
        return idExpedicionario;
    }

    public void setIdExpedicionario(String idExpedicionario) {
        this.idExpedicionario = idExpedicionario;
    }

    public boolean isLograCima() {
        return lograCima;
    }

    public void setLograCima(boolean lograCima) {
        this.lograCima = lograCima;
    }

    @Override
    public String toString() {
        return "Participación{" +
                "ID Excursión='" + idExcursion + '\'' +
                ", ID Expedicionario='" + idExpedicionario + '\'' +
                ", Logra Cima=" + lograCima +
                '}';
    }
}
