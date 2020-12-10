package ar.com.grupoesfera.capacitacion.enviospostales;

import java.util.ArrayList;
import java.util.List;

public class DespachadorDeEnvios {

    private List<Envio> listaEnvios;

    public DespachadorDeEnvios(){
        listaEnvios = new ArrayList<Envio>();
    }

    public Double calcularCosto(Envio envio) {
        int cantidadDePaquetes = envio.getCantidadDePaquetes();
        Double costo = 0.0;
        if ( cantidadDePaquetes < 5){
            costo = 50d;
        } else if ( cantidadDePaquetes < 10) {
            costo = 80d;
        } else {
            costo = cantidadDePaquetes * 15d;
        }
        if (this.listaEnvios.size() >= 10){
            costo = costo + costo * 0.1;
        }
        return costo;
    }

    public Transporte asignacionVehiculo(Envio envio) throws Exception {
        Double pesoTotalEnvio = envio.pesoTodal();

        if (pesoTotalEnvio < 5.0){
            return new Transporte("Bicicleta");
        } else if (pesoTotalEnvio < 50.0){
            return new Transporte("Auto");
        } else if (pesoTotalEnvio < 150.0){
            return new Transporte("Camioneta");
        } else {
            throw new Exception("Envíos de más de 150 kilos no será posible asignar un vehículo");
        }
    }

    public List<Envio> getListaEnvios() {
        return listaEnvios;
    }

    public void setListaEnvios(List<Envio> listaEnvios) {
        this.listaEnvios = listaEnvios;
    }
}
