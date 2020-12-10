package ar.com.grupoesfera.capacitacion.enviospostales;

public class DespachadorDeEnvios {
    public Double calcularCosto(Envio envio) {
        int cantidadDePaquetes = envio.getCantidadDePaquetes();
        if ( cantidadDePaquetes < 5){
            return 50d;
        } else if ( cantidadDePaquetes < 10) {
            return 80d;
        }
        return null;
    }
}
