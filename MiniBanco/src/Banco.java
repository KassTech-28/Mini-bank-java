import java.util.Scanner;

public class Banco{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da sua conta:");
        String custNome = sc.nextLine();

        System.out.println("Digite o ID da sua conta:");
        String custId = sc.nextLine();

        Conta conta = new Conta(custNome, custId);

        //Area de login do usuario
        System.out.println("-----------------------");   
        System.out.println("Bem-vindo(a), " + conta.EscolhaNome);
        System.out.println("Seu ID e: " + conta.EscolhaId);
        System.out.println("-----------------------");
        System.out.println("Escolha uma opçao para continuar:");
        System.out.println("A - Checar saldo");
        System.out.println("B - Realizae deposito");
        System.out.println("C - Realizar saque");
        System.out.println("D - Ultima transaçao");
        System.out.println("E - juros");
        System.out.println("F - Sair");


        char opcao;
        boolean loop = true;

        while(loop){
            System.out.println("Digte sua opçao:");
            opcao = sc.next().charAt(0);

            switch(opcao) {
                case 'A':
                    System.out.println("Saldo bancario = R$" + conta.saldo);
                    break;
                case 'B':
                    System.out.println("Digite o valor que desaja depositar:");
                    int valorATual = sc.nextInt();

                    conta.deposito(valorATual);
                    break;
                case 'C':
                    System.out.println("Digite o valor do seu saque:");
                    int valorSaque = sc.nextInt();

                    conta.saque(valorSaque);
                    break;
                case 'D':
                    conta.transacoesPassadas();
                    break;
                case 'E':
                    System.out.println("Digite a quantidade e anosque voce quer caucular os juros:");
                    int anosTotal = sc.nextInt();
                    conta.caucularJuros(anosTotal);
                    break;
                case 'F':
                    System.out.println("Login finalizado, volte sempre!");
                    sc.close();
                    loop = false;
                    break;

                    
                default:
                    System.out.println("Opcao inalida por favor tente [A, B, C, D, E u F]");
            }
            
        }
    }
}
