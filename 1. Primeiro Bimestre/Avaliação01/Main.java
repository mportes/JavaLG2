class Main {
  public static void main(String[] args) {
    int[] vetorBusca = {3, 8, 10, 1, 3, 9, 15, 23, 3, 5, 3};
    int numeroBuscado = 3;
    int quantidadeNoVetor = VetorUtil.quantidadeNoVetor(vetorBusca, numeroBuscado);
    System.out.println("Vetor:");
    for(int i = 0; i < vetorBusca.length; ++i){
      System.out.println(vetorBusca[i]);
    }
    System.out.println("Número buscado: " + numeroBuscado + "\nQuantidade de vezes encontrado: " + quantidadeNoVetor);
    
    int[] vetorSoma1 = {9, 3, 6, 14};
    int[] vetorSoma2 = {6, 12, 9, 1};
    int[] vetorResultados = VetorUtil.somaDeVetores(vetorSoma1, vetorSoma2);
    System.out.println("\n----------------------------------\n\nVetor 1:");
    for(int i = 0; i < vetorSoma1.length; ++i){
      System.out.println(vetorSoma1[i]);
    }
    System.out.println("\nVetor 2:");
    for(int i = 0; i < vetorSoma2.length; ++i){
      System.out.println(vetorSoma2[i]);
    }
    System.out.println("\nSoma dos vetores:");
    for(int i = 0; i < vetorResultados.length; ++i){
      System.out.println(vetorResultados[i]);
    }

    int[] vetorInversao = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] vetorInvertido = VetorUtil.inversaoDeVetor(vetorInversao);
    System.out.println("\n----------------------------------\n\nVetor (sem inversão):");
    for(int i = 0; i < vetorInversao.length; ++i){
      System.out.println(vetorInversao[i]);
    }
    System.out.println("\nVetor invertido:");
    for(int i = 0; i < vetorInvertido.length; ++i){
      System.out.println(vetorInvertido[i]);
    }
  }
}