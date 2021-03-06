package br.edu.ifpb.praticas.repositorios;

import br.edu.ifpb.praticas.entidade.Filme;
import java.util.List;


public interface Repositorio<E> {

    void salvar(E obj);

    void atualizar(Filme p);

    void remover(E obj);

    E consultar(Long id);

    List<E> listarTodos();

}
