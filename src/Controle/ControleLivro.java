package Controle;

import Controle.excecoes.CampoNuloException;
import Modelo.Livro;
import Modelo.persistencia.LivroDao;
import javax.swing.JOptionPane;

/**
 * Classe controle para objetos do tipo Livro, onde serão contidos, valores e
 * métodos para o mesmo.
 *
 * @author Carlos e Flavio
 *
 */
public class ControleLivro {

    /**
     * Método para controlar como deve ser salvo no banco o autor. O metodo
     * impede que campos em branco e *null não sejam inseridos no modelo
     * persistencia. exceções são inicializadas caso não atenda as necessidades
     * pedidas
     *
     * @author Carlos e Flavio
     * @param livro Livro -contem valores do tipo da variável.
     */
    public void cadastrar(Livro livro) {
        try {
            if (livro.getTitulo().equals("") || livro.getIsbn() == 0) {
                JOptionPane.showMessageDialog(null, new CampoNuloException("Preencha os campos corretamente").getMessage());
            }
            new LivroDao().salvar(livro);
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
     * @param livro Livro -contem valores do tipo da variável.
     */
    public void alterar(Livro livro) {
        try {
            if (livro.getTitulo().equals("") || livro.getIsbn() < 0) {
                JOptionPane.showMessageDialog(null, new CampoNuloException("Preencha os campos corretamente").getMessage());
            } else {
                new LivroDao().alterar(livro);
                JOptionPane.showMessageDialog(null, "Cadastro alterado!");
            }
        } catch (CampoNuloException cne) {
            JOptionPane.showMessageDialog(null, new CampoNuloException("Por favor, dados incorretos!").getMessage());
        }
    }

}
