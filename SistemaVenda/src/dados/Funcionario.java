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
    int codigo;
    private String nome;
    private float cpf;
    private float rg; 
    private double telefone;

    public Funcionario(String nome, float cpf, float rg, double telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCpf() {
        return cpf;
    }

    public void setCpf(float cpf) {
        this.cpf = cpf;
    }

    public float getRg() {
        return rg;
    }

    public void setRg(float rg) {
        this.rg = rg;
    }
    
    
    
}
