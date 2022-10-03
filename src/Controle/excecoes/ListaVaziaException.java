package Controle.excecoes;

/**
/**
 * Classe de excecoes usadas para informar o usuario a forma correta para
 * inserção.
 * essa classe retorna para o usuario a mensagem de que lista passada está vazia
 *
 * @author Carlos e Flavio
 *
 */
public class ListaVaziaException extends ControleExcecao {

    public ListaVaziaException(String msn) {
        super(msn);
    }

}
