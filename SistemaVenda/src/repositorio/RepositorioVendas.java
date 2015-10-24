/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import dados.Venda;
        

/**
 *
 * @author Douglas
 */
public class RepositorioVendas {
    
    private static ArrayList<Venda>listaVendas = new ArrayList();
 
    
    public static void salvarVenda(Venda v) {
        listaVendas.add(v);
    }
    
    public static ArrayList<Venda> obterVendas() {
        return listaVendas;
    }
}
