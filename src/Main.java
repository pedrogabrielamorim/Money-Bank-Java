import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome = "Jhon Wick";
        String TipoConta = "Corrente";
        double Saldo = 23000.58;
        int opcao = 0;

        System.out.println("Bem vindo(a) ao Money Bank");
        System.out.println("\n**************************");
        System.out.println("\nCliente: " + nome);
        System.out.println("Tipo de Conta: " + TipoConta);

        System.out.println("Saldo atual:    R$ " + Saldo);
        System.out.println("\n**************************");


            String menu = """
                    ** Digite a opção desejada **\n
                    1 - Consultar saldo
                    2 - Transferir valor
                    3 - Receber valor
                    4 - sair
                    
                    """;
            Scanner Leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = Leitura.nextInt();
            if (opcao == 1 )  {
                System.out.println("Saldo atual: " + Saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor à transferido ?");
                double Valor = Leitura.nextDouble();
                if (Valor > Saldo) {
                    System.out.println("Não há saldo suficiente para realizar a transferência.");
                } else {
                    Saldo -= Valor;
                    System.out.println("Transferência realizada!");
                    System.out.println("Saldo atual: " + Saldo);
                }
            }else if (opcao == 3){
                    System.out.println("Valor recebido ?");
                   double Valor = Leitura.nextDouble();
                    Saldo += Valor;
                System.out.println("Valor recebido com sucesso!");
                    System.out.println("Saldo atual: " + Saldo);
                }
            else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
