package Lanchonete;
import Lanchonete.Atendimento.Atendente;
import Lanchonete.Cliente.Cliente;
import Lanchonete.Atendimento.Cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que o cozinheiro faz e o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        //ações que o atendente faz e o estabelecimento precisa ter ciência
        atendente.servindoMesa();
        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        //ações que o cliente faz e o estabelecimento precisa ter ciência
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}