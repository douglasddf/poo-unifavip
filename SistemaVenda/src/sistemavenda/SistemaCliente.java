/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavenda;

import dados.Cliente;
import java.util.ArrayList;
import repositorio.RepositorioDadosCliente;
import telas.TelaPrincipalCliente;

/**
 *
 * @author Thiago Luna
 */
public class SistemaCliente {
    
     public static ArrayList<Cliente> ListaClientes = new ArrayList<>();
    
    public static void main(String[] args) {
     
        TelaPrincipalCliente tela = new TelaPrincipalCliente();
        tela.setVisible(true);
        
    }
    
}
