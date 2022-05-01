import java.time.LocalDate;

public abstract class Conta {
  private int numero;
  private LocalDate dataAbertura;
  protected double saldo;
  protected double tarifa;
  private Correntista correntista;

  public Conta(int numero, double tarifa, Correntista correntista) {
    this.numero = numero;
    this.dataAbertura = LocalDate.now();
    this.saldo = 0.0;
    this.tarifa = tarifa;
    this.correntista = correntista;
    this.correntista.addConta(this);
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

  public abstract double calcularTarifa();

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