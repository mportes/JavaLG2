import java.time.LocalDate;

public class ContaSalario extends Conta {
  private Empresa empresa;

  public ContaSalario(int numero, double tarifa, Empresa empresa, Correntista correntista) {
    super(numero, tarifa, correntista);
    this.empresa = empresa;
  }

  public double calcularTarifa() {
    return 0.0;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  public Empresa getEmpresa() {
    return empresa;
  }
}