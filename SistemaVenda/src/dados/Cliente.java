/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Clésio
 */
public class Cliente {

    private int codigo;
    private String nome;
    private int cpf;
    private int telefone;

    private static int contadorCodigo = 1;

    public Cliente() {
        System.out.println("Construtor default de Cliente");

        codigo = contadorCodigo;

        contadorCodigo++;
    }

    public Cliente(String nome, int cpf, int telefone) {
        codigo = contadorCodigo;
        contadorCodigo++;
        System.out.println("Construtor com argumentos");

        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;

    }

    public void imprimirDados() {

        System.out.println(toString());
    }

    @Override
    public String toString() {

        String relatorio = "";
        relatorio += "Código: " + codigo;
        relatorio += "\nNome: " + nome;
        relatorio += "\nCPF: " + cpf;
        relatorio += "\nTelefone: " + telefone;
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

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
