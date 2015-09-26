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

    private int cpf;
    private String nome;
    private String email;
    private String endereco;
    private int cep;
    private String cidade;
    private int telefone;
    private int celular;
    private int id;
    private static int contador = 1;

    public Cliente(String nome, String email, String endereco, int cep, String cidade, int telefone, int celular, int cpf) {

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
        this.cpf = cpf;

    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", cep=" + cep + ", cidade=" + cidade + ", telefone=" + telefone + ", celular=" + celular + ", id=" + id + '}';
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

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


}
