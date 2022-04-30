public class Retangulo {
  private int base;
  private int altura;

  public Retangulo() {
    base = 0;
    altura = 0;
  }

  public Retangulo(int base, int altura) {
    this.setBase(base);
    this.setAltura(altura);
  }

  public void setBase(int base) {
    if(base <= 0){
      throw new IllegalArgumentException("A base tem que ser maior que 0.\n---------------");
    } else{
      this.base = base;
    }
  }

  public int getBase() {
    return base;
  }

  public void setAltura(int altura) {
    if(altura <= 0){
      throw new IllegalArgumentException("A altura tem que ser maior que 0.\n---------------");
    } else{
      this.altura = altura;
    }
  }

  public int getAltura() {
    return altura;
  }

  public int calcularArea() {
    return base * altura;
  }

  public int calcularPerimetro() {
    return 2 * (base+altura);
  }
}