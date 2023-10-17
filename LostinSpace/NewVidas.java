import java.util.Random;

/**
 * Classe que gera e gerencia o kit de vidas 
 */
public class NewVidas extends Item {

    private String ambVidas;
    private boolean controleVidas;

    /**
     * Chama o método para gerar aleatoriamente o kit de vidas em algum ambiente
     * @param descricao
     */
    public NewVidas(String descricao) {

        super(descricao);
        controleVidas = false;
        ambienteVidas();

    }

    /**
     * @return a descricao do item
     */
    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    /**
     * Adiciona o kit de vida em algum ambiente aleatório
     */
    private void ambienteVidas() {

        Random amb = new Random();
        int sorteio = amb.nextInt(8) + 1;

        if (sorteio == 1) {
            ambVidas = "cabine";
        } else if (sorteio == 2) {
            ambVidas = "eletrica";
        } else if (sorteio == 3) {
            ambVidas = "navegacao";
        } else if (sorteio == 4) {
            ambVidas = "reator";
        } else if (sorteio == 5) {
            ambVidas = "deposito";
        } else if (sorteio == 6) {
            ambVidas = "enfermaria";
        } else if (sorteio == 7) {
            ambVidas = "armas";
        } else if (sorteio == 8) {
            ambVidas = "refeitorio";
        } else {
            ambVidas = "sanitario";
        }

    }

    /**
     * @return o ambiente que possui o kit de vidas
     */
    public String getAmbVidas() {
        return ambVidas;
    }

    /**
     * Altera o estado o controle de vidas
     * @param controle
     */
    private void controleDeVidas(boolean controle) {
        controleVidas = controle;
    }

    /**
     * @return Verdadeiro se o jogador possui o kit de vida
     */

    public boolean getControleVidas() {
        return controleVidas;
    }

    /**
     * Método para imprimir ao jogador que ele encontrou um kit e para mudar o estado do controle de vidas para verdadeiro
     */
    public void imprimirKit() {
        System.out.println("");
        System.out.println("Voce encontrou um kit !!!");
        System.out.println(getDescricao());
        System.out.println("Mas continue prosseguindo com cuidado");
        System.out.println("Agora pegue-o.");
        System.out.println("");
        controleDeVidas(true);
    }

    /**
     * Método para fazer imprimir ao jogador se ele pegou o kit
     */
    public void pegarKit() {

        if (getControleVidas() == true) {
            System.out.println("");
            System.out.println("Voce pegou o kit com 2 vidas.");
            System.out.println("Use-o se quiser");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("O kit nao está aqui.");
        }
    }

}
