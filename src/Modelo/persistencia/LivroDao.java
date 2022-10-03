package Modelo.persistencia;

import Modelo.Livro;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 * Classe para objetos do tipo Livro, onde os dados contidos são inseridos no
 * banco de dados.
 *
 * @author Carlos e Flavio
 *
 */
public class LivroDao implements InterfaceDao<Livro> {

    private EntityManager gerenciador;

    /**
     * Método para inicializar o banco de dados
     *
     * @author Carlos e Flavio
     */
    public LivroDao() {
        this.gerenciador = ConnectionFactory.getInstance().getGerenciador();
    }

    /**
     * Método para salvar o livro incluido no sistema
     *
     * @author Carlos e Flavio
     * @param livro Livro -contem valores do tipo da variável.
     */
    @Override
    public void salvar(Livro livro) {
        //Objeto que controla um operação no banco de dados
        EntityTransaction transacao = gerenciador.getTransaction();
        //Inicia a transação
        transacao.begin();
        //armazena o objeto no banco
        gerenciador.persist(livro);
        //Registra definitivamente as operações no banco
        transacao.commit();
    }

    /**
     * Método para listar todos livros incluido no banco de dados
     *
     * @author Carlos e Flavio
     * @return List - Lista de livros
     */
    @Override
    public List<Livro> listarTodos() {
        //String na linguagem HQL(linguagem que faz buscas em bancos com Hibernate)
        String consultaHql = "select livro from Livro as livro where 1=1";
        //Objeto de consulta
        Query consulta = gerenciador.createQuery(consultaHql);
        //Método getResultList executa consulta no banco
        return consulta.getResultList();
    }

    /**
     * Método para buscar os livros por titulos incluido no banco de dados
     *
     * @author Carlos e Flavio
     * @param titulo Livro -contem valores do tipo da variável.
     * @return List - Lista de livros
     */
    public Livro buscaTituloLivro(Livro titulo) {

        List<Livro> listaLivro = new ArrayList<>();
        listaLivro.addAll(this.listarTodos());

        for (int i = 0; i < listaLivro.size(); i++) {
            if (listaLivro.get(i).equals(titulo)) {
                return listaLivro.get(i);
            }
        }
        return null;
    }

    /**
     * Método para alterar o livro incluido no banco de dados
     *
     * @author Carlos e Flavio
     * @param livro Livro -contem valores do tipo da variável.
     */
    @Override
    public void alterar(Livro livro) {
        //Objeto que controla um operação no banco de dados
        EntityTransaction transacao = gerenciador.getTransaction();
        //Inicia a transação
        transacao.begin();
        //armazena o objeto no banco
        gerenciador.merge(livro);
        //Registra definitivamente as operações no banco
        transacao.commit();
    }

}
