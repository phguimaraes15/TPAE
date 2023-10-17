/**
 * Classe que cria e inicializa todas as outras: ela cria os
 * ambientes, cria o analisador e comeca o jogo. Ela tambem avalia e
 * executa os comandos que o analisador retorna.
 */

public class Jogo {
    private Analisador analisador;
    private Ambiente ambienteAtual;
    private Jogador player;
    private Senha senha;
    private NewVidas vidas;
    private Quiz quiz;

    /**
     * Cria o jogo e incializa seu mapa interno.
     */
    public Jogo() {
        criarAmbientes();
        analisador = new Analisador();
        player = new Jogador();
        quiz = new Quiz();
        senha = new Senha("Essa é a senha para a porta final, tome cuidado com ela!!!");
        vidas = new NewVidas("Esse kit lhe adiciona mais duas vidas as que voce ja possui!!");
    }

    /**
     * Cria todos os ambientes e liga as saidas deles
     */
    private void criarAmbientes() {
        Ambiente inicio, s1, s2, s3, s4, s5, s6, s7, s8, s9, fim;

        // cria os ambientes
        inicio = new Ambiente("na sala de abduçao");
        s1 = new Ambiente("na Cabine de Controle");
        s2 = new Ambiente("na Eletrica");
        s3 = new Ambiente("na Navegacao");
        s4 = new Ambiente("no Reator");
        s5 = new Ambiente("no Deposito");
        s6 = new Ambiente("na Enfermaria");
        s7 = new Ambiente("na Sala de Armas");
        s8 = new Ambiente("no Refeitorio");
        s9 = new Ambiente("no Sanitario");
        fim = new Ambiente(
                "na sala onde sua vida irá mudar!! Pra melhor ou pior. ;)");

        // inicializa as saidas dos ambientes
        inicio.ajustarSaidas("cabine", s1);
        inicio.ajustarSaidas("eletrica", s2);

        s1.ajustarSaidas("navegacao", s3);
        s1.ajustarSaidas("eletrica", s2);

        s2.ajustarSaidas("cabine", s1);
        s2.ajustarSaidas("navegacao", s3);
        s2.ajustarSaidas("reator", s4);
        s2.ajustarSaidas("deposito", s5);

        s3.ajustarSaidas("cabine", s1);
        s3.ajustarSaidas("eletrica", s2);
        s3.ajustarSaidas("armas", s7);

        s4.ajustarSaidas("eletrica", s2);
        s4.ajustarSaidas("deposito", s5);
        s4.ajustarSaidas("enfermaria", s6);

        s5.ajustarSaidas("reator", s4);
        s5.ajustarSaidas("eletrica", s2);
        s5.ajustarSaidas("armas", s7);
        s5.ajustarSaidas("refeitorio", s8);

        s6.ajustarSaidas("reator", s4);
        s6.ajustarSaidas("refeitorio", s8);
        s6.ajustarSaidas("sanitario", s9);

        s7.ajustarSaidas("navegacao", s3);
        s7.ajustarSaidas("deposito", s5);
        s7.ajustarSaidas("refeitorio", s8);

        s8.ajustarSaidas("deposito", s5);
        s8.ajustarSaidas("enfermaria", s6);
        s8.ajustarSaidas("armas", s7);

        s9.ajustarSaidas("enfermaria", s6);
        s9.ajustarSaidas("saida", fim);

        fim.ajustarSaidas("sanitario", s9);

        ambienteAtual = inicio; // o jogo comeca na sala de abdução
    }

    /**
     * Rotina principal do jogo. Fica em loop ate terminar o jogo
     */
    public void jogar() {
        imprimirBoasVindas();

        // Entra no loop de comando principal. Aqui nos repetidamente lemos
        // comandos e os executamos ate o jogo terminar.

        System.out.println("Para poder começar, insira seu nickname: ");
        System.out.println("");

        player.setNome(analisador.nickName());

        System.out.println("");
        System.out.println(
                "A partir de agora voce deve responder todas as perguntas ate conseguir chegar ao final desse experimento:");
        System.out.println("");

        boolean terminado = false;

        quiz.gerarQuestao(player);
        if (player.getVidas() != 0)
            imprimirLocalInfo();

        while (!terminado && player.getVidas() != 0 && controleJogo == false) {

            Comando comando = analisador.pegarComando();
            terminado = processarComando(comando);

        }
        System.out.println("Obrigado por jogar. Ate mais!");
    }

    /*
     * Imprime a informação de localização para o jogador
     */

    private void imprimirLocalInfo() {

        System.out.println("Voce esta " + ambienteAtual.getDescricao());
        System.out.println("");
        System.out.println("Escolha uma saida: ");
        System.out.println("");
        System.out.print(ambienteAtual.getSaidas());
        System.out.println("");

    }

    /*
     * Imprime a mensagem de abertura para o jogador.
     */
    private void imprimirBoasVindas() {
        System.out.println();
        System.out.println("Bem-vindo ao Lost in Spaceship!");
        System.out.println("");
        System.out.println("Lost in Spacesship eh um jogo de Pergunta e Resposta onde testamos seus conhecimentos gerais.");
        System.out.println("Para poder avançar no jogo, voce deve responder todas as perguntas corretamente.");
        System.out.println("Caso voce responda errado, perdera 1 vida das 3 que possui");
        System.out.println("Digite 'ajuda' se voce precisar de ajuda.");
        System.out.println("Bom jogo e Boa sorte");
        System.out.println();
        System.out.println();

    }

