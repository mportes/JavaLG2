public class Main {
  public static void main(String[] args) {
    Circulo c = new Circulo();
    try {
      c.setRaio(3);
      System.out.println("Círculos\nRaio do c: " + c.getRaio() + "\n---------------");
    } catch(IllegalArgumentException ex) {
      System.out.println(ex.getMessage());
    }

    Quadrado q = new Quadrado(); 
    try {
      q.setLado(8);
      System.out.println("Quadrados\nLado do q: " + q.getLado() + "\n---------------");
    } catch(IllegalArgumentException ex) {
      System.out.println(ex.getMessage());
    }

    Retangulo r = new Retangulo();
    try{
      r.setBase(4);
      r.setAltura(7);
      System.out.println("Retângulos\nBase do r: " + r.getBase() + "\nAltura do r: " + r.getAltura() + "\n---------------");
    } catch(IllegalArgumentException ex) {
      System.out.println(ex.getMessage());
    }

    Conta ct = new Conta(1, 213.50, 50.00);
    try {
      ct.setCodigo(1);
      ct.setSaldo(213.50);
      ct.setLimite(50.00);
      System.out.println("Contas\nCódigo da ct: " + ct.getCodigo() + "\nSaldo da ct: " + ct.getSaldo() + "\nLimite da ct: " + ct.getLimite() + "\n---------------");
    } catch(IllegalArgumentException ex) {
      System.out.println(ex.getMessage());
    }    
  }
}