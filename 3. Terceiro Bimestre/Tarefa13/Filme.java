import java.util.List;
import java.util.ArrayList;

public class Filme {
  private String titulo;
  private int ano;
  private List<Papel> papeis;

  public Filme(String titulo, int ano) {
    this.titulo = titulo;
    this.ano = ano;
    this.papeis = new ArrayList<>();
  }

  public void addPapel(Papel papel) {
    papeis.add(papel);
  }

  public String getTitulo() {
    return titulo;
  }

  public int getAno() {
    return ano;
  }
  
  public List<Papel> getPapeis() {
    return papeis;
  }
}