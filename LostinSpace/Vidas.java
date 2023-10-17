
/**
 * Classe que gerencia a quantidade de vidas do jogador
 */

public class Vidas {

    private int vidas;

    /**
     * Método para definir a quantidade inicial de vidas como 3
     */
    public Vidas() {

        vidas = 3;

    }

    /**
     * Método para retornar a quantidade de vidas
     * @return a quantidade de vidas
     */
    public int getVidas() {

        return vidas;

    }

    /**
     * Método para aumentar o número de vidas
     * @param num
     */

    public void setVidas(int num) {

        vidas = getVidas() + num;

    }

}