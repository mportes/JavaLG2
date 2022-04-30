public class Quadrado {
  private int lado;

  public Quadrado() {
    lado = 0;
  }

  public Quadrado(int lado) {
    this.setLado(lado);
  }

  public void setLado(int lado) {
    if(lado<=0){
      throw new IllegalArgumentException("O lado deve ser maior que zero.\n---------------");
    }
    else{
      this.lado = lado;
    }
  }

  public int getLado() {
    return lado;
  }

  public int calcularArea() {
    return lado * lado;
  }

  public int calcularPerimetro() {
    return 4 * lado;
  }
}