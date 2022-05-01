public class Main {
  public static void main(String[] args) {
    Vetor vetor1 = new Vetor(2);
    System.out.println(vetor1);
    vetor1.adicionar("Belchior");
    System.out.println(vetor1);
    vetor1.adicionar("Elis");
    System.out.println(vetor1);

    //String cantor1 = vetor1.buscar(0);
    String cantor1 = (String) vetor1.buscar(0);
    System.out.println(cantor1);    
  }
}