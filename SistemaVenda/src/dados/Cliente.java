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
public class Cliente extends Pessoa {
    
    
    private boolean ehMasculino;
    private String dataNascimento;
    private double lucroTotalAcumulado;
    private int quantidadeProdutosComprados;

    
    private static int contadorAutoIncremental;
    
    public Cliente() {
        super();
        codigo = ++contadorAutoIncremental;
        
    }

    public Cliente(String nome, boolean ehMasculino, String dataNascimento) {
        super(nome);
        codigo = ++contadorAutoIncremental;
        
        
        this.ehMasculino = ehMasculino;
        this.dataNascimento = dataNascimento;
       
    }
    
    
    
    
    

    public boolean isEhMasculino() {
        return ehMasculino;
    }

    public void setEhMasculino(boolean ehMasculino) {
        this.ehMasculino = ehMasculino;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getLucroTotalAcumulado() {
        return lucroTotalAcumulado;
    }

    public void setLucroTotalAcumulado(double lucroTotalAcumulado) {
        this.lucroTotalAcumulado = lucroTotalAcumulado;
    }

    public int getQuantidadeProdutosComprados() {
        return quantidadeProdutosComprados;
    }

    public void setQuantidadeProdutosComprados(int quantidadeProdutosComprados) {
        this.quantidadeProdutosComprados = quantidadeProdutosComprados;
    }
    
    
    
}
