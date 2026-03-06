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
@Table(name = "Usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUsuario")
    private int IDUsuario;
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "Password")
    private String Password;

    public UsuarioModel() {

    }

    public UsuarioModel(int IDUsuario, String Nombre, String Password) {
        this.IDUsuario = IDUsuario;
        this.Nombre = Nombre;
        this.Password = Password;
    }

    public int getId() {
        return IDUsuario;
    }

    public void setId(int id) {
        this.IDUsuario = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
