import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("""
                Escolha uma opção:
                [ 1 ] Adicionar saldo
                [ 2 ] Realizar pagamento
                [ 3 ] Verificar saldo
                [ 4 ] Ver histórico de transações
                [ 5 ] Sair
                """);
    }

    public static void main(String[] args) {

        CarteiraDigital userCarteira = new CarteiraDigital();
        int escolha = 0;
        Scanner input = new Scanner(System.in);


        System.out.println("Bem vindo a sua Carteira Digital!");
        do{
            menu();
            escolha = input.nextInt();
            double valorDaAcao;

            if (escolha == 5){
                System.out.println("Obrigado por usar a sua Carteira Digital!");
                return;
            } else if (escolha == 1) {
                System.out.println("Digite o valor para adicionar ao saldo: ");
                valorDaAcao = input.nextDouble();
                userCarteira.adicionarSaldo(valorDaAcao);
            } else if (escolha == 2) {
                System.out.println("Digite o valor do pagamento: ");
                valorDaAcao = input.nextDouble();
                userCarteira.realizarPagamento(valorDaAcao);
            } else if (escolha == 3) {
                userCarteira.verificarSaldo();
            } else if (escolha == 4) {
                userCarteira.verHistorico();
            }

        }while (escolha != 5);

    }
}