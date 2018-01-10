/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.unir.plataformas.modelo;

/**
 * Clase para Pedido de farmacia
 * @author casa
 */
public class Pedido {
    private Medicamento medicamento;
    private Integer cantidad;
    private String distribuidor;
    private String sucursalSecundaria;
    private String direccionSecundaria;
    private String sucursalPrincipal;
    private String direccionPrincipal;

    public String getSucursalSecundaria() {
        return sucursalSecundaria;
    }

    public void setSucursalSecundaria(String sucursalSecundaria) {
        this.sucursalSecundaria = sucursalSecundaria;
    }

    public String getDireccionSecundaria() {
        return direccionSecundaria;
    }

    public void setDireccionSecundaria(String direccionSecundaria) {
        this.direccionSecundaria = direccionSecundaria;
    }

    public String getSucursalPrincipal() {
        return sucursalPrincipal;
    }

    public void setSucursalPrincipal(String sucursalPrincipal) {
        this.sucursalPrincipal = sucursalPrincipal;
    }

    public String getDireccionPrincipal() {
        return direccionPrincipal;
    }

    public void setDireccionPrincipal(String direccionPrincipal) {
        this.direccionPrincipal = direccionPrincipal;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }


    
}
