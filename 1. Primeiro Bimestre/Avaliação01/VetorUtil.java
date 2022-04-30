class VetorUtil{
  public static int quantidadeNoVetor(int[] vetor, int numeroBuscado){
    int quantidade=0;
    for(int i = 0; i < vetor.length; ++i){
      if(vetor[i]==numeroBuscado){
        ++quantidade;
      }
    }
    return quantidade;
  }

  public static int[] somaDeVetores(int[] vetor1, int[] vetor2){
    int vetorFinal[] = new int[vetor1.length];
    for(int i = 0; i < vetor1.length; ++i){
      vetorFinal[i] = vetor1[i] + vetor2[i];
    }
    return vetorFinal;
  }

  public static int[] inversaoDeVetor(int[] vetor){
    int i = 0, j = (vetor.length-1);
    int vetorFinal[] = new int[vetor.length];
    while(i < vetor.length){
      vetorFinal[i] = vetor[j];
      ++i;
      --j;
    }
    return vetorFinal;
  }
}