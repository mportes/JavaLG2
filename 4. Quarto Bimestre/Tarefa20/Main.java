public class Main {
  public static void main(String[] args) {
    ListaEncadeada<String> le = new ListaEncadeada<String>();
    le.adicionarFim("Matheus");
    le.adicionarFim("Maria");
    le.adicionarFim("Selma");
    le.adicionarFim("Kleber");
    le.adicionarFim("Henrique");
    
    System.out.println("---------------------");
    System.out.println(le.buscar(0));
    System.out.println(le.buscar(1));
    System.out.println(le.buscar(2));
    System.out.println(le.buscar(3));
    System.out.println(le.buscar(4));
    System.out.println("---------------------");
    le.adicionar(2, "João");
    System.out.println(le.buscar(0));
    System.out.println(le.buscar(1));
    System.out.println(le.buscar(2));
    System.out.println(le.buscar(3));
    System.out.println(le.buscar(4));
    System.out.println(le.buscar(5));
  }
}