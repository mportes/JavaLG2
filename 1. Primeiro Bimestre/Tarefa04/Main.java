class Main {
  public static void main(String[] args) {
    int[] numeros = {1, 4, 5, 7, 9, 11, 15};
    int numero = 15;
    String[] nomes = {"Ana", "Josefa", "Maria", "Natália", "Susana", "Zélia"};
    String nome = "Susana";

    int posicaoEncontradaNome = buscaBinariaNome(nome, nomes);
    int posicaoEncontradaNumero = buscaBinariaNumero(numero, numeros);

    if(posicaoEncontradaNumero>=0){
      System.out.println("Número encontrado na posição " + posicaoEncontradaNumero + " do vetor");
    }
    else{
      System.out.println("Número não encontrado!");
    }

    if(posicaoEncontradaNome>=0){
      System.out.println("Nome encontrado na posição " + posicaoEncontradaNome + " do vetor");
    }
    else{
      System.out.println("Nome não encontrado!");
    }
  }

  public static int buscaBinariaNumero(int elemento, int[] elementos) {
    int inicio = 0;
    int fim = elementos.length - 1;
    int meio;

    while(inicio <= fim) {
      meio = (int) (inicio + fim) / 2;

      if(elemento == elementos[meio]) {
        return meio;
      } else if(elemento > elementos[meio]) {
        inicio = meio + 1;
      } else {
        fim = meio -1;
      }
    }

    return -1;
  }

  public static int buscaBinariaNome(String busca, String[] itens) {
    int inicio = 0;
    int fim = itens.length - 1;
    int meio;

    while(inicio <= fim) {
      meio = (int) (inicio + fim) / 2;

      if(itens[meio].compareTo(busca)==0) {
        return meio;
      } else if(itens[meio].compareTo(busca)<0) {
        inicio = meio + 1;
      } else {
        fim = meio -1;
      }
    }

    return -1;
  }
}