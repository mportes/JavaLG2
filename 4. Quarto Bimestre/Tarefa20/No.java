public class No<T> {
  private T elemento;
  private No<T> proximo;

  public No(T elemento, No<T> proximo) {
    this.elemento = elemento;
    this.proximo = proximo;
  }

  public void setElemento(T elemento) {
    this.elemento = elemento;
  }

  public void setProximo(No<T> proximo) {
    this.proximo = proximo;
  }

  public T getElemento() {
    return elemento;
  }

  public No<T> getProximo() {
    return proximo;
  }
}