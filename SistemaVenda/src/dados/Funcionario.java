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
public class Funcionario {
    
    int codigo;
    String nome;
    String cargo;
    String cpf;
    String telefone;
    String contabancaria;
    
    private static int codigoContador = 1;

    public Funcionario(String nome, String cargo, String cpf, String telefone, String contabancaria) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.telefone = telefone;
        this.contabancaria = contabancaria;
        
        codigo = codigoContador;
        codigoContador++;
    }
    
    @Override
    public String toString() {
        String relatorio = "";
        relatorio += "Código: "+codigo+"\n";
        relatorio += "Nome: "+nome+"\n";
        relatorio += "Cargo: "+cargo+"\n";
        relatorio += "CPF: "+cpf+"\n";
        relatorio += "Telefone: "+telefone+"\n";
        relatorio += "Conta Bancária: "+contabancaria+"\n";
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getContabancaria() {
        return contabancaria;
    }

    public void setContabancaria(String contabancaria) {
        this.contabancaria = contabancaria;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
}
