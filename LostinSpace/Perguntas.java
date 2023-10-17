import java.util.Random;
import java.util.ArrayList;

/**
 * Classe que gera número aleatório para representar uma pergunta
 */

public class Perguntas {

    private int numeroPergunta;
    private Random aleatorio = new Random();
    private ArrayList<Integer> numRepetidos = new ArrayList<>();

    /**
     * Método para criar o ArrayList e instanciar um objeto do tipo aleatório
     */
    public Perguntas() {

        aleatorio = new Random();
        numRepetidos = new ArrayList<>();

    }

    /**
     * Método que gera um número aleatório pra representar uma pergunta
     */
    public void gerarNumero() {

        numeroPergunta = aleatorio.nextInt(30) + 1;

        while (numRepetidos.contains(numeroPergunta) == true) {
            numeroPergunta = aleatorio.nextInt(30) + 1;
        }

        numRepetidos.add(numeroPergunta);

    }

    /**
     * @return o numero da pergunta
     */
    public int getNumeroPergunta() {

        return numeroPergunta;

    }

}
