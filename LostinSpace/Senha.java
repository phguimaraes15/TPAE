import java.util.Random;
/**
 * Esta classe gera a senha em alguma sala aleatoria, dentre as selecionadas.
 */
public class Senha extends Item {

    private String ambSenha;
    private boolean controleSenha;

    public Senha(String descricao) {

        super(descricao);
        controleSenha = false;
        ambienteSenha();

    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }
    /** 
     * Metodo que gera a senha em algum ambiente aleatorio
     */
    private void ambienteSenha() {

        Random amb = new Random();
        int intSenha = amb.nextInt(3) + 1;

        if (intSenha == 1) {
            ambSenha = "cabine";
        } else if (intSenha == 2) {
            ambSenha = "eletrica";
        } else {
            ambSenha = "navegacao";
        }

    }

    public String getambSenha() {
        return ambSenha;
    }

    private void controleDeSenha(boolean controle) {
        controleSenha = controle;
    }

    public boolean getControleSenha() {
        return controleSenha;
    }
    /**
     * Esse metodo imprime na tela que encontrou a chave
     */
    public void imprimirSenha() {
        System.out.println("");
        System.out.println("Voce a encontrou. " + getDescricao());
        System.out.println("Agora pegue-a");
        System.out.println("");
        controleDeSenha(true);
    }
    /**
     * Esse metodo imprime na tela que a chave foi encontrada
     * Se a senha n„o estiver, imprime na tela que n„o est· 
     */
    public void pegarSenha() {
        if (getControleSenha() == true) {
            System.out.println("");
            System.out.println("Voce pegou a senha.");
            System.out.println("Agora volte e tente abrir novamente a porta");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("A senha n√£o est√° aqui.");
        }
    }
}
