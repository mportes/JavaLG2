public class Pessoa {
  protected String prontuario;
  protected String nome;

  public Pessoa(String prontuario, String nome) {
    this.prontuario = prontuario;
    this.nome = nome;
  }

  public void setProntuario(String prontuario) {
    this.prontuario = prontuario;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getProntuario() {
    return prontuario;
  }

  public String getNome() {
    return nome;
  }
}