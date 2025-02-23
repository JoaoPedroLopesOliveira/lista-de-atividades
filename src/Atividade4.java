import java.util.Random;
import java.util.Scanner;

public class Atividade4 {
    public void executar() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("informe o tamanho do vetor aleatorio: ");
        int v[] = new int[scanner.nextInt()];
        int procurar;



        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(10000);
        }
        quickSort(v, 0, v.length - 1);
        System.out.println("informe o valor a ser procurado no vetor");
        procurar = scanner.nextInt();
        if (buscaBiniaria(v, procurar, 0, v.length - 1)) {
            System.out.println("O numero: " + procurar + " esta dentro do vetor");
        } else {
            System.out.println("O numero: " + procurar + " não esta dentro do vetor");
        }
    }

    public boolean buscaBiniaria(int v[], int procurar, int inicio, int fim) {
        if (inicio > fim || procurar < v[inicio] || procurar > v[fim]) {
            return false;
        }

        int meio = (inicio + fim) / 2;
        if (procurar == v[meio]) {
            return true;
        } else if (procurar < v[meio]) {
            return buscaBiniaria(v, procurar, inicio, meio - 1);
        } else {
            return buscaBiniaria(v, procurar, meio + 1, fim);
        }
    }

    public void quickSort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    public static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1;
        int f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
