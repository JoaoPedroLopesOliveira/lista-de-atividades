import java.util.Random;

public class Atividade5 {
    public void executar(){
        int contadorquickaleatorio[] = {0};
        int contadorquickDecresente[] = {0};
        int aleatorio [] = new int[100];
        int decresente [] = new int [100];
        int copiavetor [] = new int [100];
        for (int i = 0; i < decresente.length; i++) {
            decresente [i] = decresente.length -i;
        }
        Random random = new Random(10);
        for (int i = 0; i < aleatorio.length; i++){
            aleatorio[i] = random.nextInt(100);
        }
        copiavetor = aleatorio;
        selectionSort(copiavetor, 0,0);
        copiavetor = decresente;
        selectionSort(copiavetor, 0,0);
        copiavetor = aleatorio;
        quickSort(copiavetor,aleatorio.length-1, 0, contadorquickaleatorio);
        copiavetor = decresente;
        quickSort(copiavetor,decresente.length-1, 0, contadorquickDecresente);
    }

    public int selectionSort(int vetor[], int inicio, int contador){
        int n = vetor.length -1;
        if (inicio >= n-1){
            return contador;
        }
        for (int i = inicio + 1; i < n; i++) {
            if (vetor [i] < vetor [inicio]){
                int temp = vetor[i];
                vetor[i] = vetor [inicio];
                vetor[inicio] = temp;
                contador++;
            }
        }
        return selectionSort(vetor, inicio+1, contador);
    }
    public void quickSort(int vetor[], int inicio, int fim, int [] contador){
        separaQuick(vetor, inicio, fim, contador);
    }
    public static int separaQuick(int vetor[], int inicio, int fim, int [] contador){
        int pivo = vetor[fim];
        int i = inicio+1;
        int f = fim;
        while (i <= f){
            if(vetor[i] <= pivo){
                i++;
            }else if (pivo < vetor[f]){
                f--;
            }
            else {
                int troca = vetor[i];
                vetor [i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
                contador[0]++;
            }
        }
        vetor[inicio] = vetor[f];
        vetor [f] = pivo;
        return f;
    }
}
