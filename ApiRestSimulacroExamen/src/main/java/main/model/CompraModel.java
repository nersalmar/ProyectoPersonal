/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author nerea
 */
@Entity
@Table(name = "Compra")
public class CompraModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCompra")
    private int IDCompra;
    @Column(name = "Producto")
    private String Producto;
    @Column(name = "Cantidad")
    private int Cantidad;
    @Column(name = "IDUsuario")
    private int IDUsuario;
    @Column(name = "Estado")
    private String Estado;

    public CompraModel() {
    }

    
    public CompraModel(int IDCompra, String Producto, int Cantidad, int IDUsuario, String Estado) {
        this.IDCompra = IDCompra;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.IDUsuario = IDUsuario;
        this.Estado = Estado;
    }

    public int getIDCompra() {
        return IDCompra;
    }

    public void setIDCompra(int IDCompra) {
        this.IDCompra = IDCompra;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }


    
}
