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
public class RepositorioCliente extends AbstractTableModel {

 //Constates Para Identificar Colunas
   private final int NOME = 0;
   private final int CPF = 1;
   private final int TELEFONE = 2;
   private final int EMAIL = 3 ;
   private final int CODIGO = 4;
   
 
 //Variaveis
  private ArrayList<Cliente> listaClientes ;
  private final String[] colunas = {"Nome","Cpf","Email","Telefone","Código"};
  
  //Métodos
  
  public RepositorioCliente(){
      //Inicia Uma lista vazia
      this.listaClientes = new ArrayList<>();
  }
  
  public void AtualizaTableC () {
      fireTableDataChanged();
  }
  
 public void addCliente(Cliente c) {
     //Adiciona Cliente
     this.listaClientes.add(c);
     fireTableDataChanged();
 } 
 public void removeCliente(int linha) {
   this.listaClientes.remove(linha);
   fireTableDataChanged();
 }
 
 public Cliente editarCliente(String nome) {
     Cliente c = null;
     for (int i = 0; i < this.listaClientes.size(); i++) {
      Cliente get = this.listaClientes.get(i);
      if (get.getNome() == nome) {
        c = get;  
      }
         
     }
     return c;
 }
 
//Método Para Pesquisar Por Nome
 
public Cliente pesquisarCliente(int codigo){
Cliente cliente = null;
    for (int i = 0; i < this.listaClientes.size(); i++) {
        Cliente get = this.listaClientes.get(i);
        if (get != null && get.getCodigo()== codigo ){
           cliente = get; 
        }
        
    }
    return cliente;
}

public Cliente getCliente(int linha){
 //Pega Os Dados do Cliente de Acordo Com A Linha
  return this.listaClientes.get(linha);
}

    
    
    @Override
    public int getRowCount() {
     //Retorna O Total De Linhas da Tabela
     return this.listaClientes.size();
    }

    @Override
    public int getColumnCount() {
      //Retorna O Total De Colunas
     return colunas.length;   
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Cliente cliente = this.listaClientes.get(rowIndex);
      switch (columnIndex){
          case NOME:
              return cliente.getNome();
          case CPF:
              return cliente.getCpf();
          case EMAIL:
              return cliente.getEmail();
          case TELEFONE:
              return cliente.getTelefone();
          case CODIGO:
              return cliente.getCodigo();
          default:
              return cliente;
      }
    }
    
   //Método Para Atribuir Os Titulos Da Coluna

    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }
    
    
    
}
