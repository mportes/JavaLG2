public class Main {
  public static void main(String[] args) {
    Funcionario f1 = new Funcionario("Carlos");
    Funcionario f2 = new Funcionario("Juliana");
    Funcionario f3 = new Funcionario("Adriano");
    Funcionario f4 = new Funcionario("Marcela");
    Funcionario f5 = new Funcionario("Vivian");
    Funcionario f6 = new Funcionario("Celian");
    Funcionario f7 = new Funcionario("Leonardo");

    f1.addSubordinado(f2);
    f1.addSubordinado(f3);
    f1.addSubordinado(f4);
    f1.addSubordinado(f5);
    f1.addSubordinado(f6);

    //f1.addSubordinado(f7);

    for(Funcionario f : f1.getSubordinados()){
      System.out.println(f.getNome());
    }

    System.out.println("\nNúmero de subordinados do funcionário f1: " + f1.getQuantidadeSubordinados());
  }
}