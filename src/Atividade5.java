import java.util.Random;

public class Atividade5 {
    public void executar() {
        int [] aleatorio = new int[100];
        int [] decrescente = new int[100];
        int [] contadorQuick = {0};

        randomizaVetor(aleatorio);
        System.out.println("Selection Sort trocou no aleatório: " + selectionSort(aleatorio.clone(), 0, 0));

        geraDecrescente(decrescente);
        System.out.println("Selection Sort trocou no decrescente: " + selectionSort(decrescente.clone(), 0, 0));

        quickSort(aleatorio.clone(), 0, aleatorio.length - 1, contadorQuick);
        System.out.println("Quick Sort trocou no aleatório: " + contadorQuick[0]);

        contadorQuick[0] = 0;
        quickSort(decrescente.clone(), 0, decrescente.length - 1, contadorQuick);
        System.out.println("Quick Sort trocou no decrescente: " + contadorQuick[0]);
    }

    public void randomizaVetor(int [] vetor) {
        Random random = new Random(42);
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1000);
        }
    }

    public void geraDecrescente(int [] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor.length - i;
        }
    }


    public int selectionSort(int [] vetor, int inicio, int contador) {
        int n = vetor.length;
        if (inicio >= n - 1) {
            return contador;
        }

        for (int i = inicio + 1; i < n; i++) {
            if (vetor[i] < vetor[inicio]) {
                int temp = vetor[i];
                vetor[i] = vetor[inicio];
                vetor[inicio] = temp;
                contador++;
            }
        }
        return selectionSort(vetor, inicio + 1, contador);
    }


    public void quickSort(int [] vetor, int inicio, int fim, int [] contador) {
        if (inicio < fim) {
            int pivoIndex = separaQuick(vetor, inicio, fim, contador);
            quickSort(vetor, inicio, pivoIndex - 1, contador);
            quickSort(vetor, pivoIndex + 1, fim, contador);
        }
    }


    public static int separaQuick(int [] vetor, int inicio, int fim, int[] contador) {
        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] < pivo) {
                i++;
                trocar(vetor, i, j);
                contador[0]++;
            }
        }

        trocar(vetor, i + 1, fim);
        contador[0]++;
        return i + 1;
    }


    public static void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
