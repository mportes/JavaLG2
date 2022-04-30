public class Aluno {
  private String prontuario;
  private String nome;

  public Aluno() {
    prontuario = "";
    nome = "";
  }

  public Aluno(String prontuario, String nome) {
    this.setProntuario(prontuario);
    this.setNome(nome);
  }

  public void setProntuario(String prontuario) {
    if(prontuario.toLowerCase().startsWith("sp")){
      if(prontuario.length()==8){
        this.prontuario = prontuario;
      } else{
        throw new IllegalArgumentException("");
      }
    } else {
      throw new IllegalArgumentException("");
    }
  }

  public String getProntuario() {
    return prontuario;
  }

  public void setNome(String nome) {
    if(nome.length() >= 5 && nome.length() <= 100){
      if(nome.replaceAll(" ", "").isEmpty()){
        throw new IllegalArgumentException("");
      } else {
        this.nome = nome;
      }
    } else {
      throw new IllegalArgumentException("");
    }
  }

  public String getNome() {
    return nome;
  }
}