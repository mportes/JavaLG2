import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com o número de elementos:");
    int qtde = sc.nextInt();

    int[] n = new int[qtde];

    System.out.println("Entre com o número 1:");
    n[0] = sc.nextInt();
    int maior = n[0], menor = n[0];

    for(int i=1; i<qtde; i++){
      System.out.println("Entre com o número " + (i+1) + ":");
      n[i] = sc.nextInt();

      if (n[i]>maior){
        maior = n[i];
      }

      if(n[i]<menor){
        menor = n[i];
      }
    }

    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);
    
    sc.close();
  }
}