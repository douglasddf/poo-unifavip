/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavenda;

import repositorio.RepositorioDados;
import telas.TelaPrincipal;

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
    
    
}
