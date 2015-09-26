/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavenda;

import dados.Funcionario;
import java.util.ArrayList;
import telas.TelaPrincipalFuncionario;

/**
 *
 * @author Thiago Luna
 */
public class SistemaFuncionario {
    
    public static ArrayList<Funcionario> ListaFuncionarios = new ArrayList<>();
    
    public static void main(String[] args) {
     
        TelaPrincipalFuncionario tela = new TelaPrincipalFuncionario();
        tela.setVisible(true);
        
    }
    
}
