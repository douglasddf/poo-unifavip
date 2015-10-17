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
public class Funcionario {
    
    private int codigo;
    private String nome;
    private double acumuladoLucroVendas;
    private int quantidadeVendas;

    private static int contador = 1;
    
    public Funcionario(String nome) {
        this.nome = nome;
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
        relatorio += "\nnome: "+nome;
        relatorio += "\nacumulado lucros: "+acumuladoLucroVendas;
        relatorio += "\nquantida de vendas: "+quantidadeVendas;
        
        return relatorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getCodigo() {
        return codigo;
    }
    
    
    
}
