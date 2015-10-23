/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavenda;

import dados.*;
import java.util.ArrayList;
import telas.TelaPrincipal;
import repositorio.RepositorioProdutos;

/**
 *
 * @author Douglas
 */
public class SistemaVenda {
    
    public static void main(String[] args) {
        System.out.println("Testando main()");
        
        RepositorioProdutos.inicializandoDados();
     
        //TelaPrincipal tela = new TelaPrincipal();
        
        Funcionario funcionario = new Funcionario("Joao Maria Jose");
        Cliente cliente1 = new Cliente("Xuxa", false, "23/10/2015");
        
        
        Venda venda1 = new Venda(funcionario,cliente1);
        
       
        Produto produto1 = new Produto("PC", "descricao...", 1000, 550);
        Produto produto2 = new Produto("Notebook", "descricao...", 2000, 1250);
        Produto produto3 = new Produto("Capa iPhone 6s", "capa ...", 300, 50);
        
        
        
        venda1.adicionarItemVenda(produto1, 1);
        venda1.adicionarItemVenda(produto2, 1);
        venda1.adicionarItemVenda(produto3, 3);
        
        // como exibir os dados da venda?
        System.out.println("VENDA1: \n\n"+venda1);
        
        
        
        
        
    }
    
}
