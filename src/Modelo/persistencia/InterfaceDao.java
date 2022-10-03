package Modelo.persistencia;

import java.util.Collection;

/**
 * Carrega metodos que precisam ser implementados pelas classes que  implementarão esta interface
 *
 * @author Flávio
 * @param <T>
 */
public interface InterfaceDao<T> {

    Collection<T> listarTodos();

    void salvar(T objeto);

    void alterar(T objeto);
}
