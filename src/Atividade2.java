import java.util.Random;
public class Atividade2 {
    public void executar(){
        int [] v = new int[100];
        int [] v2 = new int [50];
        int fim = v.length-1;
        Random random = new Random();
        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(0,100);
        }

        int menor = v[0];
        int posicaomenor = 0;

        for (int i = 0; i < v.length; i++) {
            soma += v[i];
            if (menor > v[i] ){
                posicaomenor = i;
            }
            if(i < v2.length){
                v2[i] = v[i]+v[fim];
                fim--;
            }
            if(i == v.length-1){
                System.out.println("posição do menor valor: " + posicaomenor);
                System.out.println("soma dos valores = " + soma);
            }
        }
    }
}
