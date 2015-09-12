/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas
 */
public class RepositorioDados {
    
    private static final int MAXIMO = 3;
    private static int posicaoLivre = 0;
    private static Produto[] listaProdutos = new Produto[MAXIMO];
    
    
    
    public static void adicionarProduto(Produto p) {
        
        // adiciona o objeto Produto para o array
        listaProdutos[posicaoLivre] = p;
        
        // atualizar o valor do contador livre
        posicaoLivre++;
      
    }
    
    
    public static boolean temEspaco() {
        
        return posicaoLivre < MAXIMO;
    }
    
    /**
     * Esse método faz a busca na lista de produtos.
     * @param codigo o codigo a ser pesquisado
     * @return um objeto Produto se o codigo foi encontrado, 
     * caso contrario, retorna null.
     */
    public static Produto pesquisarProdutoPeloCodigo(int codigo) {
        Produto produto = null;
        
        // pesquisar na lista de Produtos 
        for (int i = 0; i < listaProdutos.length; i++) {
            // recuperar o Produto atual e comparar o codigo
            Produto p = listaProdutos[i];
            if (p != null && p.getCodigo() == codigo) {
                // achei o produto com o codigo correspondente
                
                produto = p;
                break;
            }
        } // fim laco for
        
        return produto;
    }
}











