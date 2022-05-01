public class Aluno extends Pessoa {
  private boolean matriculado;

  public Aluno(String prontuario, String nome, boolean matriculado) {
    super(prontuario, nome);
    this.matriculado = matriculado;
  }

  public void setMatriculado(boolean matriculado) {
    this.matriculado = matriculado;
  }

  public boolean getMatriculado() {
    return matriculado;
  }
}