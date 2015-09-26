/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Thiago Luna
 */
public class RepositorioDadosFuncionario {
    
    public static ArrayList<Funcionario> ListaFuncionarios = new ArrayList<>();
    
    public static void adicionarFuncionario (Funcionario funcionario){
        ListaFuncionarios.add(funcionario);
    }
    
    public static Funcionario pesquisarFuncionarioPeloCodigo (int codigo){
        Funcionario f = null;
        for (Funcionario funcionarioAtual : ListaFuncionarios){
            if (funcionarioAtual.getCodigo() == codigo){
                f = funcionarioAtual;
                break;
            }
        }
        return f;
    }
    public static void editarFuncionario (Funcionario f){
        for (Funcionario funcionario : ListaFuncionarios){
            if (funcionario.getCodigo() == funcionario.getCodigo()){
                funcionario = f;
                break;
            }
        }
    }
    
}
