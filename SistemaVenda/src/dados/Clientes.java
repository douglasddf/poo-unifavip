/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author alunofavip
 */
public class Clientes {
    
    
// ATRIBUTOS
    private int codigo;
    private String nome;
    private String sexo;
    private int cpf;
    private int telefone;
    private String estadocivil;
    private String email;
    
    // variavel auxiliar
    private static int contadorCodigo = 1;
    
    // Construtor default
    public Clientes() {
        System.out.println("Construtor default de Produto");
        
        // criar um código autoincremental
        codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo++;
    }
    
    public Clientes(String nome,
                   String sexo,
                   int cpf, 
                   int telefone,
                   String estadocivil,
                   String email) {
        
                // criar um código autoincremental
        codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo++;
        
        System.out.println("Construtor com argumentos");
        
        
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
        this.estadocivil = estadocivil;
        this.email = email;
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
        relatorio += "\nCpf: "+cpf;
        relatorio += "\nNumero Telefone: "+telefone;        
        relatorio += "\nEstado Civil: "+estadocivil;
        relatorio += "\nEmail: "+email;
        
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
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone (int telefone){
        this.telefone = telefone;
        
        }

    public String getEstadoCivil() {
        return estadocivil;
    }
    
    public void setEstadoCivil(String estadocivil){
        this.estadocivil = estadocivil;
    }
    
    public String getEmail () {
        return email;
    }
    
    public void setEmail (String email){
        this.email = email;
    }
}
    