    /**
     * Dado um comando, processa-o (ou seja, executa-o)
     * 
     * @param comando O Comando a ser processado.
     * @return true se o comando finaliza o jogo.
     */
    private boolean processarComando(Comando comando) {
        boolean querSair = false;

        if (comando.ehDesconhecido()) {
            System.out.println("Eu nao entendi o que voce disse...");
            return false;
        }

        String palavraDeComando = comando.getPalavraDeComando();
        if (palavraDeComando.equals("ajuda")) {
            imprimirAjuda();
        } else if (palavraDeComando.equals("ir")) {

            irParaAmbiente(comando);

            if (player.getVidas() == 0) {
                return true;
            }

        } else if (palavraDeComando.equals("sair")) {
            querSair = sair(comando);
        } else if (palavraDeComando.equals("observar")) {
            observar();
        } else if (palavraDeComando.equals("pegar")) {
            pegarItem(comando);
        } else if (palavraDeComando.equals("usar")) {
            usarItem(comando);
        }

        return querSair;
    }

    /**
     * Printe informacoes de ajuda.
     * Aqui nos imprimimos algo bobo e enigmatico e a lista de
     * palavras de comando
     */
    private void imprimirAjuda() {
        System.out.println("Voce esta perdido. Voce esta sozinho. Pense bem nos seus próximos passos!");
        System.out.println("Para você não ficar tão perdido siga as instrucoes...");
        System.out.println();
        System.out.println("Suas palavras de comando sao:");
        System.out.println("ir (sala) sair ajuda observar pegar (item) usar (item)");
    }

    /**
     * Tenta ir em uma direcao. Se existe uma saida entra no
     * novo ambiente, caso contrario imprime mensagem de erro.
     */
    boolean controleFinal = false;

    private void irParaAmbiente(Comando comando) {
        if (!comando.temSegundaPalavra()) {
            // se nao ha segunda palavra, nao sabemos pra onde ir...
            System.out.println("Ir pra onde?");
            return;
        }

        String direcao = comando.getSegundaPalavra();

        // Tenta sair do ambiente atual

        Ambiente proximoAmbiente = ambienteAtual.getAmbiente(direcao);

        if (proximoAmbiente == null) {
            System.out.println("Nao ha passagem!");
        } else {

            quiz.gerarQuestao(player);

            if (player.getVidas() == 0) {
                return;
            } else if (direcao.equals("saida")) {
                imprimirFinal();
                controleFinal = true;
                if (senha.getControleSenha() == true) {
                    return;
                }

            }

            if (controleFinal == true) {
                if (direcao.equals(senha.getambSenha()) && senha.getControleSenha() == false) {
                    senha.imprimirSenha();
                    ambienteAtual = proximoAmbiente;
                    return;
                }
            }

            if (direcao.equals(vidas.getAmbVidas()) && vidas.getControleVidas() == false) {
                vidas.imprimirKit();
                ambienteAtual = proximoAmbiente;
                return;
            }

            ambienteAtual = proximoAmbiente;
            imprimirLocalInfo();

        }
    }

    /**
     * "Sair" foi digitado. Verifica o resto do comando pra ver
     * se nos queremos realmente sair do jogo
     * 
     * @return true, se este comando sai do jogo, false, caso contrario
     */
    private boolean sair(Comando comando) {
        if (comando.temSegundaPalavra()) {
            System.out.println("Sair o que?");
            return false;
        } else {
            return true; // sinaliza que nos queremos sair
        }
    }

    /**
     * Imprime a sala atual
     */
    private void observar() {
        imprimirLocalInfo();
    }

    /**
     * Imprime a mensagem que aparece ao jogador quando ele chega na última sala (com e sem chave)
     */
    private void imprimirFinal() {

        if (senha.getControleSenha() == false) {
            System.out.println("");
            System.out.println("Meus Parabens " + player.getNome() + " voce conseguiu chegar até o final!!");
            System.out.println("Mas nao é tão facil assim!");
            System.out.println("Voce nao encontrou a senha para abrir essa ultima porta. HEHE ;)");
            System.out.println("Recomendo voltar e procurar");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("Meus Parabens " + player.getNome() + " voce conseguiu chegar até o final novamente!!");
            System.out.println("Agora use a senha para abrir a porta");
            System.out.println("");
        }
    }

    /**
     * Método para pegar item (Senha ou kit de vidas)
     * @param comando
     */
    private void pegarItem(Comando comando) {

        String item = comando.getSegundaPalavra();

        if (item.equals("senha")) {
            senha.pegarSenha();
        } else if (item.equals("kit")) {
            vidas.pegarKit();
        }
        imprimirLocalInfo();
    }

    /**
     * Método para usar itens (kit de vidas e senha)
     * @param comando
     */
    private void usarItem(Comando comando) {

        String item = comando.getSegundaPalavra();

        if (senha.getControleSenha() == true && item.equals("senha")) {
            System.out.println("");
            System.out.println("Meus Parabens " + player.getNome() + " voce conseguiu abrir a ultima porta!!");
            System.out.println("");
            imprimirGAMEOVER();
        } else if (vidas.getControleVidas() == true && item.equals("kit")) {
            player.Vidas(2);
            System.out.println("");
            System.out.println("Voce usou o kit e foram adicionadas mais duas vidas.");
            System.out.println("");
            imprimirLocalInfo();
            return;
        }

    }

    private Boolean controleJogo = false;

    /**
     * Imprime a mensagem de quando o jogador ganha o jogo e encerra
     */
    private void imprimirGAMEOVER() {

        System.out.println("");
        System.out.println("Meus Parabens " + player.getNome() + " voce conseguiu provar seus conhecimentos gerais!!");
        System.out.println("Agora poderá ganhar sua recompensa mais desejada");
        System.out.println("Mas somente se fizer o pix pra minha conta");
        System.out.println("VALEUUUUUU");
        System.out.println("");
        controleJogo = true;
    }

}
