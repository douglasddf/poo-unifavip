/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Thiago Luna
 */
public class Cliente {
    
    int codigo;
    String nome;
    String rua;
    String bairro;
    String cpf;
    int numero;
    String telefone;

    
    
    private static int codigoContador = 1;

    public Cliente(String nome, String rua, String bairro, String cpf, String telefone) {
        this.nome = nome;
        this.bairro = bairro;
        this.rua = rua;
        this.cpf = cpf;
        this.numero = numero;
        this.telefone = telefone;
        
        codigo = codigoContador;
        codigoContador++;
        
    }
    
    @Override
    public String toString() {
        String relatorio = "";
        relatorio += "Código: "+codigo+"\n";
        relatorio += "Nome: "+nome+"\n";
        relatorio += "Bairro: "+bairro+"\n";
        relatorio += "Rua: "+rua+"\n";
        relatorio += "Número: "+numero+"\n";
        relatorio += "CPF: "+cpf+"\n";
        relatorio += "Telefone: "+telefone+"\n";
        return relatorio; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void imprimirDados(){
        System.out.println(toString());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static int getCodigoContador() {
        return codigoContador;
    }

    public static void setCodigoContador(int codigoContador) {
        Cliente.codigoContador = codigoContador;
    }
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getCodigo() {
        return codigo;
    }
    
    
}
