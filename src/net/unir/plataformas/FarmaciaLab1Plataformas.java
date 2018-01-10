/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.unir.plataformas;

/**
 *
 * @author casa
 */
public class FarmaciaLab1Plataformas {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FarmaciaLab1Plataformas f = new FarmaciaLab1Plataformas();
         Formulario formulario = new Formulario();
         formulario.setVisible(true);
     FormPedido pedido = new FormPedido();
     formulario.pedido = pedido;
    }
    
}
