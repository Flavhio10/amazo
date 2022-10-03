package Controle;

import Controle.excecoes.CampoNuloException;
import Modelo.Autor;
import Modelo.Citacao;
import Modelo.Livro;
import Modelo.persistencia.CitacaoDao;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe controle para objetos do tipo Citacao, onde serão contidos, valores e
 * métodos para o mesmo.
 *
 * @author Carlos e Flavio
 *
 */
public class ControleCitacao {

    /**
     *
     * @author Flávio /** Método para controlar como deve ser salvo no banco o
     * autor. O metodo impede que campos em branco e *null não sejam inseridos
     * no modelo persistencia. exceções são inicializadas caso não atenda as
     * necessidades pedidas
     *
     * @author Carlos e Flavio
     * @param citacao Citacao -contem valores do tipo da variável.
     */
    public void cadastrar(Citacao citacao) {
        try {
            if (citacao.getTexto().equals("")) {
                JOptionPane.showMessageDialog(null, new CampoNuloException("Preencha os campos corretamente").getMessage());
            }
            new CitacaoDao().salvar(citacao);
            JOptionPane.showMessageDialog(null, "Cadastro realizado!");
        } catch (CampoNuloException cn) {
            JOptionPane.showMessageDialog(null, cn.getMessage());
        }
    }

    /**
     * Método para controlar como deve ser feita a alteração no banco. O metodo
     * impede objetos null e dispara uma exceção para que seja feita de forma
     * correta pelo usuario
     *
     * @author Carlos e Flavio
     * @param citacao Citacao -contem valores do tipo da variável.
     */
    public void alterar(Citacao citacao) {
        if (citacao != null) {
            new CitacaoDao().alterar(citacao);
            JOptionPane.showMessageDialog(null, "Cadastro alterado!");
        }
    }

    /**
     * esse metodo recebe um livro e busca o tituto do mesmo e retorna todas as
     * citações referentes a este livro
     *
     * @param livro vem da view com o titulo do livro no construtor
     * @return 
     */
    public List<Citacao> buscarTitulo(Livro livro) {
        if (livro.getTitulo().equals("")) {
            JOptionPane.showMessageDialog(null, new CampoNuloException("Preencha os campos corretamente").getMessage());
            return null;
        }
        return new CitacaoDao().buscaCitacoesPorLivro(livro);
    }

    /**
     * esse metodo recebe um autor no parametro e busca tal autor nas citações
     * salvas no banco ele retorna uma lista de citações referente ao autor
     * passado no parametro
     *
     * @param autor vem da view com o nome do autor no construtor
     * @return
     */
    public List<Citacao> buscarAutor(Autor autor) {
        if (autor.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, new CampoNuloException("Preencha os campos corretamente").getMessage());
            return null;
        }
        return new CitacaoDao().buscaCitacoesPorAutor(autor);
    }

}
