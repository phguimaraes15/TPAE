/**
 * Essa classe guarda informacoes sobre um comando que foi digitado pelo usuario
 */

public class Comando
{
    private String palavraDeComando;
    private String segundaPalavra;

    /**
     * Cria um objeto comando
     * @param primeiraPalavra 
     * @param segundaPalavra 
     */
    public Comando(String primeiraPalavra, String segundaPalavra)
    {
        palavraDeComando = primeiraPalavra;
        this.segundaPalavra = segundaPalavra;
    }

    /**
     * @return A palavra de comando.
     */
    public String getPalavraDeComando()
    {
        return palavraDeComando;
    }

    /**
     * @return A segunda palavra deste comando
     */
    public String getSegundaPalavra()
    {
        return segundaPalavra;
    }

    /**
     * @return true se o comando nao foi entendido
     */
    public boolean ehDesconhecido()
    {
        return (palavraDeComando == null);
    }

    /**
     * @return true se o comando tem uma segunda palavra
     */
    public boolean temSegundaPalavra()
    {
        return (segundaPalavra != null);
    }
}

