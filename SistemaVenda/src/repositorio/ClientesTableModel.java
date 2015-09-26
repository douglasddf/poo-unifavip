/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alunofavip
 */
public class ClientesTableModel extends AbstractTableModel {
    //constantes
    private final int NOME = 0; 
    private final int EMAIL = 1; 
    private final int ENDERECO = 2; 
    private final int CEP = 3;
    private final int CIDADE = 4;  
    private final int TELEFONE = 5;
    private final int CELULAR = 6; 
 
    //variaveis 
    private final ArrayList<Cliente> listaClientes = new ArrayList(); 
    private final String[] colunas = {"nome", "email", "endereco", "cep", "cidade", "bairro", "telefone", "celular"};
    
    
    public void addCliente(Cliente cliente){
        listaClientes.add(cliente);
        fireTableDataChanged();
    }
    
    public void excluirCliente(Cliente cliente){
        listaClientes.remove(cliente); 
        fireTableDataChanged();
    }
    
    public Cliente pesquisarCliente(String nome){
        Cliente cliente = null; 
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente get = listaClientes.get(i);
            if (get != null && get.getNome() == nome){
                cliente = get; 
            }
        }
        return cliente;
    }
    
    @Override
    public int getRowCount() {
        return listaClientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = this.listaClientes.get(rowIndex);
        
        switch (columnIndex){
            case NOME: 
                return cliente.getNome(); 
            case EMAIL: 
                return cliente.getEmail();
            case ENDERECO:
                return cliente.getEndereco();
            case CEP: 
                return cliente.getCep(); 
            case CIDADE: 
                return cliente.getCidade();
            case TELEFONE:
                return cliente.getTelefone();
            case CELULAR: 
                return cliente.getCelular();
            default:
                return cliente;
        }
    }
        
    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }
    
}
