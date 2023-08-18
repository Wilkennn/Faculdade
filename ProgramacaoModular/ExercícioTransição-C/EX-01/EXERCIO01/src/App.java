import java.util.Scanner;

/******************************************************************************

Elabore um programa que preencha com 10 elementos do tipo inteiro em um vetor A. Crie um vetor 
ParImpar de 2 posições e armazene no índice 0 quantos elementos de A são par e no índice 1 quantos elementos de A são ímpar. 
Ao final, imprima o vetor ParImpar.

*******************************************************************************/
public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Preenchendo o Vetor
    int vetorNumerico[] = new int[5];
    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o valor: ");
      vetorNumerico[i] = scanner.nextInt();
    }

    scanner.close();

    //Calculando o Fatorial
    int vetorNumericoFatorial[] = new int[5];

    for (int i = 0; i < 5; i++) {
      int tempFatorial = 1;
      for (int j = 1; j <= vetorNumerico[i]; j++) { // Correção: j++ em vez de i++
        tempFatorial *= j;
      }
      vetorNumericoFatorial[i] = tempFatorial;
    }

    //Exibindo vetor
    for(int i = 0; i < 5; i++){
      System.out.println(vetorNumericoFatorial[i]);
    }
  }
}
