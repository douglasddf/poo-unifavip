/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import dados.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Thiago Luna
 */
public class RepositorioDadosCliente {
    
    public static ArrayList<Cliente> ListaClientes = new ArrayList<>();
    
    public static void adicionarCliente (Cliente cliente){
        ListaClientes.add(cliente);
    }
    
    public static Cliente pesquisarClientePeloCodigo (int codigo){
        Cliente c = null;
        for (Cliente clienteAtual : ListaClientes){
            if (clienteAtual.getCodigo() == codigo){
                c = clienteAtual;
                break;
            }
        }
        return c;
    }
    public static void editarCliente (Cliente c){
        for (Cliente cliente : ListaClientes){
            if (cliente.getCodigo() == cliente.getCodigo()){
                cliente = c;
                break;
            }
        }
    }
    
}
