package Controle.excecoes;

/**
 * Classe de excecoes usadas para informar o usuario a forma correta para
 * inserção.
 *
 * @author Carlos e Flavio
 *
 */
public class CampoNuloException extends ControleExcecao {
    /**
     * Método herdado do RuntimeExcepetion que dispara uma informaçãoao usuario
     *
     * @param msn String - mesnsagem de informação.
     * 
     */
    public CampoNuloException(String msn) {
        super(msn);
    }

}
