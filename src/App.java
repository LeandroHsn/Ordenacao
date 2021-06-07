public class App {
    public static void main(String[] args) throws Exception {

        /* 1) Faça um algoritmo recursivo que implemente a sequência fibonacci; */

        System.out.println("***************** Exercicio 1 *****************\n");

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + Fibonacci.fibonacci(i));
        }

        /*
         * 2) Para os algoritmos de ordenação faça alterações nos algoritmos insertion
         * sort, selection sort e bubble sort, para que o programa contempla o envio de
         * duas variáveis indicando as posições inicial e final do vetor que desejo
         * ordenar Deve realizar as devidas alteração na implementação e seus devidos
         * testes;
         */

        System.out.println("\n\n***************** Exercicio 2 *****************\n");

        /*
         * 3) Para o algoritmo quicksort desenvolvido durante a aula, faça as seguintes
         * alterações: a. Implemente o método particiona e coloque no seu escopo toda a
         * lógica referente ao particionamento;
         * 
         * b. Pesquisa e altere o código do quicksort para que a escolha no pivô seja
         * através do cálculo da mediana;
         */

        System.out.println("\n***************** Exercicio 3 *****************\n");

        int[] vetorNormal = { 3, 5, 7, 1, 6, 2, 8, 9, 4, 10 };
        Ordenacao.quickSortRecursivo(vetorNormal, 0, vetorNormal.length - 1);

        System.out.print("Exercicio 3(a): ");
        for (int i : vetorNormal) {
            System.out.print(i + " ");
        }

        int[] vetorMediana = { 3, 5, 7, 1, 6, 2, 8, 9, 4, 10 };
        Ordenacao.quickSortRecursivoMediana(vetorMediana, 0, vetorMediana.length - 1);

        System.out.print("\nExercicio 3(b): ");
        for (int i : vetorMediana) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
         * 4) Para o algoritmo mergesort implemente a alterações que possibilite o
         * algoritmo ordenar deste número inteiros até objetos; (dica pesquise sobre a
         * interface Comparable);
         */

        System.out.println("\n***************** Exercicio 4 *****************\n");

        Comparable[] vetorMerge = { 3, 5, 7, 1, 6, 2, 8, 9, 4, 10 };

        Ordenacao.mergeSort(vetorMerge, 0, vetorMerge.length - 1);
        
        System.out.print("Exercicio 4: ");
        for (int i = vetorMerge.length - 1; i >= 0; i--) {
            System.out.print(vetorMerge[i] + " ");
        }
        
        System.out.println("\n\n***********************************************");

    }
}
