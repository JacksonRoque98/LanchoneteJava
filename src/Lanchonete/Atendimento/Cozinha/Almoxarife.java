package Lanchonete.Atendimento.Cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }
    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }
    void recebendoIngredientes() {
        controlarEntrada();
        System.out.println("RECEBENDO OS INGREDIENTES");
    }
    void entregarIngredientes() {
        controlarSaida();
        System.out.println("ENTREGANDO OS INGREDIENTES");
    }
    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }
}