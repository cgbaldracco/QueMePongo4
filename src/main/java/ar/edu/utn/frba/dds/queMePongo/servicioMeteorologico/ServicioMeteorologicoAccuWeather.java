package ar.edu.utn.frba.dds.queMePongo.servicioMeteorologico;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {
  private final AccuWeatherAPI api;
  private final Duration periodoDeValidez;
  private Map<String, RespuestaMeteorologica> ultimasRespuestas;

  public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, Duration periodoDeValidez) {
    this.api = api;
    this.periodoDeValidez = periodoDeValidez;
    this.ultimasRespuestas = new HashMap<>();
  }

  public EstadoDelTiempo obtenerCondicionesClimaticas(String direccion) {
    if (!this.ultimasRespuestas.containsKey(direccion) || this.ultimasRespuestas.get(direccion).expiro()) {
      ultimasRespuestas.put(direccion, this.consultarApi(direccion));
    }
    return this.ultimasRespuestas.get(direccion).estadoDelTiempo();
  }

  private LocalDateTime proximaExpiracion() {
    return LocalDateTime.now().plus(this.periodoDeValidez);
  }

  private RespuestaMeteorologica consultarApi(String direccion) {
    Map<String, Object> weather = this.api.getWeather(direccion).get(0);
    Map<String, Object> temperatura = (Map<String, Object>) weather.get("Temperature");
    return new RespuestaMeteorologica(
        new EstadoDelTiempo(
            (BigDecimal) temperatura.get("Value")),
        this.proximaExpiracion());
  }
}
