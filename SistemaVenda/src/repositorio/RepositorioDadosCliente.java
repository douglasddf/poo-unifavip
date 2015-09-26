/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

/**
 *
 * @author alunofavip
 */
import dados.Cliente;
import dados.Produto;
import java.util.ArrayList;


public class RepositorioDadosCliente {
    
    
    
     private static ArrayList<Produto> listaCliente = new ArrayList();
    
     
     public static Produto pesquisarProdutoPeloCodigo(int codigo) {
        Produto produto = null;
        
        
        
        for (Produto produtoAtual : listaCliente) {
            if (produtoAtual.getCodigo() == codigo) {
                produto = produtoAtual;
                break;
            }
        }

        
        return produto;
    }
    
 
}
