import java.util.List;
import java.util.ArrayList;

public class Ator {
  private String nome;
  private List<Papel> papeis;

  public Ator(String nome) {
    this.nome = nome;
    this.papeis = new ArrayList<>();
  }

  public void addPapel(Papel papel) {
    papeis.add(papel);
  }

  public String getNome() {
    return nome;
  }

  public List<Papel> getPapeis() {
    return papeis;
  }
}