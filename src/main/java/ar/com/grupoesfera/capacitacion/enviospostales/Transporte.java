package ar.com.grupoesfera.capacitacion.enviospostales;

public class Transporte {

    public Transporte(String nombre){
        this.nombre = nombre;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
