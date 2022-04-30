class Main {
  public static void main(String[] args) { 
    int[] numeros = {2, 7, 1, 4, 8, 15, 3};
    int soma1 = somaIterativa(numeros);
    int soma2 = somaRecursiva(numeros, numeros.length);

    System.out.println("Resultado pelo método somaIterativa: " + soma1 + "\nResultado pelo método somaRecursiva: " + soma2);
  }

  public static int somaRecursiva(int[] numeros, int contador) {
    if(contador==1){
      return numeros[contador-1];
    }
    return numeros[contador-1] + somaRecursiva(numeros, contador-1); 
  }

  public static int somaIterativa(int[] numeros) {
    int soma = 0;
    for(int i=0; i<numeros.length; i++){
      soma += numeros[i];
    }

    return soma;
  }
}