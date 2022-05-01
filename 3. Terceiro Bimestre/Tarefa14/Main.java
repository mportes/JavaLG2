class Main {
  public static void main(String[] args) {
    Vendedor v1 = new Vendedor("Gustavo", 8000.0, 10.0);
    VendedorFixo v2 = new VendedorFixo("Júlia", 10000.0, 15.0, 1280.0);

    System.out.println(v1.calcularSalario());
    System.out.println(v2.calcularSalario());
  }
}