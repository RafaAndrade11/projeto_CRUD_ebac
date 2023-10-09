package br.com.randrade.dao;

import br.com.randrade.domain.Cliente;

import java.util.Collection;

/**
 * @author rafael.andrade
 */

public interface IClienteDAO {

    public Boolean cadatrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarTodos();
}