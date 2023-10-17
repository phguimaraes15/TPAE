import java.util.HashMap;

/**
 * Classe que representa uma localizacao no cenario do jogo. Ele eh
 * conectado aos outros ambientes atraves de saidas.
 */

public class Ambiente {
    private String descricao;
    private HashMap<String, Ambiente> saidas;

    /**
     * Cria um ambiente com a descricao passada
     * @param descricao A descricao do ambiente.
     */
    public Ambiente(String descricao) {
        this.descricao = descricao;
        saidas = new HashMap<String, Ambiente>();
    }

    /**
     * Define as saidas do ambiente
     */
    public void ajustarSaidas(String direcao, Ambiente ambiente) {
        saidas.put(direcao, ambiente);
    }

    /**
     * @return A descricao do ambiente.
     */

    public String getDescricao() {
        return descricao;
    }

    /**
     * @param direcao
     * @return o ambiente em que o jogador esta
     */

    public Ambiente getAmbiente(String direcao) {
        return saidas.get(direcao);
    }

    /**
     * Imprime as possiveis saidas da sala
     * @return as saidas disponiveis
     */
    public String getSaidas() {
        String textoSaidas = "";

        for (String direcao : saidas.keySet()) {
            textoSaidas = textoSaidas + direcao + " -- ";
        }

        return textoSaidas;
    }

}
