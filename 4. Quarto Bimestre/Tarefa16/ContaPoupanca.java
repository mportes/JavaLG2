import java.time.LocalDate;

public class ContaPoupanca extends Conta {
  private LocalDate aniversario;

  public ContaPoupanca(int numero, double tarifa, LocalDate aniversario, Correntista correntista) {
    super(numero, tarifa, correntista);
    this.aniversario = aniversario;
  }

  public double calcularTarifa() {
    return this.tarifa;
  }

  public void setAniversario(LocalDate aniversario) {
    this.aniversario = aniversario;
  }

  public LocalDate getAniversario() {
    return aniversario;
  }
}