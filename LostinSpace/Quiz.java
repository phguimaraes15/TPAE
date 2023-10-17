import java.util.Scanner;
/**
 * Classe que vai gerar a pergunta de maneira aleatoria para o quiz.
 * Ela fornece a Pergunta, o enunciado e as alternativas.
 *Se estiver errado, entra em loop até o usuario acertar.
 */
public class Quiz {

	private Perguntas pergunta;
    private Enunciado enunciado;
    private Alternativas alternativa;
    private Respostas resposta;
    private Scanner entrada;
    /**
     * Construtor - inicializa as palavras de comando.
     */
    public Quiz() {

        pergunta = new Perguntas();
        enunciado = new Enunciado();
        alternativa = new Alternativas();
        resposta = new Respostas();
        entrada = new Scanner(System.in);

    }

    private void Questao() {

        System.out.println("");
        System.out.println("Responda corretamente: ");

        pergunta.gerarNumero();
        enunciado.gerarPergunta(pergunta.getNumeroPergunta());
        alternativa.gerarAlternativas(pergunta.getNumeroPergunta());

    }

    public boolean pegarResposta() {

        return (resposta.conferirResposta(entrada.next().charAt(0), pergunta.getNumeroPergunta()) == true);
    }
/**
 * Chama o metodo Questao e gera uma pergunta aleatoria.
 * Se a resposta estiver errada ele chama o metodo novamente e tira uma vida.
 * Se a vida chegar a 0 o jogo encerra.
 * Se a resposta estiver correta imprime a mensagem de acerto.
 */
    public void gerarQuestao(Jogador player) {

        Questao();

        while ((player.getVidas() != 0) && (pegarResposta() == false)) {

            System.out.println("");
            System.out.println("Resposta errada ");

            player.Vidas(-1);

            if (player.getVidas() > 0) {

                System.out.println("Resta " + player.getVidas() + " vidas");

                System.out.println("Tente novamente: ");
                Questao();
            }
        }

        if (player.getVidas() > 0) {
            System.out.println("");
            System.out.println("Muito Bem " + player.getNome() + " Voce acertou!!!");
            System.out.println("");
        }

    }
}
