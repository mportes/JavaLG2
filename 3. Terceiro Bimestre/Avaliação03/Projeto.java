import java.util.List;
import java.util.ArrayList;

public class Projeto {
  private String titulo;
  private boolean ativo;
  private Curso curso;
  private List<Pessoa> participantes;

  public Projeto(String titulo, boolean ativo, Curso curso) {
    this.titulo = titulo;
    this.ativo = ativo;
    this.curso = curso;
    this.participantes = new ArrayList<>();
  }

  public void adicionarParticipante(Pessoa pessoa) {
    if(ativo == false) {
      throw new RuntimeException("Não é possível adicionar participante em um projeto não ativo");
    }

    this.participantes.add(pessoa);  
  }

  public int getNumeroParticipantes() {
    return participantes.size();
  }

  public List<Pessoa> getParticipantes() {
    return participantes;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAtivo(boolean ativo) {
    this.ativo = ativo;
  }

  public boolean getAtivo() {
    return ativo;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public Curso getCurso() {
    return curso;
  }
 }