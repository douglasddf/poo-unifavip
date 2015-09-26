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
    
 private String nome;
 private String email;
 private String telefone;
 private String cpf;
 private String funcao;
 private int codigo;
 private static int contador = 1;
 
 public Funcionario(String nome,String email,String telefone,String cpf,String funcao){
   this.codigo = contador;
   contador++;
   this.nome = nome;
   this.cpf = cpf;
   this.email = email;
   this.telefone = telefone;
   this.funcao = funcao;
    
 }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Funcionario.contador = contador;
    }

    @Override
    public String toString() {
    String relatorio = ("\nNome: "+nome+"\nCpf: "+cpf+"\nEmail:"+email+"\nCódigo"+codigo+"\nTelefone: "+telefone+"\nFunção: "+funcao);
    return relatorio ;
    
    }
 

    
}
