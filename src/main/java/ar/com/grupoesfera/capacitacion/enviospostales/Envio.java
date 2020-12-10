package ar.com.grupoesfera.capacitacion.enviospostales;


import java.util.List;

public class Envio {

    private List<Paquete> paquetes;
    private Double costo;
    private String direccionEntrega;
    private Transporte transporte;


    public Envio(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public Integer getCantidadDePaquetes() {
        return paquetes.size();
    }

    public Double pesoTodal(){
        Double pesoTodal = 0.0;
        for(Paquete paquete : this.paquetes){
            pesoTodal = pesoTodal + paquete.getPeso();
        }
        return pesoTodal;
    }
}
