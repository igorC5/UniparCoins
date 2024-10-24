import java.util.ArrayList;
import java.util.List;

public class CarteiraDigital {


    ArrayList<String> transacoes = new ArrayList<String>();
    int indiceAtual = 0;

    public double saldo = 0;

    public void mostrarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    public void adicionarSaldo(double x){
        transacoes.add("adição de saldo: " + saldo + " + " + x + " = " + (saldo+x));
        System.out.println(transacoes.get(indiceAtual));
        indiceAtual++;
        saldo += x;
        System.out.println("Saldo Adicionado com sucesso!");

    }

    public void realizarPagamento(double x){

        if (x > saldo){
            System.out.println("Erro: Saldo insuficiente");
        }else{
            transacoes.add("pagamento realizado: " + saldo + " - " + x + " = " + (saldo-x));
            System.out.println(transacoes.get(indiceAtual));
            indiceAtual++;
            saldo -= x;
        }

    }

    public void verificarSaldo(){
        System.out.println("O saldo atual é: " + saldo);
    }


    public void verHistorico(){
        System.out.println("==================================================================");
        System.out.println("Foram realizadas " + transacoes.size() + " transações:");
        System.out.println("==================================================================");

        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println(transacoes.get(i));
            System.out.println("---------------------------------------------------------------------------------------");
        }

        System.out.println("==================================================================");
    }

}
