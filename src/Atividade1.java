import java.util.Scanner;

public class Atividade1 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] vresultante = new int[10];

        for (int i = 0; i < v1.length; i++) {
            System.out.println("informe o " + (i+1) + " numero de primeiro vetor: ");
            v1[i] = scanner.nextInt();
        }
        for (int i = 0; i < v2.length; i++) {
            System.out.println("informe o " + (i+1) + " numero de segundo vetor: ");
            v2[i] = scanner.nextInt();
        }

        for (int i = 0; i < v1.length; i++) {
            vresultante[i] = (v1[i] + v2[i])/2;
        }
        System.out.println("o vetor resultante é:");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(vresultante[i] + "\t");
        }
    }

}
