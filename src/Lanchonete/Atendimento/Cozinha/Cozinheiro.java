package Lanchonete.Atendimento.Cozinha;

import Lanchonete.Atendimento.Atendente;

public class Cozinheiro {

    //usar apenas o void, deixa a função default
    //uma função default, pode ser chamada por outras classes que estejam no mesmo package.
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural no balcão");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando Suco no balcão!");
    }
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
    }
    private void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }
    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }
    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }
    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }
    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }


}
