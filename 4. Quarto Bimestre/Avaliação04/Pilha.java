import java.util.Arrays;

public class Pilha<T> implements PilhaInterface<T> {
  private T[] elementos;
  private int tamanho;

  public Pilha(int capacidade) {
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
  public void empilha(T elemento){
    aumentarCapacidade();
    elementos[tamanho] = elemento;
    tamanho++;
  }

  @Override
  public T desempilha(){
    T retorno = topo();
    tamanho--;
    elementos[tamanho] = null;
    return retorno;
  }

  @Override
  public T topo(){
    if(vazia()) {
      throw new RuntimeException("Pilha vazia");
    }
    return elementos[tamanho-1];
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