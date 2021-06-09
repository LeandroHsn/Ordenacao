public class Ordenacao {

    // algoritmo de inserção
    public static void insertionSort(int[] vet, int posicaoFinal, int posicaoInicial) {
        int i, j, chave = 0;
        for (i = posicaoFinal; i < posicaoInicial; i++) {
            chave = vet[i];
            j = i - 1;
            // vet[0] = x;
            while ((j > -1) && (chave < vet[j])) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = chave;
        }
    }

    public static void selectionSort(int[] vet, int posicaoFinal, int posicaoInicial) {
        int i, j, min, chave = 0;
        for (i = posicaoFinal; i <= posicaoInicial; i++) {
            min = i;
            for (j = i + 1; j <= vet.length - 1; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                }
            }
            chave = vet[min];
            vet[min] = vet[i];
            vet[i] = chave;
        }

    }

    public static void bubbleSort(int[] vet, int posicaoFinal, int posicaoInicial) {
        int i, j, chave = 0;
        int tam = vet.length - 1;
        for (i = posicaoFinal; i < posicaoInicial; i++) {
            for (j = tam; j > i; j--) {
                if (vet[j] < vet[i]) {
                    chave = vet[i];
                    vet[i] = vet[j];
                    vet[j] = chave;
                }
            }
        }
    }

    public static void quickSort(int[] vet, int esq, int dir) {
        int pivo = esq, i, chave, j = 0;
        // partição
        for (i = esq + 1; i <= dir; i++) {
            j = i;
            if (vet[j] < vet[pivo]) {
                chave = vet[j];
                while (j > pivo) {
                    vet[j] = vet[j - 1];
                    j--;
                }
                vet[j] = chave;
                pivo++;
            }
        }
        if (pivo - 1 >= esq) {
            quickSort(vet, esq, pivo - 1);
        }
        if (pivo + 1 <= dir) {
            quickSort(vet, pivo + 1, dir);
        }
    }

    // GitHub: HenriqueIni
    // https://www.blogcyberini.com/
    public static void mergeSort(int vet[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2; // calcula o meio
            mergeSort(vet, inicio, meio); // ordena do subvetor esquerdo
            mergeSort(vet, meio + 1, fim); // ordena do subvetor direito
            merge(vet, inicio, meio, fim); // funde os subvetores esquerdo e direito
        }
    }

    private static void merge(int vet[], int inicio, int meio, int fim) {
        int tamEsq = meio - inicio + 1; // tamanho do subvetor esquerdo
        int tamDir = fim - meio; // tamanho do subvetor direito
        int esq[] = new int[tamEsq]; // subvetor auxiliar esquerdo
        int dir[] = new int[tamDir]; // subvetor auxiliar direito
        int idxEsq = 0; // índice do subvetor auxiliar esquerdo
        int idxDir = 0; // índice do subvetor auxiliar direito

        // Copia os elementos do subvetor esquerdo para o vetor auxiliar
        for (int i = 0; i < tamEsq; i++) {
            esq[i] = vet[inicio + i];
        }
        // Copia os elementos do subvetor direito para o vetor auxiliar
        for (int j = 0; j < tamDir; j++) {
            dir[j] = vet[meio + 1 + j];
        }

        // intercala os subvetores
        for (int k = inicio; k <= fim; k++) {
            if (idxEsq < tamEsq) {
                if (idxDir < tamDir) {
                    if (esq[idxEsq] < dir[idxDir]) {
                        vet[k] = esq[idxEsq++];
                    } else {
                        vet[k] = dir[idxDir++];
                    }
                } else {
                    vet[k] = esq[idxEsq++];
                }
            } else {
                vet[k] = dir[idxDir++];
            }
        }
    }

    public static void mergeSort(Comparable[] vet, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2; // calcula o meio
            mergeSort(vet, inicio, meio); // ordena do subvetor esquerdo
            mergeSort(vet, meio + 1, fim); // ordena do subvetor direito
            merge(vet, inicio, meio, fim); // funde os subvetores esquerdo e direito
        }
    }  
    
    private static void merge(Comparable[] items, int start, int mid, int end) {
        Comparable[] temp = new Comparable[items.length];
        int pos1 = start;
        int pos2 = mid + 1;
        int spot = start;
    
        while (!(pos1 > mid && pos2 > end)) {
            if ((pos1 > mid) || (pos2 <= end) && (items[pos2].compareTo(items[pos1]) > 0)) {
                temp[spot] = items[pos2];
                pos2 += 1;
            } else {
                temp[spot] = items[pos1];
                pos1 += 1;
            }
            spot += 1;
        }
        for (int i = start; i <= end; i++) {
            items[i] = temp[i];
        }
    }  

    // Exercício 3

    public static void quickSortRecursivo(int vet[], int esq, int dir) {
        if (esq < dir) {
            int posicaoPivo = particiona(vet, esq, dir);
            quickSort(vet, esq, posicaoPivo - 1);
            quickSort(vet, posicaoPivo + 1, dir);
        }
    }

    public static int particiona(int[] vet, int esq, int dir) {
        int pivo = esq, i, chave, j = 0;
        for (i = esq + 1; i <= dir; i++) {
            j = i;
            if (vet[j] < vet[pivo]) {
                chave = vet[j];
                while (j > pivo) {
                    vet[j] = vet[j - 1];
                    j--;
                }
                vet[j] = chave;
                pivo++;
            }
        }
        return 0;
    }

    // 3 (b)

    public static void quickSortRecursivoMediana(int vet[], int esq, int dir) {
        if (esq < dir) {
            int posicaoPivo = particionaMediana(vet, esq, dir);
            quickSort(vet, esq, posicaoPivo - 1);
            quickSort(vet, posicaoPivo + 1, dir);
        }
    }

    private static int particionaMediana(int[] A, int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        int a = A[inicio];
        int b = A[meio];
        int c = A[fim];
        int medianaIndice;
        if (a < b) {
            if (b < c) {
                medianaIndice = meio;
            } else {
                if (a < c) {
                    medianaIndice = fim;
                } else {
                    medianaIndice = inicio;
                }
            }
        } else {
            if (c < b) {
                medianaIndice = meio;
            } else {
                if (c < a) {
                    medianaIndice = fim;
                } else {
                    medianaIndice = inicio;
                }
            }
        }
        swap(A, medianaIndice, fim);
        int pivo = A[fim];
        int i = inicio - 1;
        for (int j = inicio; j <= fim - 1; j++) {
            if (A[j] <= pivo) {
                i = i + 1;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, fim);
        return i + 1;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}