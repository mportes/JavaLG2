public class Conta {
  private int codigo;
  private double saldo;
  private double limite;

  public Conta() {
    codigo = 0;
    saldo = 0.0;
    limite = 0.0;
  }
  
  public Conta(int codigo, double saldo, double limite) {
    this.setCodigo(codigo);
    this.setSaldo(saldo);
    this.setLimite(limite);
  }

  public void setCodigo(int codigo) {
    if(codigo <= 0){
      throw new IllegalArgumentException("O código deve ser um número maior que 0.\n---------------");
    } else{
      this.codigo = codigo;
    }
  }

  public int getCodigo() {
    return codigo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setLimite(double limite) {
    if(limite <= 0){
      throw new IllegalArgumentException("O limite deve ser dado em número positivo.\n---------------");
    } else{
      this.limite = limite;
    }
  }

  public double getLimite() {
    return limite;
  }

  public String consultarSaldo() {
    return "Conta: " + codigo + "\nSaldo: " + saldo;
  }

  public boolean depositar(double valor) {
    saldo = saldo + valor;
    return true;
  }

  public boolean sacar(double valor) {
    if(saldo + limite >= valor) {
      saldo = saldo - valor;
      return true;
    }
    else {
      return false;
    }
  }

  public boolean transferir(Conta conta, double valor) {
    if(saldo + limite >= valor) {
      saldo = saldo - valor;
      conta.saldo = conta.saldo + valor;
      return true;
    }
    else {
      return false;
    }
  }
}