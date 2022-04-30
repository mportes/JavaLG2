import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com o número de notas:");
    int qtdeNotas = sc.nextInt();

    float[] notas = new float[qtdeNotas];
    float media = 0;

    for(int i=0; i<qtdeNotas; i++){
      System.out.println("Entre com a nota " + (i+1) + ":");
      notas[i] = sc.nextFloat();

      media += notas[i];
    }

    media /= qtdeNotas;

    System.out.println("Média: " + media);

    sc.close();
  }
}