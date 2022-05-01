public class ListaEncadeada<T> implements ListaEncadeadaInterface<T> {
  private No<T> cabeca;
  private No<T> cauda;
  private int tamanho;

  public ListaEncadeada() {
    cabeca = new No<>(null, null, null);
    cauda = new No<>(cabeca, null, null);
    cabeca.setProximo(cauda);
    tamanho = 0;
  }

  @Override
  public void adicionarInicio(T elemento) {
    adicionarEntre(elemento, cabeca, cabeca.getProximo());
  }

  @Override
  public void adicionarFim(T elemento) {
    adicionarEntre(elemento, cauda.getAnterior(), cauda);
  }

  @Override
  public void removerInicio() {
    if(vazia()) throw new RuntimeException("Lista vazia");
    remover(cabeca.getProximo());
  }

  @Override
  public void removerFim() {
    if(vazia()) throw new RuntimeException("Lista vazia");
    remover(cauda.getAnterior());
  }

  @Override
  public T primeiro() {
    if(vazia()) throw new RuntimeException("Lista vazia");
    return cabeca.getProximo().getElemento();
  }

  @Override
  public T ultimo() {
    if(vazia()) throw new RuntimeException("Lista vazia");
    return cauda.getAnterior().getElemento();
  }

  @Override
  public T buscar(int posicao) {
    if(vazia()) throw new RuntimeException("Lista vazia");
    if(posicao >= tamanho || posicao < 0) throw new RuntimeException("Posição inválida");
    No<T> ant = cabeca.getProximo();
    for(int i = 0; i < posicao; i++) {
      ant = ant.getProximo();
    }
    return ant.getElemento();
  }

  @Override
  public void adicionar(int posicao, T elemento) {
    if(posicao >= tamanho || posicao <= 0) throw new RuntimeException("Posição inválida");
    // coloquei o 0 como inválido porque já existe o método adicionarInicio;
    No<T> ant = cabeca.getProximo();
    for(int i = 0; i < posicao - 1; i++) {
      ant = ant.getProximo();
    }
    adicionarEntre(elemento, ant, ant.getProximo());
  }

  @Override
  public int tamanho() {
    return tamanho;
  }

  @Override
  public boolean vazia() {
    return tamanho == 0;
  }

  private void adicionarEntre(T elemento, No<T> anterior, No<T> proximo) {
    No<T> no = new No<>(anterior, elemento, proximo);
    anterior.setProximo(no);
    proximo.setAnterior(no);
    tamanho++;
  }

  private void remover(No<T> no) {
    No<T> anterior = no.getAnterior();
    No<T> proximo = no.getProximo();
    anterior.setProximo(proximo);
    proximo.setAnterior(anterior);
    tamanho--;
  }
}