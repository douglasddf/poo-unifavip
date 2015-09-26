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

    private int codigo;
    private String nome;
    private String end;
    private double cep;
    private double datanasc;
    private double cpf;
    private double id;
    private String bairro;
    private String estado;
    private String sexo;
    private double tel;

    private static int contadorCodigo = 1;

    public Cliente() {
        System.out.println("Contrutor default de Cliente");
        codigo = contadorCodigo;

        contadorCodigo++;

        this.nome = nome;
        this.end = end;
        this.cep = cep;
        this.datanasc = datanasc;
        this.cpf = cpf;
        this.id = id;
        this.bairro = bairro;
        this.estado = estado;
        this.sexo = sexo;
        this.tel = tel;

    }

    public void imprimirDados() {
        System.out.println(toString());

    }

    public String toString() {
        String relatorio = "";
        relatorio += "Código:" + codigo;
        relatorio += "\nNome:" + nome;
        relatorio += "nEndereco:" + end;
        relatorio += "nCep:" + cep;
        relatorio += "nDatadeNascimento:" + datanasc;
        relatorio += "nCpf:" + cpf;
        relatorio += "nIdentidade:" + id;
        relatorio += "nBairro:" + bairro;
        relatorio += "nEstado:" + estado;
        relatorio += "nSexo:" + sexo;
        relatorio += "nTelefone:" + tel;
        

        return relatorio;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return end;       
    }
    public double getCep(){
      return cep;  
    }
    public double getDataNascimento(){
        return datanasc;
    }
    public double getCpf(){
        return cpf;
    }
    public double getIdentidade(){
        return id;
    }
    public String getBairro(){
        return bairro;
    }
    public String getEstado(){
        return estado;
    }
    public String getSexo(){
        return sexo;
    }
    public double getTelefone(){
        return tel;
    }
    
    
}
