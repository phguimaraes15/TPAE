import java.util.HashMap;

/**
 * Classe que gera o enunciado da perguntas
 */
public class Enunciado {

    private HashMap<Integer, String> enunciado;

    /**
     * Método que cria um HashMap e chama o enunciado da pergunta correspondente
     */
    public Enunciado() {

        enunciado = new HashMap<>();

        enunciados();

    }

    /**
     * Método que gera o enunciado da pergunta
     * @param pergunta
     */

    public void gerarPergunta(int pergunta) {

        System.out.println("");
        System.out.println(enunciado.get(pergunta));
        System.out.println("");

    }

    /**
     * Método que adiciona o enunciado das perguntas
     */
    private void enunciados() {

        enunciado.put(1, "Quantas copas do mundo o Brasil tem?");
        enunciado.put(2, "Qual o maior planeta do Sistema Solar?");
        enunciado.put(3, "Normalmente, quantos litros de sangue uma pessoa tem?");
        enunciado.put(4, "De onde é a invenção do chuveiro elétrico?");
        enunciado.put(5, "De quem é a famosa frase “Penso, logo existo”?");
        enunciado.put(6, "Qual o livro mais vendido no mundo a seguir à Bíblia?");
        enunciado.put(7, "Quantas casas decimais tem o número pi?");
        enunciado.put(8, "O que a palavra legend significa em português?");
        enunciado.put(9, "Quem pintou “Guernica”?");
        enunciado.put(10, "Quanto tempo a luz do Sol demora para chegar à Terra?");
        enunciado.put(11, "Em que período da pré-história o fogo foi descoberto?");
        enunciado.put(12, "Qual a montanha mais alta do Brasil?");
        enunciado.put(13, " Em qual local da Ásia o português é língua oficial?");
        enunciado.put(14, "Quem é o autor de “O Príncipe”?");
        enunciado.put(15, " Qual destes países é transcontinental?");
        enunciado.put(16, "Qual era o nome de Aleijadinho?");
        enunciado.put(17, "Qual o maior animal terrestre?");
        enunciado.put(18, "Que líder mundial ficou conhecida como “Dama de Ferro”?");
        enunciado.put(19, "Quais os nomes dos três Reis Magos?");
        enunciado.put(20, "Qual a religião monoteísta que conta com o maior número de adeptos no mundo?");
        enunciado.put(21, "Quem foi o primeiro homem a pisar na Lua?");
        enunciado.put(22, "Qual o nome do cientista que descobriu o processo de pasteurização e a vacina contra a raiva?");
        enunciado.put(23, "As pessoas de qual tipo sanguíneo são consideradas doadores universais?");
        enunciado.put(24, "Quais são os cromossomos que determinam o sexo masculino?");
        enunciado.put(25, "Em que estado australiano fica situada a cidade de Sydney?");
        enunciado.put(26, "Quem amamentou os gêmeos Rômulo e Remo?");
        enunciado.put(27, "Como se chamam os vasos que transportam sangue do coração para a periferia do corpo?");
        enunciado.put(28, "Que animal gruguleja?");
        enunciado.put(29, "Qual é o maior arquipélago da Terra?");
        enunciado.put(30, "Em que oceano fica Madagascar?");

    }

}
