public class Main {
  public static void main(String[] args) {
    Vetor<String> vetor1 = new Vetor<>(2);
    System.out.println(vetor1);
    vetor1.adicionar("Belchior");
    System.out.println(vetor1);
    vetor1.adicionar("Elis");
    System.out.println(vetor1);
    //vetor1.adicionar(8);

    String cantor1 = vetor1.buscar(0);
    System.out.println(cantor1);    

    if(vetor1.contem("Tom Jobim")) {
      System.out.println("Cantor encontrado");
    } else {
      System.out.println("Cantor não encontrado.");
    }
  }
}