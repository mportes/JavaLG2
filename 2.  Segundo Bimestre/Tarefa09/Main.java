public class Main {
  public static void main(String[] args) {
    Circulo c1 = new Circulo(8);
    Circulo c2 = new Circulo(5);
    System.out.println("Círculos\nRaio do c1: " + c1.raio + "\nRaio do c2: " + c2.raio + "\n---------------");

    Quadrado q1 = new Quadrado(2);
    Quadrado q2 = new Quadrado(6);
    System.out.println("Quadrados\nLado do q1: " + q1.lado + "\nLado do q2: " + q2.lado + "\n---------------");

    Retangulo r1 = new Retangulo(3, 7);
    Retangulo r2 = new Retangulo(9, 4);
    System.out.println("Retângulos\nBase do r1: " + r1.base + "\nAltura do r1: " + r1.altura + "\n\nBase do r2: " + r2.base + "\nAltura do r2: " + r2.altura + "\n---------------");

    Conta ct1 = new Conta(1, 213.50, 50.00);
    Conta ct2 = new Conta(2, 3589.00, 100.00);
    System.out.println("Contas\nCódigo da ct1: " + ct1.codigo + "\nSaldo da ct1: " + ct1.saldo + "\nLimite da ct1: " + ct1.limite + "\n\nCódigo da ct2: " + ct2.codigo + "\nSaldo da ct2: " + ct2.saldo + "\nLimite da ct2: " + ct2.limite + "\n---------------");
  }
}