import java.time.LocalDate;

public class ContaCorrente extends Conta {
  private double limite;

  public ContaCorrente(int numero, double tarifa, double limite, Correntista correntista) {
    super(numero, tarifa, correntista);
    this.limite = limite;
  }

  public void sacar(double valor) {
    if(valor > (saldo + limite)) {
      throw new IllegalArgumentException("O valor ultrapassa o limite");
    }

    saldo -= valor;
  }

  public double calcularTarifa() {
    return this.tarifa * 1.5;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public double getLimite() {
    return limite;
  }
}