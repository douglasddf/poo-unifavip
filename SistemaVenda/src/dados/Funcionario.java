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

    /**
     * @return the contadorCodigoF
     */
    public static int getContadorCodigoF() {
        return contadorCodigoF;
    }

    /**
     * @param aContadorCodigoF the contadorCodigoF to set
     */
    public static void setContadorCodigoF(int aContadorCodigoF) {
        contadorCodigoF = aContadorCodigoF;
    }
    
    // atributos
    
    private int codigoF;
    private String nomeF;
    private int cpf;
    private int idade;
    private String profissao;
    private String email;
    private int telefone;
    
    // variavel auxiliar
    private static int contadorCodigoF = 1;
    
    // Construtor default
    public Funcionario() {
        System.out.println("Construtor default de Funcionario");
        
        // criar um código autoincremental
        codigoF = contadorCodigoF;
        
        // atualizar o contador de codigo
        contadorCodigoF++;
    }
    
    public Funcionario(String nomeF,
                   int cpf,
                   int idade, 
                   String profissao,
                   String email,
                   int telefone) {
        
                // criar um código autoincremental
        codigoF = contadorCodigoF;
        
        // atualizar o contador de codigo
        contadorCodigoF++;
        
        System.out.println("Construtor com argumentos");
        
        
        this.nomeF = nomeF;
        this.cpf = cpf;
        this.idade = idade;
        this.profissao = profissao;
        this.email = email;
        this. telefone = telefone;
    }
    
    
    
    
    // METODOS

    public void imprimirDados() {
        
        System.out.println( toString() );
    }
    
    
    // sobrecarga do método toString da classe Object
    @Override
    public String toString() {
        
        String relatorio = "";
        relatorio += "Código: "+getCodigoF();
        relatorio += "\nNome: "+getNomeF();
        relatorio += "\nCPF: "+getCpf();
        relatorio += "\nIdade: "+getIdade();        
        relatorio += "\nProfissao: "+getProfissao();
        relatorio += "\nE-mail: "+getEmail();
        relatorio += "\nTelefone: "+getTelefone();
        
        
        return relatorio;
    }


    public int getCodigo() {
        return getCodigoF();
    }

    /**
     * @return the codigoF
     */
    public int getCodigoF() {
        return codigoF;
    }

    /**
     * @return the nomeF
     */
    public String getNomeF() {
        return nomeF;
    }

    /**
     * @param nomeF the nomeF to set
     */
    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    
}
