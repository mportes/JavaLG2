public class Main {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.codigo = 1;
    c1.saldo = 0.0;
    c1.limite = 25.00;

    Conta c2 = new Conta();
    c2.codigo = 2;
    c2.saldo = 100.00;
    c2.limite = 80.00;

    if(c1.depositar(120.00)){
      System.out.println("Operação efetuada com sucesso!");
      System.out.println(c1.consultarSaldo());
      System.out.println("--------------");
    } else {
      System.out.println("A operação não pode ser efetuada!");
      System.out.println("--------------");
    }
    
    if(c2.depositar(50.50)){
      System.out.println("Operação efetuada com sucesso!");
      System.out.println(c2.consultarSaldo());
      System.out.println("--------------");
    } else {
      System.out.println("A operação não pode ser efetuada!");
      System.out.println("--------------");
    }

    if(c1.sacar(320.00)){
      System.out.println("Operação efetuada com sucesso!");
      System.out.println(c1.consultarSaldo());
      System.out.println("--------------");
    } else {
      System.out.println("A operação não pode ser efetuada!");
      System.out.println("--------------");
    }
    
    if(c2.sacar(200.00)){
      System.out.println("Operação efetuada com sucesso!");
      System.out.println(c2.consultarSaldo());
      System.out.println("--------------");
    } else {
      System.out.println("A operação não pode ser efetuada!");
      System.out.println("--------------");
    }
    
    if(c1.transferir(c2, 1000.00)){
      System.out.println("Operação efetuada com sucesso!");
      System.out.println(c1.consultarSaldo());
      System.out.println("--------------");
    } else {
      System.out.println("A operação não pode ser efetuada!");
      System.out.println("--------------");
    }
    
    if(c1.transferir(c2, 30.00)){
      System.out.println("Operação efetuada com sucesso!");
      System.out.println(c2.consultarSaldo());
      System.out.println("--------------");
    } else {
      System.out.println("A operação não pode ser efetuada!");
      System.out.println("--------------");
    }
  }
}