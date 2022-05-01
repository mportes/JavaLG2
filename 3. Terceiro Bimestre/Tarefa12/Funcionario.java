import java.util.List;
import java.util.ArrayList;

public class Funcionario {
  private String nome;
  private List<Funcionario> subordinados;

  public Funcionario(String nome) {
    this.nome = nome;
    this.subordinados = new ArrayList<>();
  }

  public void addSubordinado(Funcionario funcionario) {
    if(subordinados.size()==5){
      throw new IllegalArgumentException("O limite de cinco subordinados já foi atingido!");
    }
    this.subordinados.add(funcionario);
  }

  public List<Funcionario> getSubordinados() {
    return subordinados;
  }

  public boolean isChefe() {
    return subordinados.size() > 0;
  }

  public String getNome() {
    return nome;
  }

  public Integer getQuantidadeSubordinados() {
    return subordinados.size();
  }
}