/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Produto;
import java.util.ArrayList;

/**
 *
 * @author Douglas
 */
public class RepositorioDados {
    
    private static final int MAXIMO = 3;
    private static int posicaoLivre = 0;
   //private static Produto[] listaProdutos = new Produto[MAXIMO];
    private static ArrayList<Produto> listaProdutos = new ArrayList();
    
    
    
    public static void inicializandoDados() {
        
        // criando os objetos diretamente
        Produto p1 = new Produto("Produto 1" , "... ", 1000.0, 500.55);
        Produto p2 = new Produto("Produto 2" , "... ", 3000.0, 1500.55);
        Produto p3 = new Produto("Produto 3" , "... ", 800.0, 200.55);
        
        // povoar o array de dados
//        listaProdutos[0] = p1;
//        listaProdutos[1] = p2;
//        listaProdutos[2] = p3;
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
    }
    
    
    public static void adicionarProduto(Produto p) {
        
        // adiciona o objeto Produto para o array
        //listaProdutos[posicaoLivre] = p;
        
        listaProdutos.add(p);
        
        // atualizar o valor do contador livre
//        posicaoLivre++;
      
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
        
        
        for (Produto produtoAtual : listaProdutos) {
            
            if (produtoAtual.getCodigo() == codigo) {
                // achei o produto com o codigo correspondente
                produto = produtoAtual;
                break;
            }
        }
//        // pesquisar na lista de Produtos 
//        for (int i = 0; i < listaProdutos.length; i++) {
//            // recuperar o Produto atual e comparar o codigo
//            Produto p = listaProdutos[i];
//            if (p != null && p.getCodigo() == codigo) {
//                // achei o produto com o codigo correspondente
//                
//                produto = p;
//                break;
//            }
//        } // fim laco for
        
        return produto;
    }

    public static void editarProduto(Produto produto) {
        
        for (Produto p : listaProdutos) {
            if (p.getCodigo() == produto.getCodigo()) {
                p = produto;
                break;
            }
        }
        
//        for (int i = 0; i < listaProdutos.length; i++) {
//            if (listaProdutos[i].getCodigo() == produto.getCodigo()) {
//                listaProdutos[i] = produto;
//                break;
//            }
//        }
        
    }
}











