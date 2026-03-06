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
@Table(name = "Evento")
public class EventoModel {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEvento")
    private int id;
    @Column(name = "Titulo")
    private String Titulo;
    @Column(name = "Fecha")
    private String Fecha;
    @Column(name = "Comentario")
    private String Comentario;
    @Column(name = "IDUsuario")
    private int IDUsuario;
    @Column(name = "Estado")
    private String Estado;
    
    public EventoModel() {
    }


    public EventoModel(int IDEvento, String TItulo, String Fecha, String Comentario, int IDUsuario, String Estado) {
        this.id = IDEvento;
        this.Titulo = TItulo;
        this.Fecha = Fecha;
        this.Comentario = Comentario;
        this.IDUsuario = IDUsuario;
        this.Estado = Estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        this.Comentario = comentario;
    }

    public int getIdUsuario() {
        return IDUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.IDUsuario = idUsuario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }

}
