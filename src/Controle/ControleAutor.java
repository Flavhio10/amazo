package Controle;

import Controle.excecoes.CampoNuloException;
import Modelo.Autor;
import Modelo.persistencia.AutorDao;
import javax.swing.JOptionPane;

/**
 * Classe controle para objetos do tipo Autor, onde serão contidos, valores e
 * métodos para o mesmo.
 *
 * @author Carlos e Flavio
 *
 */
public class ControleAutor {

    /**
     * Método para controlar como deve ser salvo no banco o autor. O metodo
     * impede que campos em branco e *null não sejam inseridos no modelo
     * persistencia. exceções são inicializadas caso não atenda as necessidades
     * pedidas
     *
     * @author Carlos e Flavio
     * @param autor Autor -contem valores do tipo da variável.
     */
    public void cadastrar(Autor autor) {
        try {
            if (autor.getNome().equals("")) {
                JOptionPane.showMessageDialog(null, new CampoNuloException("Preencha os campos corretamente").getMessage());
            } else {
                new AutorDao().salvar(autor);
                JOptionPane.showMessageDialog(null, "Cadastro realizado!");
            }
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
     * @param autor Autor -contem valores do tipo da variável.
     */
    public void alterar(Autor autor) {
        if (autor != null) {
            new AutorDao().alterar(autor);
            JOptionPane.showMessageDialog(null, "Cadastro alterado!");
        } else {
            //exceção
        }
    }

    public void alerta() {

    }

}
