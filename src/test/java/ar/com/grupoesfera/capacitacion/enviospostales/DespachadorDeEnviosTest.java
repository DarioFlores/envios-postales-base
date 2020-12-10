package ar.com.grupoesfera.capacitacion.enviospostales;

import org.junit.Test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.assertThat;


public class DespachadorDeEnviosTest {

    private Envio envio;
    private Double costo;
    private DespachadorDeEnvios despachador = new DespachadorDeEnvios();

    @Test
    public void conMenosDe5PaquetesElCostoDebeSer50(){
        dadoQueTengoUnEnvioConUnaCantidadDePaquetes(3);

        cuandoCalculoElCosto();

        entoncesVerificoQueElCostoEs(50d);
    }

    @Test
    public void conMenosDe10PaquetesElCostoDebeSer80(){
        dadoQueTengoUnEnvioConUnaCantidadDePaquetes(8);

        cuandoCalculoElCosto();

        entoncesVerificoQueElCostoEs(80d);
    }

    private void dadoQueTengoUnEnvioConUnaCantidadDePaquetes(Integer cantidadDePaquetes) {
        envio = mock(Envio.class);
        doReturn(cantidadDePaquetes).when(envio).getCantidadDePaquetes();
    }

    private void cuandoCalculoElCosto() {
        costo = despachador.calcularCosto(envio);
    }

    private void entoncesVerificoQueElCostoEs(Double costoEsperado) {
        assertThat(costo).isEqualTo(costoEsperado);
    }
}
