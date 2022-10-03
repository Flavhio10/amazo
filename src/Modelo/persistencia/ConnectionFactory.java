package Modelo.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe com padrão singleton que gerencia a inicialização do banco de dados.
 *
 * @author Carlos e Flavio
 *
 */
public class ConnectionFactory {

    private static ConnectionFactory conexao;
    private EntityManager gerenciador;

    /**
     * Método para inicializar o banco de dados
     *
     * @author Carlos e Flavio
     */
    private ConnectionFactory() {
        /**
         * esse atributo faz conexão com o banco de dados
         */
        EntityManagerFactory em = Persistence.createEntityManagerFactory("AMAZOPU");
        gerenciador = em.createEntityManager();
    }
        /**
     * Método para gerenciar o banco.
     *
     * @author Carlos e Flavio
     * @return ConnectionFactory - Inicilização do banco.
     */
    public static ConnectionFactory getInstance() {
        if (conexao == null) {
            conexao = new ConnectionFactory();
        }
        return conexao;
    }
     /**
     * Método para administrar a interação com banco.
     *
     * @author Carlos e Flavio
     * @return EntityManager - persistencia.
     */
    public EntityManager getGerenciador() {
        return gerenciador;
    }
}
