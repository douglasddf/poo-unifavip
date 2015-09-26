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

    private String cpf;
    private String nome;
    private String email;
    private String endereco;
    private String cep;
    private String cidade;
    private String telefone;
    private String celular;
    private int id;
    private static int contador = 1;

    public Cliente(String nome, String email, String endereco, String cep, String cidade, String telefone, String celular) {

        this.id = id;
        //atualiza e incrementa o id
        id = contador++;

        //atribuindo valores locais para as variaveis globais 
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.cep = cep;
        this.cidade = cidade;
        this.celular = celular;
        this.telefone = telefone;

    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + "/n email=" + email + "/n endereco=" + endereco + "/n cep=" + cep + "/n cidade=" + cidade + "/n telefone=" + telefone + "/n celular=" + celular;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
