public class Empresa {
  private String cnpj;
  private String nome;

  public Empresa(String cnpj, String nome) {
    this.cnpj = cnpj;
    this.nome = nome;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }
}