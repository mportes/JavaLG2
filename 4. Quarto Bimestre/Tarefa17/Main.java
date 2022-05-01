public class Main {
  public static void main(String[] args) {
    Vetor v1 = new Vetor(5);
    v1.adicionar("1");
    v1.adicionar("2");
    v1.adicionar("4");
    v1.adicionar("5");
    v1.adicionar("5");
    v1.adicionar("6");
    System.out.println(v1.tamanho());
    System.out.println(v1);

    v1.adicionar(2, "3");
    System.out.println(v1);

    v1.remover(4);
    System.out.println(v1);

    System.out.println(v1.buscar("4"));
    System.out.println(v1.buscar(0));

    System.out.println("-------------------------------");
    
    VetorInt vi1 = new VetorInt(5);
    vi1.adicionar(1);
    vi1.adicionar(2);
    vi1.adicionar(4);
    vi1.adicionar(5);
    vi1.adicionar(5);
    vi1.adicionar(6);
    System.out.println(vi1.tamanho());
    System.out.println(vi1);

    vi1.adicionar(2, 3);
    System.out.println(vi1);

    vi1.remover(4);
    System.out.println(vi1);

    System.out.println(vi1.buscarPorElemento(4));
    System.out.println(vi1.buscarPorPosicao(0));

    //Deve lançar uma RuntimeException:
    System.out.println(vi1.buscarPorPosicao(15));
  }
}