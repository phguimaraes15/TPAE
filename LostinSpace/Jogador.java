/**
 * Esta classe armazena o nome do jogador e a quantidade de vida 
 */
public class Jogador {

    private Vidas vidas;
    private String nome;
    /**
     * Construtor - inicializa as palavras de comando.
     */
    public Jogador() {

        vidas = new Vidas();

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
/**
 * Esse metodo seta a quantidade de vida que o jogador tem.
 * Quando a vida chega a 0 imprime uma mensagem na tela de Game Over. 
 */
    public void Vidas(int vida) {

        vidas.setVidas(vida);

        if (getVidas() == 0) {
            System.out.println("TODAS AS SUAS VIDAS SE FORAM!");
            System.out.println("GAME OVER");
            System.out.println("");
        }

    }

    public int getVidas() {

        return vidas.getVidas();

    }

}
