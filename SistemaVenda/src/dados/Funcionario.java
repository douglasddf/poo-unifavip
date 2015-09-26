/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author alunofavip
 */
public class Funcionario {  
  
    private int codigo;
    private String nome;
    private String email;
    private double CPF;
    private double Tel;
    
    // variavel auxiliar
    private static int contadorCodigo = 1;
    
    // Construtor default
    public Funcionario() {
        System.out.println("Construtor default de Produto");
        
        // criar um código autoincremental
        codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo++;
    }
    
    public Funcionario(String nome,
                   String email,
                   double CPF, 
                   double Tel) {
        
                // criar um código autoincremental
        codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo++;
        
        System.out.println("Construtor com argumentos");
        
        
        this.nome = nome;
        this.email = email;
        this.CPF   = CPF;
        this.Tel = Tel;
    }
    
    
    
    
    // METODOS

    public void imprimirDados() {
        
        System.out.println( toString() );
    }
    
    
    // sobrecarga do método toString da classe Object
    @Override
    public String toString() {
        
        String relatorio = "";
        relatorio += "Código: "+codigo;
        relatorio += "\nNome: "+nome;
        relatorio += "\nDescrição: "+email;
        relatorio += "\nPreço custo: "+Tel;        
        relatorio += "\nPreço venda: "+CPF;
        
        return relatorio;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return email;
    }

    public void setDesc(String desc) {
        this.email = email;
    }

    public double getPrecoVenda() {
        return CPF;
    }

    public void setPrecoVenda(double precoVenda) {
        this.CPF = CPF;
    }

    public double getPrecoCusto() {
        return Tel;
    }

    public void setPrecoCusto(double precoCusto) {
        this.Tel = precoCusto;
    }
    
}

    

