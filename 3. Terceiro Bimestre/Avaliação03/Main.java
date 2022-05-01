public class Main {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("SP305878X", "Isabel", true);
    Aluno a2 = new Aluno("SP9876548", "Pedro", false);
    Professor p1 = new Professor("SP505040", "Cláudia", "Matemática");

    Curso c1 = new Curso("Informática", "INF");
    
    Projeto pj1 = new Projeto("Sistema de banco", true, c1);
    pj1.adicionarParticipante(a1);
    pj1.adicionarParticipante(p1);
    pj1.setAtivo(false);
    //pj1.adicionarParticipante(a2);
    System.out.println(pj1.getNumeroParticipantes());

    Professor p2 = new Professor("SP852477", "Leonardo", "Química");
    Professor p3 = new Professor("SP654753", "Juliana", "História");
    Aluno a3 = new Aluno("SP8794300", "Marcos", true);

    Projeto pj2 = new Projeto("Rede social", true, c1);
    pj2.adicionarParticipante(p2);
    pj2.adicionarParticipante(p3);
    pj2.adicionarParticipante(a3);
    System.out.println(pj2.getNumeroParticipantes());

    c1.adicionarProjeto(pj1);
    c1.adicionarProjeto(pj2);
    System.out.println(c1.getNumeroProjetos());
    System.out.println(c1.getNumeroProjetosAtivos());

    for(Projeto p : c1.getProjetosAtivos()) {
      System.out.println(p.getTitulo());
    }
  }
}