/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavenda;

import telas.TelaPrincipal;
import repositorio.RepositorioDados;

/**
 *
 * @author Douglas
 */
public class SistemaVenda {
    
    public static void main(String[] args) {
        System.out.println("Testando main()");
        
        RepositorioDados.inicializandoDados();
     
        TelaPrincipal tela = new TelaPrincipal();
        
    }
    
    // TAREFAS DA AVALIACAO 1 SERAO PASSADAS EM SALA DE AULA.
    
    // ok
    
}
