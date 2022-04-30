class Ordenacao{
  public static int[] bubbleSort(int[] vetor) {
    vetor = VetorUtil.copiar(vetor);

    int aux;
    
    for(int i = 0; i < vetor.length; i++) {
      for(int j = 0; j < vetor.length - 1; j++) {
        if(vetor[j] > vetor[j+1]) {
          aux = vetor[j];
          vetor[j] = vetor[j+1];
          vetor[j+1] = aux;
        }
      }
    }

    return vetor;
  }

  public static int[] insertionSort(int[] array){
    array = VetorUtil.copiar(array);

    int aux, j;

    for(int i=1; i<array.length; ++i){
      j=i;
      while(j>0){
        if(array[j] < array[j-1]){
          aux = array[j];
          array[j] = array[j-1];
          array[j-1] = aux;
        }
        --j;
      }
    }
    return array;
  }
}