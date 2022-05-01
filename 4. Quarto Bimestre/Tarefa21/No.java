public class No<T> {
  private No<T> anterior;
  private T elemento;
  private No<T> proximo;

  public No(No<T> anterior, T elemento, No<T> proximo) {
    this.anterior = anterior;
    this.elemento = elemento;
    this.proximo = proximo;
  }

  public void setAnterior(No<T> anterior) {
    this.anterior = anterior;
  }

  public void setElemento(T elemento) {
    this.elemento = elemento;
  }

  public void setProximo(No<T> proximo) {
    this.proximo = proximo;
  }
  
  public No<T> getAnterior() {
    return anterior;
  }

  public T getElemento() {
    return elemento;
  }

  public No<T> getProximo() {
    return proximo;
  }
}