import java.util.List;
import java.util.ArrayList;

public class Curso {
  private String nome;
  private String sigla;
  private List<Projeto> projetos;

  public Curso(String nome, String sigla) {
    this.nome = nome;
    this.sigla = sigla;
    this.projetos = new ArrayList<>();
  }

  public void adicionarProjeto(Projeto projeto) {
    this.projetos.add(projeto);
  }

  public int getNumeroProjetos() {
    return projetos.size();
  }

  public List<Projeto> getProjetosAtivos() {
    List<Projeto> projetosAtivos = new ArrayList<>();

    for(Projeto p : projetos) {
      if(p.getAtivo()) {
        projetosAtivos.add(p);
      }
    }

    return projetosAtivos;
  }

  public int getNumeroProjetosAtivos() {
    return this.getProjetosAtivos().size();
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  public String getSigla() {
    return sigla;
  }
}