import java.util.Scanner;

public class Atividade3 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        int pares[] = new int[5];
        int impares[] = new int[5];
        int digitado;
        int contadorpar = 0;
        int contadorimpar = 0;
        for (int i = 0; i < (pares.length + impares.length); i++) {
            System.out.println("informe o " + (i + 1) + " dos " + (pares.length + impares.length) + " numeros: ");
            digitado = scanner.nextInt();
            try {
                if (digitado % 2 == 0) {
                    if (contadorpar < pares.length) {
                        pares[contadorpar] = digitado;
                        contadorpar++;
                    } else {
                        throw new ArrayIndexOutOfBoundsException("O vetor de numeros pares ja esta cheio!");
                    }
                } else {
                    if (contadorimpar < impares.length) {
                        impares[contadorimpar] = digitado;
                        contadorimpar++;
                    } else {
                        throw new ArrayIndexOutOfBoundsException("O vetor de números ímpares já está cheio!");
                    }
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Por favor, insira outro tipo de numero: ");
                i--;
            }
        }
        System.out.println("\nnumeros pares digitados: ");
        for (int num:pares){
            System.out.printf(num + "\t");
        }

        System.out.println("\nnumeros impares digitados: ");
        for (int num:impares){
            System.out.printf(num + "\t");
        }
    }
}