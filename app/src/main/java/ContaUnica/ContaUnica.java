package ContaUnica;
import java.util.Scanner;

public class ContaUnica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aux;
        int opcao;
        double valor; // Correção do tipo de variável

        System.out.println("Digite o titular da conta: ");
        aux = in.nextLine();

        Conta conta = new Conta(aux); // Usando a instância conta

        // Definindo o CPF para a instância conta
        System.out.println("Digite o CPF: ");
        String cpf = in.nextLine();
        conta.setCpf(cpf);
        
        do {
            System.out.println("--- Menu ---");
            System.out.println("1) Dados Bancários");
            System.out.println("2) Depósito");
            System.out.println("3) Saque");
            System.out.println("0) Sair");

            System.out.print("Opção:  ");
            opcao = in.nextInt();

            if(opcao == 1) {
                conta.DadosBancarios(); // Usando a instância conta
            } else if(opcao == 2) {
                System.out.println("Digite o Valor do Depósito");
                valor = in.nextDouble();

                conta.Depositar(valor); // Usando a instância conta
            } else if(opcao == 3) {
                System.out.println("Digite o Valor do Saque");
                valor = in.nextDouble();

                conta.Sacar(valor); // Usando a instância conta
            }

        } while(opcao != 0);

        // Exemplo de uso da classe Conta
        conta.DadosBancarios();
        conta.Depositar(100);
        conta.Sacar(50);
        conta.Sacar(100);
    }
}
