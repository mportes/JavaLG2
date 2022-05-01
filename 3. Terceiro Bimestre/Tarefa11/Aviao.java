import java.util.List;
import java.util.ArrayList;

public class Aviao {
  private Integer numero;
  private Double pesoMaximo;
  private List<Carga> cargas;

  public Aviao(Integer numero, Double pesoMaximo) {
    this.cargas = new ArrayList<>();
    this.numero = numero;
    this.pesoMaximo = pesoMaximo;
  }

  public Integer getNumero() {
    return numero;
  }

  public Double getPesoMaximo() {
    return pesoMaximo;
  }

  public void adicionarCarga(Carga carga) {
    if(carga.getPeso() > this.getTotalDisponivel()){
      throw new IllegalArgumentException("A adição desta carga ultrapassa o peso máximo do avião!");
    }

    cargas.add(carga);
  }

  public Double getTotalPeso() {
    Double total = 0.0;
    for(Carga carga: cargas) {
      total += carga.getPeso();
    }

    return total;
  }

  public Double getTotalDisponivel() {
    return pesoMaximo - getTotalPeso();
  }
}