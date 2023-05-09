import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {

    public static void main(String[] args) {

        /*
        Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e
        pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve
        informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
         */

        int numeroUsuario;
        int numeroAleatorio = new Random().nextInt(100);

        Scanner leitura = new Scanner(System.in);

        //System.out.println("---- NN: " + numeroAleatorio);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número entre 0 e 100:");
            numeroUsuario = leitura.nextInt();

            if (numeroUsuario == numeroAleatorio){
                System.out.println("Parabéns você acertou o número!!");
                break;
            }

            if (numeroUsuario > numeroAleatorio){
                System.out.println("O número digitado pelo usuário é maior que o número gerado!");
            }else {
                System.out.println("O número digitado pelo usuário é menor que o número gerado!");
            }

            System.out.println("** TENTATIVAS: "+i);

            if (i == 5){
                System.out.println("Não foi dessa vez! Tente Novamente!!");
            }
        }

    }
}
