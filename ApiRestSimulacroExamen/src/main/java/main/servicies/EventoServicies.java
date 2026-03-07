/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.servicies;

import java.util.List;
import main.model.CompraModel;
import main.model.EventoModel;
import main.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nerea
 */
@Service
public class EventoServicies {

    @Autowired
    public EventoRepository respository;

    public List<EventoModel> listarTodosEventos() {
        return respository.findAll();
    }

    public List<EventoModel> buscaPorIDUsuario(int id) {
        return respository.findByIDUsuario(id);
    }

    public List<EventoModel> buscarPorestado(String estado) {
        return respository.findByEstado(estado);
    }

    public EventoModel guardar(EventoModel eventoModel) {
        return respository.save(eventoModel);
    }

    public void eliminar(int id) {
        respository.deleteById(id);
    }
}
