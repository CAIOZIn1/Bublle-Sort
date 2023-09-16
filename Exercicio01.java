public class Exercicio01{
  public static void main(String[] args) {
    final int TAM_VALUE_ARRAY = 10;
    int[] vetor = new int[TAM_VALUE_ARRAY];
    int aux;

    for (int i = 0; i < vetor.length; i++){
      vetor[i] = (int) (Math.random() * 101);
    }

    for (int i = 1; i < vetor.length; i++){
      for (int j = 0; j < vetor.length-1; j++){
        if(vetor[j] > vetor[i]){
          aux = vetor[j];
          vetor[j] = vetor[i];
          vetor[i] = aux;
        }
      }
    }

    for(int i = 0; i < vetor.length; i++){
      System.out.printf("%d | ", vetor[i]);
    }
  }
}
