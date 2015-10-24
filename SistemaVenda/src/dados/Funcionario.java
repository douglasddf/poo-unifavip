/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Douglas
 */
public class Funcionario extends Pessoa {
    
    
    private double acumuladoLucroVendas;
    private int quantidadeVendas;

    private static int contador = 1;
    
    public Funcionario(String nome) {
        super(nome);
        this.codigo = contador++;
        
    }
    
    public void atualizarLucroDeVendas(double lucro) {
        acumuladoLucroVendas += lucro;
    }
    
    public void atualizarQuantideDeVendas(int quantidadeAtualDaVenda) {
        quantidadeVendas += quantidadeAtualDaVenda;
    }

    @Override
    public String toString() {
        String relatorio = "";
        
        relatorio += "código: "+codigo;
        relatorio += "\nnome: "+super.getNome();
        relatorio += "\nacumulado lucros: "+acumuladoLucroVendas;
        relatorio += "\nquantida de vendas: "+quantidadeVendas;
        
        return relatorio;
    }

  

    public double getAcumuladoLucroVendas() {
        return acumuladoLucroVendas;
    }

    public void setAcumuladoLucroVendas(double acumuladoLucroVendas) {
        this.acumuladoLucroVendas = acumuladoLucroVendas;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }


    
    
    
}
