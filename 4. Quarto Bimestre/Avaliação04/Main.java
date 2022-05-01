public class Main {
  public static void main(String[] args) {
    Pilha<Integer> p1 = new Pilha<Integer>(3);
    // p1.desempilha();
    p1.empilha(2);
    p1.empilha(59);
    p1.empilha(28);
    p1.empilha(5);
    p1.empilha(40);
    System.out.println(p1.toString());
    System.out.println("Tamanho: " + p1.tamanho());
    System.out.println("Desempilhando: " + p1.desempilha());
    System.out.println("Desempilhando: " + p1.desempilha());
    System.out.println(p1.toString());
    System.out.println("Tamanho: " + p1.tamanho());
    System.out.println("Elemento no topo: " + p1.topo());
    System.out.println("---------------------------");
  
    Fila<Integer> f1 = new Fila<Integer>(3);
    // f1.desenfileirar();
    f1.enfileirar(2);
    f1.enfileirar(59);
    f1.enfileirar(28);
    f1.enfileirar(5);
    f1.enfileirar(40);
    System.out.println(f1.toString());
    System.out.println("Tamanho: " + f1.tamanho());
    System.out.println("Desenfileirando: " + f1.desenfileirar());
    System.out.println("Desenfileirando: " + f1.desenfileirar());
    System.out.println(f1.toString());
    System.out.println("Tamanho: " + f1.tamanho());
    System.out.println("Primeiro elemento: " + f1.primeiro());
    System.out.println("---------------------------");
  }
}