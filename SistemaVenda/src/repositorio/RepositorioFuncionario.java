/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author alunofavip
 */
public class RepositorioFuncionario {
    
    private static ArrayList<Funcionario> listaFuncionario = new ArrayList();
    
    
    /**
     * Estrutura para carregar dados FAKE na memória
     */
    public static void inicializandoDadosF() {
        
        // criando os objetos diretamente
        Funcionario p1f = new Funcionario("Funcionario 1" , "... ","...","...",);
        Funcionario p2f = new Funcionario("Funcionario 2" , "... ");
        Funcionario p3f = new Funcionario("Funcionario 3" , "... ");
        
        /* povoar o array de dados estático
        
        listaFuncionario[0] = p1;
        listaFuncionario[1] = p2;
        listaFuncionario[2] = p3;
        */
        
        // povoar estrutura dinamica (se tiver muitos itens pode-se usar laço)
        listaFuncionario.add(p1f);
        listaFuncionario.add(p2f);
        listaFuncionario.add(p3f);
    }
    
    
    /**
     * Permite adicionar um objeto Produto.
     * 
     * @param f um objeto Produto para ser adicionado.
     */
    public static void adicionarFuncionario(Funcionario f) {
        
        /* LOGICA USADA PARA ARRAY estático
         adiciona o objeto Produto para o array
//        listaProdutos[posicaoLivre] = p;
         atualizar o valor do contador livre
//        posicaoLivre++;
       */
        listaFuncionario.add(f);
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
        return listaFuncionario != null; 
    }
    
    /**
     * Esse método faz a busca na lista de produtos.
     * @param codigo o codigo a ser pesquisado
     * @return um objeto Produto se o codigo foi encontrado, 
     * caso contrario, retorna null.
     */
    public static Funcionario pesquisarFuncionarioPeloCodigo(int codigo) {
        Funcionario funcionario = null;
        
        // usando laço For each: 
        // http://www.javaprogressivo.net/2012/09/o-laco-for-para-arrays.html
        for (Funcionario funcionarioAtual : listaFuncionario) {
            if (funcionarioAtual.getCodigo() == codigo) {
                // achei o produto com o codigo correspondente
                funcionario = funcionarioAtual;
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
        
        return funcionario;
    }

    /**
     * Permite atualizar o valor do objeto
     * 
     * @param funcionario  objeto Produto a ser editado.
     */
    public static void editarFuncionario(Funcionario funcionario) {
        
        for (Funcionario p : listaFuncionario) {
            if (p.getCodigoF() == funcionario.getCodigoF()) {
                p = funcionario;
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
