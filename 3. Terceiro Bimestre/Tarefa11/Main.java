public class Main {
  public static void main(String[] args) {
    Carga c1 = new Carga(1, 400.0);
    Carga c2 = new Carga(2, 200.0);
    Carga c3 = new Carga(3, 200.0);
    Carga c4 = new Carga(4, 500.0);

    Aviao a1 = new Aviao(1, 1000.0);

    System.out.println("---------------");
    a1.adicionarCarga(c1);
    System.out.println(a1.getTotalPeso());
    System.out.println(a1.getTotalDisponivel());

    System.out.println("---------------");
    a1.adicionarCarga(c2);
    System.out.println(a1.getTotalPeso());
    System.out.println(a1.getTotalDisponivel());

    System.out.println("---------------");
    a1.adicionarCarga(c3);
    System.out.println(a1.getTotalPeso());
    System.out.println(a1.getTotalDisponivel());

    System.out.println("---------------");
    a1.adicionarCarga(c4);
    System.out.println(a1.getTotalPeso());
    System.out.println(a1.getTotalDisponivel());
  }
}