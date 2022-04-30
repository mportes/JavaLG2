public class Circulo {
  private int raio;

  public Circulo() {
    raio = 0;
  }

  public Circulo(int raio) {
    this.setRaio(raio);
  }

  public void setRaio(int raio) {
    if(raio<=0){
      throw new IllegalArgumentException("O valor do raio deve ser maior que zero.\n---------------");
    }
    else{
      this.raio = raio;
    }
  }

  public int getRaio() {
    return raio;
  }

  public double calcularArea() {
    return Math.PI * raio * raio;
  }

  public double calcularPerimetro() {
    return 2 * Math.PI * raio;
  }
}