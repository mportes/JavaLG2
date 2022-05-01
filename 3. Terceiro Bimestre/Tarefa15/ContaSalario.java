import java.time.LocalDate;

public class ContaSalario extends Conta {
  private Empresa empresa;

  public ContaSalario(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, Empresa empresa) {
    super(numero, dataAbertura, saldo, tarifa, correntista);
    this.empresa = empresa;
  }

  public double calcularTarifa() {
    this.tarifa = 0.0;
    return tarifa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  public Empresa getEmpresa() {
    return empresa;
  }
}