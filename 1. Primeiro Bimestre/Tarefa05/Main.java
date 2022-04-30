class Main {
  public static void main(String[] args) {
    int[] numeros = {4, 7, 8, 2, 11, 3, 9, 1};
    int[] numeros2 = {9, 14, 23, 17, 2, 15, 1, 18};
    int[] numerosOrdenados = Ordenacao.bubbleSort(numeros);
    int[] numeros2Ordenados = Ordenacao.insertionSort(numeros2);

    VetorUtil.imprimirVetor(numeros);
    VetorUtil.imprimirVetor(numerosOrdenados);
    VetorUtil.imprimirVetor(numeros2);
    VetorUtil.imprimirVetor(numeros2Ordenados);
  }
}