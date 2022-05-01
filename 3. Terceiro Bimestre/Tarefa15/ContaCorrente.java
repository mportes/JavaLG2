import java.time.LocalDate;

public class ContaCorrente extends Conta {
  private double limite;

  public ContaCorrente(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, double limite) {
    super(numero, dataAbertura, saldo, tarifa, correntista);
    this.limite = limite;
  }

  public void sacar(double valor) {
    if(valor > (saldo + limite)) {
      throw new IllegalArgumentException("O valor ultrapassa o limite");
    }

    saldo -= valor;
  }

  public double calcularTarifa() {
    this.tarifa = 5.0;
    return tarifa;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public double getLimite() {
    return limite;
  }
}