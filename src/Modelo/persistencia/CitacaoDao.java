package Modelo.persistencia;

import Modelo.Autor;
import Modelo.Citacao;
import Modelo.Livro;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 * Classe para objetos do tipo Citação, onde os dados contidos são inseridos no
 * banco de dados.
 *
 * @author Carlos e Flavio
 *
 */
public class CitacaoDao implements InterfaceDao<Citacao> {

    private EntityManager gerenciador;
    /**
     * Método para inicializar o banco de dados
     *
     * @author Carlos e Flavio
     */
    public CitacaoDao() {
        this.gerenciador = ConnectionFactory.getInstance().getGerenciador();
    }
    /**
     * Método para salvar o autor incluido no sistema
     *
     * @author Carlos e Flavio
     * @param citacao Citacao -contem valores do tipo da variável.
     */
    @Override
    public void salvar(Citacao citacao) {
        //Objeto que controla um operação no banco de dados
        EntityTransaction transacao = gerenciador.getTransaction();
        //Inicia a transação
        transacao.begin();
        //armazena o objeto no banco
        gerenciador.persist(citacao);
        //Registra definitivamente as operações no banco
        transacao.commit();
    }
     /**
     * Método para mostrar todas as citações incluida no banco de dados
     *
     * @author Carlos e Flavio
     * @return List - Lista de autores
     */
    @Override
    public List<Citacao> listarTodos() {
        //String na linguagem HQL(linguagem que faz buscas em bancos com Hibernate)
        String consultaHql = "select citacao from Citacao as citacao where 1=1";
        //Objeto de consulta
        Query consulta = gerenciador.createQuery(consultaHql);
        //Método getResultList executa consulta no banco
        return consulta.getResultList();
    }
    /**
     * Método para buscar as citações por livros incluida no banco de dados
     *
     * @author Carlos e Flavio
     * @param livro Livro -contem valores do tipo da variável.
     * @return List - Lista de citacao
     */
    public List<Citacao> buscaCitacoesPorLivro(Livro livro) {
        List<Citacao> listaCitacoes = new ArrayList<>();        
        List<Citacao> temp = new ArrayList<>();
        listaCitacoes.addAll(this.listarTodos());
        for (int i = 0; i < listaCitacoes.size(); i++) {
            if (listaCitacoes.get(i).getLivro().getTitulo().toUpperCase().contains(livro.getTitulo().toUpperCase())) {
                temp.add(listaCitacoes.get(i));
            }
        }
       
        return temp;
    }
    /**
     * Método para buscar as citações por autores incluida no banco de dados
     *
     * @author Carlos e Flavio
     * @param autor Autor -contem valores do tipo da variável.
     * @return List - Lista de citacao
     */
    public List<Citacao> buscaCitacoesPorAutor(Autor autor) {
        List<Citacao> listaCitacoes = new ArrayList<>();
        List<Citacao> temp = new ArrayList<>();
        listaCitacoes.addAll(this.listarTodos());
        for (int i = 0; i < listaCitacoes.size(); i++) {
            if (listaCitacoes.get(i).getAutor().getNome().toUpperCase().contains(autor.getNome().toUpperCase())) {
                temp.add(listaCitacoes.get(i));
            }
        }
        return temp;
    }
    
    /**
     * Método para alterar o autor incluido no banco de dados
     *
     * @author Carlos e Flavio
     * @param citacao Citacao -contem valores do tipo da variável.
     */
    @Override
    public void alterar(Citacao citacao) {
        //Objeto que controla um operação no banco de dados
        EntityTransaction transacao = gerenciador.getTransaction();
        //Inicia a transação
        transacao.begin();
        //armazena o objeto no banco
        gerenciador.merge(citacao);
        //Registra definitivamente as operações no banco
        transacao.commit();
    }

  
}
