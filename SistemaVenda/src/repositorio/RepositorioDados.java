/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Produto;
import java.util.ArrayList;

/**
 * Essa classe é responsável por gerenciar os dados do sistema.
 * 
 * @author Douglas Frari
 */
public class RepositorioDados {
    
    /*
    // LOGICA USADA PARA ARRAY estático
    
    private static final int MAXIMO = 3;
    private static int posicaoLivre = 0;
    private static Produto[] listaProdutos = new Produto[MAXIMO];
    */
    
    // lista dinamica
    private static ArrayList<Produto> listaProdutos = new ArrayList();
    
    
    /**
     * Estrutura para carregar dados FAKE na memória
     */
    public static void inicializandoDados() {
        
        // criando os objetos diretamente
        Produto p1 = new Produto("Produto 1" , "... ", 1000.0, 500.55);
        Produto p2 = new Produto("Produto 2" , "... ", 3000.0, 1500.55);
        Produto p3 = new Produto("Produto 3" , "... ", 800.0, 200.55);
        
        /* povoar o array de dados estático
        
        listaProdutos[0] = p1;
        listaProdutos[1] = p2;
        listaProdutos[2] = p3;
        */
        
        // povoar estrutura dinamica (se tiver muitos itens pode-se usar laço)
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
    }
    
    
    /**
     * Permite adicionar um objeto Produto.
     * 
     * @param p um objeto Produto para ser adicionado.
     */
    public static void adicionarProduto(Produto p) {
        
        /* LOGICA USADA PARA ARRAY estático
         adiciona o objeto Produto para o array
//        listaProdutos[posicaoLivre] = p;
         atualizar o valor do contador livre
//        posicaoLivre++;
       */
        listaProdutos.add(p);
    }
    
    /**
     * Verifica se ainda tem espaço
     * @return true se tem espaço ou falso, caso contrário.
     * 
     * @deprecated Esse método tornou-se obsoleto usando Collection de Java. 
     */
    public static boolean temEspaco() {
        
//        return posicaoLivre < MAXIMO;

        // com a estrutura dinamica nao é necessário chevar o tamanho MAXIMO
        return listaProdutos != null; 
    }
    
    /**
     * Esse método faz a busca na lista de produtos.
     * @param codigo o codigo a ser pesquisado
     * @return um objeto Produto se o codigo foi encontrado, 
     * caso contrario, retorna null.
     */
    public static Produto pesquisarProdutoPeloCodigo(int codigo) {
        Produto produto = null;
        
        // usando laço For each: 
        // http://www.javaprogressivo.net/2012/09/o-laco-for-para-arrays.html
        for (Produto produtoAtual : listaProdutos) {
            if (produtoAtual.getCodigo() == codigo) {
                // achei o produto com o codigo correspondente
                produto = produtoAtual;
                break;
            }
        }

        
        return produto;
    }

    /**
     * Permite atualizar o valor do objeto
     * 
     * @param produto  objeto Produto a ser editado.
     */
    public static void editarProduto(Produto produto) {
        
        for (Produto p : listaProdutos) {
            if (p.getCodigo() == produto.getCodigo()) {
                p = produto;
                break;
            }
        }
        
    }
    
} // fim classe
