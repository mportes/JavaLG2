public class Papel {
  private String nome;
  private Ator ator;
  private Filme filme;

  public Papel(String nome, Ator ator, Filme filme) {
    this.nome = nome;
    this.ator = ator;
    this.filme = filme;
  }

  public String getNome() {
    return nome;
  }

  public Ator getAtor() {
    return ator;
  }

  public Filme getFilme() {
    return filme;
  }
}