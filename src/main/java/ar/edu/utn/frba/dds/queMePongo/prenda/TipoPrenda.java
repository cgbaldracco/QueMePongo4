package ar.edu.utn.frba.dds.queMePongo.prenda;

public class TipoPrenda {
  private Categoria categoria;

  public TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public static TipoPrenda REMERA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  public static TipoPrenda PANTALON = new TipoPrenda(Categoria.PARTE_INFERIOR);
  public static TipoPrenda BUZO = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  public static TipoPrenda CAMPERA = new TipoPrenda(Categoria.ABRIGO);
  public static TipoPrenda ZAPATOS = new TipoPrenda(Categoria.CALZADO);
  public static TipoPrenda ZAPATILLAS = new TipoPrenda(Categoria.CALZADO);
  public static TipoPrenda BLUSA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  public static TipoPrenda SHORT = new TipoPrenda(Categoria.PARTE_INFERIOR);
  public static TipoPrenda MALLA = new TipoPrenda(Categoria.PARTE_INFERIOR);
  public static TipoPrenda SANDALIAS = new TipoPrenda(Categoria.CALZADO);
  public static TipoPrenda AROS = new TipoPrenda(Categoria.ACCESORIO);
  public static TipoPrenda CHOMBA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  public static TipoPrenda CAMISA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  public static TipoPrenda PANTALON_DE_VESTIR = new TipoPrenda(Categoria.CALZADO);

  public Categoria obtenerCategoria() {
    return this.categoria;
  }

}