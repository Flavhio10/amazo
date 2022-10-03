package Controle.excecoes;

/**
 * Classe de excecoes usadas para informar o usuario a forma correta para
 * inserção.
 *
 * @author Carlos e Flavio
 *
 */
public class ControleExcecao extends RuntimeException {

    /**
     * Método herdado do RuntimeExcepetion que dispara uma informaçãoao usuario
     *
     * @param msn String - mesnsagem de informação.
     * 
     */
    public ControleExcecao(String msn) {
        super(msn);
    }
}
