/**
 * Esta classe eh parte da aplicacao "World of Zuul".
 * "World of Zuul" eh um jogo de aventura muito simples, baseado em texto.
 * 
 * Essa classe guarda uma enumeracao de todos os comandos conhecidos do
 * jogo. Ela eh usada no reconhecimento de comandos como eles sao digitados.
 *
 */

public class PalavrasComando {
    // um vetor constante que guarda todas as palavras de comandos validas
    private static final String[] comandosValidos = {
            "ir", "sair", "ajuda", "observar", "pegar", "usar"
    };

    /**
     * Construtor - inicializa as palavras de comando.
     */
    public PalavrasComando() {
        // nada a fazer no momento...
    }

    /**
     * Verifica se uma dada String eh uma palavra de comando valida.
     * 
     * @return true se a string dada eh um comando valido,
     *         false se nao eh.
     */
    public boolean ehComando(String umaString) {
        for (int i = 0; i < comandosValidos.length; i++) {
            if (comandosValidos[i].equals(umaString))
                return true;
        }
        // se chegamos aqui, a string nao foi encontrada nos comandos.
        return false;
    }

    public String getComandos() {
        String comandos = "";

        for (String comando : comandosValidos) {
            comandos = comandos + comando + "";
        }
        return comandos;
    }

}
