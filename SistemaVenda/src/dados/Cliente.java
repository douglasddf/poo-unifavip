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
public class Cliente {
    
     // ATRIBUTOS
    private int codigo;
    private String nome;
    private String endereco;
    private String tel;
    private String cpf;
 
    
    // variavel auxiliar
    private static int contadorCodigo = 1;
    
    // Construtor default
    public Cliente() {
        System.out.println("Construtor default de Produto");
        
        // criar um código autoincremental
        codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo++;
    }
    
    public Cliente(String nome,
                   String endereco, String tel, String cpf) {
        
                // criar um código autoincremental
        codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo++;
        
        System.out.println("Construtor com argumentos");
        
        
        this.nome = nome;
        this.endereco = endereco;
        this.tel = tel;
        this.cpf = cpf;


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
        relatorio += "\nEndereço: "+endereco;    
        relatorio += "\nTelefone: "+tel;
        relatorio += "\nCPF: "+cpf;

        
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
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCPF(){
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String desc) {
        this.endereco = desc;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    
}

    

