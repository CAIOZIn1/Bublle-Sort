public class Exercíco03 {
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
    int[] vetorCopyOrder = new int[TAM_VALUE_ARRAY];
    int[] vetorCopyOrder2 = new int[TAM_VALUE_ARRAY];
    int aux, replacementCount = 0, aux2 = 0;
    boolean found = false;

    for (int i = 0; i < vetor.length; i++){
      vetor[i] = (int) (Math.random() * 101);
    }

    printVetor(vetor, "Vetor sem ordem: ");

    vetorCopyOrder = vetor;
    for (int i = 1; i < vetorCopyOrder.length; i++){
      for (int j = 0; j < vetorCopyOrder.length-1; j++){
        if(vetorCopyOrder[j] > vetorCopyOrder[i]){
          aux = vetorCopyOrder[j];
          vetorCopyOrder[j] = vetorCopyOrder[i];
          vetorCopyOrder[i] = aux;
          replacementCount++;
        }
      }
    }

    System.out.println("");
    printVetor(vetor, "Vetor com ordem: ");
    System.out.printf("Quantidade de trocas: %d", replacementCount);

    vetorCopyOrder2 = vetor;
    replacementCount = 0;
    for (int i = 1; i < vetorCopyOrder2.length; i++){
      for (int k = 0; k < vetorCopyOrder2.length-1; k++){
        if(vetorCopyOrder2[k] > vetorCopyOrder2[i]){
          aux = vetorCopyOrder2[k];
          vetorCopyOrder2[k] = vetorCopyOrder2[i];
          vetorCopyOrder2[i] = aux;
          replacementCount++;
        }
      }

      for(int k = 0; k < replacementCount; k++){
        aux2 = k;
        for(int j = 1; j < vetorCopyOrder2.length; ++j) {
          if(vetorCopyOrder2[j] < vetorCopyOrder2[aux2]) {
            found = false;
            break;
          }
          found = true;
          aux2++;
        }

        if(!found) break;
      }

      if(found) break;
    }

    System.out.println("");
    System.out.println("");
    printVetor(vetor, "Vetor com ordem elinando sequências desnecessárias: ");
    System.out.printf("Quantidade de trocas: %d", replacementCount);

  }
}
