public class Conta {
    String EscolhaNome;
    String EscolhaId;
    int saldo = 0;
    int ultimaTransacao = 0;

    public Conta(String EscolhaNome, String EscolhaId){
        this.EscolhaNome = EscolhaNome;
        this.EscolhaId = EscolhaId;
    }

    //Metodo de caucular depositos no banco 
    public void deposito(int valor){
        if(valor > 0){
            saldo = saldo + valor;
            ultimaTransacao = saldo;
            System.out.println("Transçao feita com sucesso!");
            System.out.println("Seu novo saldo e: " + saldo);

        }
        else{
            System.out.println("Deposite um valor maior que 0!");
        }
    }

    //Metodo para caucular os saques no banco
    public void saque(int valor){
        if(valor < saldo){
            if(valor > 0){
                saldo = saldo - valor;
                ultimaTransacao = -saldo;
                System.out.println("Saque feito com sucesso!");
                System.out.println("Seu novo saldo e: " + saldo);

            }
            else{
                System.out.println("Saque um valor maior que 0!");

            }
        }
        else{
            System.out.println("Saldo insuiciente para saque!");
        }
    }

    //Metodo que rastreias as ultimas transaçoes
    public void transacoesPassadas(){
        if(ultimaTransacao > 0){
            System.out.println("Deposito: " + ultimaTransacao);
            
        }
        else if(ultimaTransacao < 0){
            System.out.println("Saque: " + ultimaTransacao);
        }
        else{
            System.out.println("Nenhuma transiçao ocorrida!");
        }
    }

    //Metodo que caucula os juros fixos do banco anualmente
    public void caucularJuros(int anos){
        double juros = .0185;

        double novoSaldo = (saldo * juros * anos) + saldo;
        System.out.println("A taxa de juros anual e de " + (100 * juros) + "%");
        System.out.println("Depois de " + anos + " anos, seu saldo e de: " + novoSaldo);
        
    }
}