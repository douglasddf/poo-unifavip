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
    //Atributos
    private String nomeC;
    private String cpf;
    private String telefone;
    private String email;
    private int codigoC;
    private static int contadorC = 1;

   
  public Cliente(String nome,String cpf,String telefone,String email){
   this.codigoC = contadorC;
   //Atualiza Posicao livre
   contadorC++;
   this.nomeC = nome;
   this.email = email;
   this.cpf = cpf;
   this.telefone = telefone;
   
   
   
      
  }  

    @Override
    public String toString() {
        String relatorio = ("Nome: "+ nomeC + "\nemail: " + email + "\nCpf: " + cpf + "\ntelefone: "+ telefone);
        return relatorio;
    }
    
    
    
    
    
    
    
    public int getCodigo() {
        return codigoC;
    }

    public void setCodigo(int codigo) {
        this.codigoC = codigo;
    }
    
    

    public String getNome() {
        return nomeC;
    }

    public void setNome(String nome) {
        this.nomeC = nome;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
