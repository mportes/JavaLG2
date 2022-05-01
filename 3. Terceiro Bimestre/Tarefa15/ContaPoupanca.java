import java.time.LocalDate;

public class ContaPoupanca extends Conta {
  private LocalDate aniversario;

  public ContaPoupanca(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, LocalDate aniversario) {
    super(numero, dataAbertura, saldo, tarifa, correntista);
    this.aniversario = aniversario;
  }

  public double calcularTarifa() {
    this.tarifa = 3.0;
    return tarifa;
  }

  public void setAniversario(LocalDate aniversario) {
    this.aniversario = aniversario;
  }

  public LocalDate getAniversario() {
    return aniversario;
  }
}