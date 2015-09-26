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
    
    private int Codigo;
    private String Nome;
    private String CPF;
    private String Telefone;
    private String Endereco;
    
    
    private static int contadorCodigo = +1; 
    
    //construtor
    
    public Cliente() {
    
        System.out.println("Clientes");
        
        //Para atualizar o codigo dos clientes em cadastro
        
        Codigo = contadorCodigo;
        
        contadorCodigo++;
    }
       
    /**
     *
     * @param Nome
     * @param CPF
     * @param Telefone
     * @param Endereco
     */
    public Cliente (String Nome,
                   String CPF,
                   String Telefone,
                   String Endereco){

        
        
                // criar um código autoincremental
            Codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo++;
        
        System.out.println("");
    
        
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        
    }
    public void imprimirDados() {
        
        System.out.println( toString() );
    
     }
    
    // sobrecarga do método toString da classe Object
    @Override
    public String toString() {
        
        String relatorio = "";
        relatorio += "Código: "+Codigo;
        relatorio += "\nNome: "+Nome;
        relatorio += "\nCPF: "+CPF;
        relatorio += "\nTelefone: "+Telefone;        
        relatorio += "\nLogradouro: "+Endereco;
        
        return relatorio;
    }

    


    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public static int getContadorCodigo() {
        return contadorCodigo;
    }

    public static void setContadorCodigo(int contadorCodigo) {
        Cliente.contadorCodigo = contadorCodigo;
    }
}
