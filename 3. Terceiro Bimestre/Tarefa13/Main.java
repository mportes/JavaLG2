class Main {
  public static void main(String[] args) {
    Ator a1 = new Ator("Meryl Streep");
    Ator a2 = new Ator("Anne Hathaway");
    Ator a3 = new Ator("Emily Blunt");
    Ator a4 = new Ator("Mia Wasikowska");
    Ator a5 = new Ator("Helena Bonham Carter");

    Filme f1 = new Filme("O Diabo Veste Prada", 2006);
    Filme f2 = new Filme("Alice no País das Maravilhas", 2010);

    Papel p1 = new Papel("Miranda Priestly", a1, f1);
    Papel p2 = new Papel("Andrea Sachs", a2, f1);
    Papel p3 = new Papel("Rainha Branca", a2, f2);
    Papel p4 = new Papel("Alice", a4, f2);
    Papel p5 = new Papel("Rainha Vermelha", a5, f2);

    a1.addPapel(p1);
    a2.addPapel(p2);
    a2.addPapel(p3);
    a4.addPapel(p4);
    a5.addPapel(p5);

    f1.addPapel(p1);
    f1.addPapel(p2);
    f2.addPapel(p3);
    f2.addPapel(p4);
    f2.addPapel(p5);
  }
}