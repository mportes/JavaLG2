import java.util.Arrays;

public class Fila<T> implements FilaInterface<T> {
  private T[] elementos;
  private int tamanho;

  public Fila(int capacidade) {
    elementos = (T[]) new Object[capacidade];
    tamanho = 0;
  }

  private void aumentarCapacidade() {
    if(tamanho == elementos.length) {
      T[] elementosNovos = (T[]) new Object[elementos.length*2];
      for(int i = 0; i < tamanho; i++) {
        elementosNovos[i] = elementos[i];
      }
      elementos = elementosNovos;
    }
  }
  
  @Override
  public void enfileirar(T elemento){
    aumentarCapacidade();
    elementos[tamanho] = elemento;
    tamanho++;
  }

  @Override
  public T desenfileirar(){
    T retorno = primeiro();
    for (int i = 0; i < tamanho; i++) {
      elementos[i] = elementos[i+1];
    }
    tamanho--;
    return retorno;
  }

  @Override
  public T primeiro(){
    if(vazia()) {
      throw new RuntimeException("Pilha vazia");
    }
    return elementos[0];
  }

  @Override
  public int tamanho(){
    return tamanho;
  }

  @Override
  public boolean vazia(){
    return tamanho == 0;
  }

  @Override
  public String toString() {
    return Arrays.toString(elementos);
  }
}