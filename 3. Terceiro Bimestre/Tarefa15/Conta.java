import java.time.LocalDate;

public class Conta {
  private int numero;
  private LocalDate dataAbertura;
  protected double saldo;
  protected double tarifa;
  private Correntista correntista;

  public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
    this.numero = numero;
    this.dataAbertura = dataAbertura;
    this.saldo = saldo;
    this.tarifa = tarifa;
    this.correntista = correntista;
  }

  public void sacar(double valor) {
    if(valor <= 0) {
      throw new IllegalArgumentException("Você só pode sacar valores positivos");
    }
    if(valor > saldo) {
      throw new IllegalArgumentException("Valor indisponível na conta");
    }

    saldo -= valor;
  }

  public void depositar(double valor) {
    if(valor <= 0) {
      throw new IllegalArgumentException("Você só pode depositar valores positivos");
    }

    saldo += valor;
  }

  public double calcularTarifa() {
    return tarifa;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public LocalDate getDataAbertura() {
    return dataAbertura;
  }

  public void setDataAbertura(LocalDate dataAbertura) {
    this.dataAbertura = dataAbertura;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void setTarifa(double tarifa) {
    this.tarifa = tarifa;
  }

  public Correntista getCorrentista() {
    return correntista;
  }

  public void setCorrentista(Correntista correntista) {
    this.correntista = correntista;
  }
}