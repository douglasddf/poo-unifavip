/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Douglas
 */
public class Venda {
    
    private int codigo;
    private Date data = new Date();
    private ArrayList<ItensVenda>itensVenda = new ArrayList<>();
    
    
    private static int codigoAutoIncremento = 1;
    
    
    public Venda() {
        this.codigo = codigoAutoIncremento++;
    }

    public void adicionarItemVenda(Produto produto, int quantidade) {
        ItensVenda itemProduto = new ItensVenda(quantidade, produto);        
        this.itensVenda.add(itemProduto);
    }
    
    public ArrayList<ItensVenda> mostrarProdutosDaVenda() {
        
        System.out.println(toString());
        
        return itensVenda;
    } 

    /**
     * Como saber qual funcionário efetuou a venda?
     */
    @Override
    public String toString() {
        String dadosVenda = "#######################################";
        
        if(itensVenda.isEmpty()) {
            
            dadosVenda += "\n- NENHUM PRODUTO ADICIONADO AINDA -";
            dadosVenda += "\n#######################################";
            
            return dadosVenda;
        }
        
        dadosVenda += "\nCódigo: "+codigo;
        dadosVenda += "\nData: "+data.toString();
        float totalCusto=0, totalVenda=0, totalLucro = 0;
        
        
        
        for (ItensVenda itemProduto : itensVenda) {
            
            double totalLucroDestesItens = 0;
            double totalVendaDestesItens = 0;
            double totalCustoDestesItens = 0;
            
            Produto produto = itemProduto.getProduto();
            int quantidade = itemProduto.getQuantidade();
            
           dadosVenda += "\n-----------------------";
           dadosVenda += "\nitens vendidos: "+quantidade;
           dadosVenda += "\n----------- Produtos vendidos -----------";
            
            dadosVenda += "\n"+produto;
            dadosVenda += "\n--";
                
            totalVendaDestesItens += produto.getPrecoVenda();
            totalCustoDestesItens += produto.getPrecoCusto();
            totalLucroDestesItens += (produto.getPrecoVenda()-produto.getPrecoCusto());
            
            
            totalVenda += totalVendaDestesItens * quantidade;
            totalCusto += totalCustoDestesItens * quantidade;
            totalLucro += totalLucroDestesItens * quantidade;
            
            dadosVenda += "\nvenda total destes itens: "+totalVendaDestesItens * quantidade;
            dadosVenda += "\ncusto total destes itens: "+totalCustoDestesItens * quantidade;
            dadosVenda += "\nlucro total destes itens: "+totalLucroDestesItens * quantidade;
            
            dadosVenda += "\n-----------------------";
        }
        
        dadosVenda += "\nTOTAL Venda: "+totalVenda;
        dadosVenda += "\nTOTAL Custo: "+totalCusto;
        dadosVenda += "\nTOTAL Lucro: "+totalLucro;
        dadosVenda += "\n#######################################";
        
        return dadosVenda;
    }
}
