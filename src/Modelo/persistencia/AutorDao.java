package Modelo.persistencia;

import Modelo.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 * Classe para objetos do tipo Autor, onde os dados contidos são inseridos no
 * banco de dados.
 *
 * @author Carlos e Flavio
 *
 */
public class AutorDao implements InterfaceDao<Autor> {

    private EntityManager gerenciador;

    /**
     * Método para inicializar o banco de dados
     *
     * @author Carlos e Flavio
     */
    public AutorDao() {
        this.gerenciador = ConnectionFactory.getInstance().getGerenciador();
    }

    /**
     * Método para salvar o autor incluido no sistema
     *
     * @author Carlos e Flavio
     * @param autor Autor -contem valores do tipo da variável.
     */
    @Override
    public void salvar(Autor autor) {
        //Objeto que controla um operação no banco de dados
        EntityTransaction transacao = gerenciador.getTransaction();
        //Inicia a transação
        transacao.begin();
        //armazena o objeto no banco
        gerenciador.persist(autor);
        //Registra definitivamente as operações no banco
        transacao.commit();
    }
    /**
     * Método para mostrar todos os autores incluido no banco de dados
     *
     * @author Carlos e Flavio
     * @return List - Lista de autores
     */
    @Override
    public List<Autor> listarTodos() {
        //String na linguagem HQL(linguagem que faz buscas em bancos com Hibernate)
        String consultaHql = "select autor from Autor as autor where 1=1";
        //Objeto de consulta
        Query consulta = gerenciador.createQuery(consultaHql);
        //Método getResultList executa consulta no banco
        return consulta.getResultList();
    }
    /**
     * Método para alterar o autor incluido no banco de dados
     *
     * @author Carlos e Flavio
     * @param autor Autor -contem valores do tipo da variável.
     */
    @Override
    public void alterar(Autor autor) {
        //Objeto que controla um operação no banco de dados
        EntityTransaction transacao = gerenciador.getTransaction();
        //Inicia a transação
        transacao.begin();
        //altera o objeto no banco
        gerenciador.merge(autor);
        //Registra definitivamente as operações no banco
        transacao.commit();
    }

}
