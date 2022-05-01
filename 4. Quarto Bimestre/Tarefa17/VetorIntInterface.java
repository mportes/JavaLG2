public interface VetorIntInterface {
  public void adicionar(int elemento);
  public void adicionar(int posicao, int elemento);
  public void remover(int posicao);
  public int buscarPorPosicao(int posicao);
  public int buscarPorElemento(int elemento);
  public int tamanho();
}