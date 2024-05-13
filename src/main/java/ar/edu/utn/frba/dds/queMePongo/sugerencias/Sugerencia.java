package ar.edu.utn.frba.dds.queMePongo.sugerencias;

import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;

public class Sugerencia {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda prendaCalzado;

  public Sugerencia(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaCalzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.prendaCalzado = prendaCalzado;
  }
}
