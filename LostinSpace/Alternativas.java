import java.util.HashMap;

/**
 * Classe que gera as alternativas das perguntas
 */
public class Alternativas {

    private HashMap<Integer, String> alternativas;

    /**
     * Método que cria um HashMap e gera as alternativas
     */
    public Alternativas() {

        alternativas = new HashMap<>();

        alternativas();

    }

    /**
     * Método que imprime as alternativas da pergunta
     * @param pergunta
     */
    public void gerarAlternativas(int pergunta) {

        System.out.println(alternativas.get(pergunta));

    }

    /**
     * Método que adiciona as alternativas na pergunta correspondente 
     */
    private void alternativas() {

        alternativas.put(1, "(A) 6     (B) 5      (C) 4");
        alternativas.put(2, "(A) Terra    (B) Saturno      (C) Júpiter");
        alternativas.put(3, "(A) Tem entre 2 a 4 litros.     (B) Tem entre 4 a 6 litros.      (C) Tem 7 litros.");
        alternativas.put(4, "(A) Brasil    (B) França     (C) Inglaterra");
        alternativas.put(5, "(A) Descartes     (B) Sócrates      (C) Platão");
        alternativas.put(6, "(A) O Senhor dos Anéis     (B) Dom Quixote      (C) O Pequeno Príncipe");
        alternativas.put(7, "(A) Duas     (B) Centenas      (C) Infinitas");
        alternativas.put(8, "(A) Legenda    (B) Lenda      (C) Legendário");
        alternativas.put(9, "(A) Pablo Picasso     (B) Paul Cézanne      (C)  Paul Cézanne");
        alternativas.put(10, "(A) 8 minutos    (B) 12 minutos      (C) 12 horas");
        alternativas.put(11, "(A) Idade Média    (B) Neolítico      (C) Paleolítico");
        alternativas.put(12, "(A) Monte Roraima     (B) Pico da Neblina      (C) Pico da Bandeira");
        alternativas.put(13, "(A) Macau     (B) Moçambique     (C) Portugal");
        alternativas.put(14, "(A) Maquiavel     (B) Montesquieu      (C) Rousseau");
        alternativas.put(15, "(A) Brasil     (B) Rússia      (C) China");
        alternativas.put(16, "(A) Alexandrino Francisco Lisboa     (B) Manuel Francisco Lisboa     (C) Antônio Francisco Lisboa");
        alternativas.put(17, "(A) Elefante africano     (B) Baleia Azul      (C) Girafa");
        alternativas.put(18, "(A) Dilma Rousseff     (B) Margaret Thatcher     (C) Hillary Clinton");
        alternativas.put(19, "(A) Gabriel, Benjamim e Melchior     (B) Gaspar, Nicolau e Natanael     (C) Belchior, Gaspar e Baltazar");
        alternativas.put(20, "(A) Cristianismo    (B) Hinduísmo     (C) Judaísmo");
        alternativas.put(21, "(A) Yuri Gagarin   (B) Neil Armstrong      (C) Charles Conrad");
        alternativas.put(22, "(A) Blaise Pascal   (B) Charles Darwin     (C) Louis Pasteur");
        alternativas.put(23, "(A) Tipo O    (B) Tipo B     (C) Tipo A");
        alternativas.put(24, "(A) Os X     (B) Os Y      (C) Os Z");
        alternativas.put(25, "(A) Tasmânia    (B) Queensland     (C) Nova Gales do Sul");
        alternativas.put(26, "(A) uma loba     (B) uma vaca     (C) uma cabra");
        alternativas.put(27, "(A) veias     (B) artérias      (C) ventrículos");
        alternativas.put(28, "(A) o pavão     (B) a cacatua      (C) o peru");
        alternativas.put(29, "(A) a Indonésia   (B) as Maldivas      (C) as Bahamas");
        alternativas.put(30, "(A) Oceano Pacífico     (B) Oceano Índico     (C) Oceano Atlantico");

    }

}
