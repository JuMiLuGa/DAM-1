package prueba4_dam_dual;

import java.io.Serializable;

public class CargadorMovil implements Serializable {
    
    private static final long serialVersionUID = 353L;
    
    private String marca;
    private int año;
    private double potencia;
    private boolean permiteCargaRapida;
    
    public CargadorMovil(String marca, int año, double potencia, boolean permiteCargaRapida) {
        this.marca = marca;
        this.año = año;
        this.potencia = potencia;
        this.permiteCargaRapida = permiteCargaRapida;
    }
    
    @Override
    public String toString() {
        String cargaRapida = permiteCargaRapida ? "sí permite carga rápida" : "no permite carga rápida";
        return marca + " (" + año + ") " + potencia + "W, " + cargaRapida + ".";
    }
    
    // Getters y setters
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public boolean isPermiteCargaRapida() {
        return permiteCargaRapida;
    }

    public void setPermiteCargaRapida(boolean permiteCargaRapida) {
        this.permiteCargaRapida = permiteCargaRapida;
    }
}
