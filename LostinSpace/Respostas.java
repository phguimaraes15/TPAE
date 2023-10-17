import java.util.HashMap;

/**
 * Classe que contém e verifica as respostas corretas
 */
public class Respostas {

    private HashMap<Integer, Character> respostas;

    /**
     * Método que cria o HashMap de respostas
     */
    public Respostas() {

        respostas = new HashMap<>();

        respostas();

    }

    /**
     * Método para verificar a resposta digitada pelo jogador
     * @param resposta
     * @param pergunta
     * @return se a resposta esta correta
     */
    public boolean conferirResposta(char resposta, int pergunta) {

        if (resposta == 'a') {
            resposta = 'A';
        } else if (resposta == 'b') {
            resposta = 'B';
        } else if (resposta == 'c') {
            resposta = 'C';
        }

        if (resposta == respostas.get(pergunta)) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Método que adiciona as respostas corretas de cada pergunta
     */
    private void respostas() {

        respostas.put(1, 'B');
        respostas.put(2, 'C');
        respostas.put(3, 'B');
        respostas.put(4, 'A');
        respostas.put(5, 'A');
        respostas.put(6, 'B');
        respostas.put(7, 'C');
        respostas.put(8, 'B');
        respostas.put(9, 'A');
        respostas.put(10, 'A');
        respostas.put(11, 'C');
        respostas.put(12, 'B');
        respostas.put(13, 'A');
        respostas.put(14, 'A');
        respostas.put(15, 'B');
        respostas.put(16, 'C');
        respostas.put(17, 'A');
        respostas.put(18, 'B');
        respostas.put(19, 'C');
        respostas.put(20, 'A');
        respostas.put(21, 'B');
        respostas.put(22, 'C');
        respostas.put(23, 'A');
        respostas.put(24, 'B');
        respostas.put(25, 'C');
        respostas.put(26, 'A');
        respostas.put(27, 'B');
        respostas.put(28, 'C');
        respostas.put(29, 'A');
        respostas.put(30, 'B');

    }

}
