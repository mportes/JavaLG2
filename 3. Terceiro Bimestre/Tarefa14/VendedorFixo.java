public class VendedorFixo extends Vendedor {
  private double salario;

  public VendedorFixo() {
    super();
    this.salario = 0.0;
  }

  public VendedorFixo(String nome, double vendas, double comissao, double salario) {
    super(nome, vendas, comissao);
    this.salario = salario;
  }

  public double calcularSalario() {
    return salario + (vendas * (comissao/100));
  }

  public double getSalario() {
    return salario;
  }
  
  public void setSalario(double salario) {
    this.salario = salario;
  }
}