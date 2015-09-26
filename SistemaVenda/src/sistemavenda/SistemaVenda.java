/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavenda;

import telas.TelaInicial;
import repositorio.RepositorioDados;
import repositorio.RepositorioDadosCliente;

/**
 *
 * @author Douglas
 */
public class SistemaVenda {
    
    public static void main(String[] args) {
        System.out.println("Testando main()");
        
        RepositorioDados.inicializandoDados();
     
        TelaInicial tela = new TelaInicial();
        
    }
    
    // TAREFAS DA AVALIACAO 1 SERAO PASSADAS EM SALA DE AULA. (previsao 25/ago/2015)
    
    // ok
    
}
