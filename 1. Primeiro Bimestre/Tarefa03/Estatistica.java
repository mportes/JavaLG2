class Estatistica {
  public static double calcularMedia(double[] valores) {
    double soma = 0.0;
    for(double valor : valores) {
      soma += valor;
    }
    return soma / valores.length;
  }

  public static double menor(double[] notas){
    double menorNota = notas[0];
    for(int i = 1; i<notas.length; ++i){
      if(notas[i]<menorNota)
      menorNota = notas[i];
    }
    return menorNota;
  }

  public static double maior(double[] notas){
   double maiorNota = notas[0];
   for(int i = 1; i<notas.length; ++i){
     if(notas[i]>maiorNota)
     maiorNota = notas[i];
   }
   return maiorNota;
  }
}