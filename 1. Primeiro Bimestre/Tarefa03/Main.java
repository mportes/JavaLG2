// javac Main.java
// java Main "Joao da Silva" 10.0 9.5 9.5 7.5
// java Main "Maria dos Santos" 7.0 6.5 10.0

class Main {
  public static void main(String[] args) {
    
    String nome = args[0];
 
    double notas[] = new double[args.length - 1];

    for(int i=0; i<args.length-1; ++i){
      notas[i] = Double.parseDouble(args[i+1]);
    }

    double media = Estatistica.calcularMedia(notas);
    double menorNota = Estatistica.menor(notas);
    double maiorNota = Estatistica.maior(notas);

    exibirNota(media, menorNota, maiorNota, nome);
  }

  // "João da Silva tem média 9.5"
  public static void exibirNota(double nota, double menorNota, double maiorNota, String nome) {
    System.out.println(String.format("%s tem média %.2f", nome, nota));
    System.out.println("A menor nota do aluno: "+ menorNota);
    System.out.println("A menor nota do aluno: "+ maiorNota);
  }

}