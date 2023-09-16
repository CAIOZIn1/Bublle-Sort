public class Exercício02 {
  public static void printVetor(int[] vetor, String phraseString){
    System.out.println(phraseString);
    for(int i = 0; i < vetor.length; i++){
      System.out.printf("%d | ", vetor[i]);
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    final int TAM_VALUE_ARRAY = 10;
    int[] vetor = new int[TAM_VALUE_ARRAY];
    int aux, replacementCount = 0;

    for (int i = 0; i < vetor.length; i++){
      vetor[i] = (int) (Math.random() * 101);
    }

    printVetor(vetor, "Vetor sem ordem: ");

    for (int i = 1; i < vetor.length; i++){
      for (int j = 0; j < vetor.length-1; j++){
        if(vetor[j] > vetor[i]){
          aux = vetor[j];
          vetor[j] = vetor[i];
          vetor[i] = aux;
          replacementCount++;
        }
      }
    }

    System.out.println("");
    printVetor(vetor, "Vetor com ordem: ");
    System.out.printf("Quantidade de trocas: %d", replacementCount);
  }
}
