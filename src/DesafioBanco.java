import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {

        String nome = "Gabriel Simões";
        String tipoConta = "Corrente";
        double saldoAtual = 2500;
        double valorRecebido;
        double valorTransferir;
        int op = 0;

        Scanner leituraDados = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("Dados iniciais do cliente: \n");

        System.out.println("Nome:           "+nome);
        System.out.println("Tipo conta:     "+tipoConta);
        System.out.println("Saldo inicial:  R$ "+saldoAtual);
        System.out.println("********************************\n");

        while(op != 4 ){

            System.out.println("\nOperações \n");
            System.out.println("""
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);

            System.out.println("Digite a opção desejada: \n");
            op = leituraDados.nextInt();

            if(op == 1) {
                System.out.println("O saldo atual é R$ " + saldoAtual);

            } else if (op == 2){
                System.out.println("Informe o valor a receber: ");
                valorRecebido = leituraDados.nextDouble();

                saldoAtual += valorRecebido;
                System.out.println("Saldo atualizado R$ "+saldoAtual);
            } else if (op == 3){
                System.out.println("Informe o valor que deseja transferir: ");
                valorTransferir = leituraDados.nextDouble();

                if(valorTransferir > saldoAtual){
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                }else {
                    saldoAtual -= valorTransferir;
                    System.out.println("Saldo atualizado R$ "+saldoAtual);
                }
            } else if (op == 4){
                System.out.println("Processo Finalizado!!");
            }
            else{
                System.out.println("Opção Inválida!");
            }
        }
    }
}
