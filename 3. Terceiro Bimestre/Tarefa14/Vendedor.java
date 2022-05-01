public class Vendedor {
  protected String nome;
  protected double vendas;
  protected double comissao;

  public Vendedor() {
    this.nome = "";
    this.vendas = 0.0;
    this.comissao = 0.0;
  }

  public Vendedor(String nome, double vendas, double comissao) {
    this.nome = nome;
    this.vendas = vendas;
    this.comissao = comissao;
  }

  public double calcularSalario() {
    return vendas * (comissao/100);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getVendas() {
    return vendas;
  }

  public void setVendas(double vendas) {
    this.vendas = vendas;
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }
}